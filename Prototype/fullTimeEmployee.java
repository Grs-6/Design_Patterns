class fullTimeEmployee implements IEmployee {
    private boolean zohoPeopleAcess =true;
    private boolean sensitiveDataAccess=true;
    private String contractType="fullTime";
    public String role= "SDE";
    public String name;

    public fullTimeEmployee(String name, String role) {
        this.role=role;
        this.name=name;
    }

    private fullTimeEmployee( String role) {
        this.role=role;
    }

    @Override
    public IEmployee clone() {
        return new fullTimeEmployee(this.role);
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