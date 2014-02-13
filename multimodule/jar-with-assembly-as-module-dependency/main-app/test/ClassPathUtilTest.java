import org.junit.Test;
import play.test.UnitTest;

import utils.ClassPathUtil;

public class ClassPathUtilTest extends UnitTest {

    @Test
    public void getMessageTest() {
        assertEquals("bar", ClassPathUtil.getMessage());
    }

}
