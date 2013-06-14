import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
//GS import models.*;

public class ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertIsOk(response);
        //GS assertContentType("text/html", response);
        assertContentType("text/plain; charset=utf-8", response);
        assertCharset(play.Play.defaultWebEncoding, response);
    }
    
}