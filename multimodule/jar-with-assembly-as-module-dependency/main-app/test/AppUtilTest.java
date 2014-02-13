import org.junit.Test;
import play.test.UnitTest;

import utils.AppUtil;

public class AppUtilTest extends UnitTest {

    @Test
    public void getMessageTest() {
        assertEquals("foo", AppUtil.getMessage());
    }

}
