import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService {
    @Autowired
    private AsanaService asanaService;

    @Autowired
    private AirtableService airtableService;

    public AirtableRecord integrateNewAsanaTask(String taskId) {
        AsanaTask asanaTask = asanaService.getTaskDetails(taskId);
        AirtableRecord airtableRecord = airtableService.createAirtableRecord(asanaTask);
        return airtableRecord;
    }
}
