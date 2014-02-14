import org.junit.*;
import java.util.*;
import play.test.*;
//import models.*;

public class BasicTest extends UnitTest {

    @Test
    public void aVeryImportantThingToTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void failingTest() {
        assertEquals(3, 1 + 1);
    }

}
