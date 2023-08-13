import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegrationController {
    @Autowired
    private IntegrationService integrationService;

    @PostMapping("/integrate")
    public AirtableRecord integrateTask(@RequestBody AsanaTask task) {
        return integrationService.integrateNewAsanaTask(task.getTaskId());
    }
}
