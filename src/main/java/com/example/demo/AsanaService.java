import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AsanaService {
    @Value("${asana.api.token}")
    private String asanaApiToken;

    public AsanaTask getTaskDetails(String taskId) {
        // Implement fetching task details from Asana using the API
        // Return an AsanaTask object
        return null;
    }
}
