import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions;



public class JanitorTest {

    @Test
    public void janitorIsSweeping(){
        Janitor underTest = new Janitor("Freddy", 40000);
        underTest.Sweep();
        boolean result = underTest.getIsSweeping();
    }
}
