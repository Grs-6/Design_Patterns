public class FrontlineSupportHandler extends SupportHandler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getSeverity().equalsIgnoreCase("low")) {
            System.out.println("Frontline Support: Handling request - " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
