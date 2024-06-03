public class SupportRequest {
    private String description;
    private String severity;

    public SupportRequest(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() {
        return description;
    }

    public String getSeverity() {
        return severity;
    }
}
