public class ManagerialSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getSeverity().equalsIgnoreCase("high")) {
            System.out.println("Managerial Support: Handling request - " + request.getDescription());
        }
    }
}
