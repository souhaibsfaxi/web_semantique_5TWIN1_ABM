package Controller;
import model.RdfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtController {
    private RdfModel rdfModel;

    public ArtController(RdfModel rdfModel) {
        this.rdfModel = rdfModel;
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody UserJobDTO userJobDTO) {
        Model model = rdfModel.getModel();
        Resource userResource = model.createResource(userJobDTO.getUserUri());
        Resource jobResource = model.createResource(userJobDTO.getJobUri());

        Property worksInProperty = model.createProperty("http://example.org/worksIn");

        userResource.addProperty(worksInProperty, jobResource);

        return "User added with job relationship.";
    }
}
