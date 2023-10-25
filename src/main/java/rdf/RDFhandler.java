package rdf;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.query.Query;
import org.apache.jena.query.QueryExecution;
import org.apache.jena.query.QueryExecutionFactory;
import org.apache.jena.query.QueryFactory;
import org.apache.jena.query.ResultSet;

public class RDFhandler {
    private Model rdfModel;

    public RDFhandler() {
        // Create an in-memory Jena model
        rdfModel = ModelFactory.createDefaultModel();
    }

    // You can also load data into the model from a file or an external source.
    public void loadData(String dataFile) {
        rdfModel.read(dataFile);
    }

    public ResultSet executeSPARQLQuery(String sparqlQuery) {
        Query query = QueryFactory.create(sparqlQuery);
        try (QueryExecution qexec = QueryExecutionFactory.create(query, rdfModel)) {
            ResultSet results = qexec.execSelect();
            return results;
        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }
}

