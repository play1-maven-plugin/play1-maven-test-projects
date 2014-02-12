import org.junit.Test;
import play.test.UnitTest;
import utils.Util;

public class UtilTest extends UnitTest {

    @Test
    public void getMessageTest() {
        assertEquals("foo", Util.getMessage());
    }

}
