
public abstract class Employee {
    public static String name;
    protected int employeeSalary;
    public String Specialization;
    protected int payAmount;
    public int IdNumber;

    public Employee(String name, int EmployeeSalary, int IdNumber) {
        Employee.name = name;
        this.employeeSalary = EmployeeSalary;
    }

    public Employee(String name, int payAmount) {
        Employee.name = name;
        this.payAmount = payAmount;
    }


    public String getSpecialization() {
        return Specialization; }
    
    public static String getName() {return name; }
    

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


    public int getSalaryAmount() {
        return 100;
    }


}