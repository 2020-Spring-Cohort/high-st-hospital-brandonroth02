public class  HospitalApplication {


    public static void main(String[] args) {
        Doctor doctor = new Doctor("Acula", 90000, "Throat");
        Janitor janitor = new Janitor("Freddy", 40000);
        Nurse nurse = new Nurse( "Ratched", 50000);
        Receptionist receptionist = new Receptionist("Pam", 45000);
        Patient patient = new Patient("Conrad");
        HospitalRoster payroll = new HospitalRoster();
        payroll.hire(doctor);
        payroll.hire(janitor);
        payroll.hire(nurse);
        payroll.hire(receptionist);



        System.out.println("The employees of the hospital are as follows:");
        System.out.println(payroll.retrieveEmployeeList());
        payroll.payAllEmployees();
        for (Employee employee: payroll.retrieveEmployeeList()) {
            System.out.println(employee);
        }
        System.out.println(payroll.retrieveEmployeeList());














































    }
}
