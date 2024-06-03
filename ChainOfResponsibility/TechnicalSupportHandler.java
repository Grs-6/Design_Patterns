public class TechnicalSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getSeverity().equalsIgnoreCase("medium")) {
            System.out.println("Technical Support: Handling request - " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
