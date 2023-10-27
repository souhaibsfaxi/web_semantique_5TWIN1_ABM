package model;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.springframework.stereotype.Component;

@Component
public class RdfModel {
    private Model model;

    public RdfModel() {
        model = ModelFactory.createDefaultModel();
        // Load existing RDF data or create it here.
    }

    public Model getModel() {
        return model;
    }
}
