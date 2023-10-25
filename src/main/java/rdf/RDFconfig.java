package rdf;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RDFconfig {
    @Bean
    public Model rdfModel() {
        // Initialize your RDF model, load data, etc.
        return ModelFactory.createDefaultModel();
    }
}
