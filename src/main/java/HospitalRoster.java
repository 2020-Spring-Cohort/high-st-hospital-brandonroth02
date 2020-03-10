import java.util.ArrayList;
import java.util.HashMap;



public class HospitalRoster {
    private HashMap<String, Employee> employeeList = new HashMap<>();

    public ArrayList<Employee> retrieveEmployeeList() {
        return new ArrayList<>(employeeList.values());
    }

    public void payEmployees() {
        for (Employee employeeToBePaid : employeeList.values()) {
            employeeToBePaid.receivePay();
        }
    }
    public Employee retrieveEmployee(String employee) { return employeeList.get(employee);}
}
