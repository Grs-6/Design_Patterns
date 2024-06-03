public class Main {

    public static void main(String[] args) {

        SupportHandler frontlineSupport = new FrontlineSupportHandler();
        SupportHandler technicalSupport = new TechnicalSupportHandler();
        SupportHandler managerialSupport = new ManagerialSupportHandler();

        frontlineSupport.setNextHandler(technicalSupport);
        technicalSupport.setNextHandler(managerialSupport);

        SupportRequest request1 = new SupportRequest("Password reset", "low");
        SupportRequest request2 = new SupportRequest("System outage", "medium");
        SupportRequest request3 = new SupportRequest("Data breach", "high");

        frontlineSupport.handleRequest(request1);  
        frontlineSupport.handleRequest(request2);
        frontlineSupport.handleRequest(request3);
    }
}
