class Intern implements IEmployee {
    private boolean zohoPeopleAcess =false;
    private boolean sensitiveDataAccess=false;
    private String contractType="Intern";
    public String role= "SDE";
    public String name;

    public Intern(String name, String role) {
        this.role=role;
        this.name=name;
    }

    private Intern(String role) {
        this.role=role;
    }

    @Override
    public IEmployee clone() {
        return new Intern(this.role);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role){
        this.role=role;
    }
    

    @Override
    public void showAccess() {
        System.out.println("Employee Name: " + name );
        System.out.println("Role: " + role );
        System.out.println("zoho people access: " + zohoPeopleAcess );
        System.out.println("sensitive data access: " + sensitiveDataAccess );
        System.out.println("Contract Type: " +contractType );
        System.out.println("\n\n" );



    }
}