import lombok.Data;

@Data
public class AirtableRecord {
    private String id;
    private Fields fields;

    @Data
    public static class Fields {
        private String taskId;
        private String name;
        private String assignee;
        private String dueDate;
        private String description;
    }
}
