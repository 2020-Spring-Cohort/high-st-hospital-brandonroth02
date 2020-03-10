
public abstract class Employee {
    public static String getName;
    protected int employeeSalary;
    private static String name;
    public String Specialization;
    protected int payAmount;
    public int IdNumber;

    public Employee(String name, int EmployeeSalary) {
        this.name = name;
        this.employeeSalary = EmployeeSalary;
        this.IdNumber = IdNumber;
    }

    public Employee(String name, int employeeSalary, int IdNumber) {
    }


    public String getSpecialization() {
        return Specialization; }
    
    public static String getName() {return name; }

    public int getPayRate() {return employeeSalary; }

    public int getPayAmount() {return payAmount; }

    public int getIdNumber() { return IdNumber;
    }

    public abstract void receivePay();
    
    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeSalary = $" +
                ", name = '" + name + ", idNumber = '" + getIdNumber();

    }



}