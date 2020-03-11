import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {

    private Employee underTest;

    @BeforeEach
    void setUp(){
        underTest = new Employee( "TESTNAME", 100);
    }

    @Test
    public void shouldHaveName(){
        String result = underTest.getName();
        assertEquals("TESTNAME",result);
    }

    @Test
    public void shouldHaveAnotherName(){
        Employee underTest = new Employee( "BILLIAM", 100);
        String result = underTest.getName();
        assertEquals( "BILLIAM",result);
    }

    @Test
    public void shouldHaveSalary(){
        int salary = underTest.getPayAmount();
        assertEquals( 100, salary);
    }

}
