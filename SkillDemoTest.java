import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {
    @Test
    public void tester(){
        int expected = 2;
        int actual = SkillDemo.divide(4, 3);
        assertEquals(expected, actual);
    }
}
