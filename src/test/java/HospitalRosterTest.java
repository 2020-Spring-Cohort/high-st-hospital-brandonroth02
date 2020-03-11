import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HospitalRosterTest {
    private HospitalRoster underTest;
    private Employee testEmployee;

    @BeforeEach
    void setUp() {
        underTest = new HospitalRoster();
        testEmployee = new Employee("TestEmployee", 100) {
            @Override
            public void receivePay() {

            }
        };
        underTest.hire(testEmployee);
    }

    @Test
    public  void  listOfEmployees(){
        ArrayList<Employee> retrievedEmployee = underTest.retrieveEmployeeList();
        assertEquals( 1, retrievedEmployee.size());
    }
    @Test
    public void shouldPayAllEmployees(){
        underTest.payEmployees();
        ArrayList<Employee> retrievedEmployees = underTest.retrieveEmployeeList();
        assertTrue(retrievedEmployees.get());
    }

}
