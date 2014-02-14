package utils;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassPathUtilTest {

    @Test
    public void getMessageTest() {
        assertEquals("bar", ClassPathUtil.getMessage());
    }

}
