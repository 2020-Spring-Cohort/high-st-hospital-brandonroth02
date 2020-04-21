import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee underTest;

    @BeforeEach
    void setUp(){
        underTest = new Employee("TESTNAME", 100) {
            @Override
            public void receivePay() {

            }
        };
    }

    @Test
    public void shouldHaveName(){
        String result = Employee.getName();
        assertEquals(getTestname(),result);
    }

    private String getTestname() {
        return "TESTNAME";
    }

    @Test
    public void shouldHaveAnotherName(){
        Employee underTest = new Employee("BILLIAM", 100) {
            @Override
            public void receivePay() {

            }
        };
        String result = Employee.getName();
        Assertions.assertEquals( "billiam",result);
    }

    @Test
    public void shouldHaveSalary(){
        int salary = underTest.getSalaryAmount();
        assertEquals( 100, salary);
    }

    @Test
    void getSpecialization() {
    }

    @Test
    void getName() {
    }

    @Test
    void getPayRate() {
    }

    @Test
    void getPayAmount() {
    }

    @Test
    void getIdNumber() {
    }

    @Test
    void receivePay() {
    }

    @Test
    void testToString() {
    }

    @Test
    void getSalaryAmount() {
    }

    @Test
    void getEmployeeSalary() {
    }

    @Test
    void testToString1() {
    }
}
