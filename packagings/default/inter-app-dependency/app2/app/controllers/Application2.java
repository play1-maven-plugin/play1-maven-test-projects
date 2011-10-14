package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

public class Application2 extends Application1 {

    public static void index() {
        String multiline = "a\nb\n\nc\n\n\n\n\n\n";
        render(multiline);
    }

}