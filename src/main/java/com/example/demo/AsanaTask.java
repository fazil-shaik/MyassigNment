import lombok.Data;

@Data
public class AsanaTask {
    private String taskId;
    private String name;
    private String assignee;
    private String dueDate;
    private String description;
}
