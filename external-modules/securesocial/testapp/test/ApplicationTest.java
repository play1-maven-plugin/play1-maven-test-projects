import org.junit.*;
import play.test.*;
import play.mvc.*;
import play.mvc.Http.*;
//import models.*;

public class ApplicationTest extends FunctionalTest {

    @Test
    public void testThatIndexPageWorks() {
        Response response = GET("/");
        assertStatus(Http.StatusCode.FOUND, response);
        assertEquals("/auth/login", response.getHeader("Location"));
        response = GET("/auth/login");
        assertIsOk(response);
        assertContentType("text/html", response);
        assertCharset(play.Play.defaultWebEncoding, response);
    }
    
}