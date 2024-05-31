public class Main {
    public static void main(String[] args) {
        Intern intern1 = new Intern("Alice","frontEnd Developer");
        fullTimeEmployee fullTime1 = new fullTimeEmployee("Bob","backEnd Developer");
        // fullTimeEmployee fullTime3 = new fullTimeEmployee("backEnd Developer");

        //clonning intern1 to create intern2
        Intern intern2 = (Intern) intern1.clone();
        intern2.setName("Charlie");
        intern2.setRole("QA Tester");

        //clonning fullTime1 to create fullTime2
        fullTimeEmployee fullTime2 = (fullTimeEmployee) fullTime1.clone();
        fullTime2.setName("Dave");
        fullTime2.setRole("UI/Ux Designer");;


        // Display access levels
        intern1.showAccess();
        intern2.showAccess();

        fullTime1.showAccess();
        fullTime2.showAccess();
    }
}
