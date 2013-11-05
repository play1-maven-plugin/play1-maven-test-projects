import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
//import models.*;

public class App1ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertIsOk(response);
        assertContentType("text/html", response);
        assertCharset(play.Play.defaultWebEncoding, response);
    }
    
}