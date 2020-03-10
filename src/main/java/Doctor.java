

public class Doctor extends Employee{

    public Doctor(String name, int EmployeeSalary, String Specialization) {
        super (name, EmployeeSalary); }

        @Override
    public void receivePay(){ employeeSalary += payAmount; }



}

