package controllers;

import play.*;
import play.cache.Cache;
import play.mvc.*;

import java.util.*;

//import models.*;

public class Application extends Controller {

    public static void index() {
        Cache.add("key", "value 1");

        String multiline = "a\nb\n\nc\n\n\n\n\n\n";
        render(multiline);
    }

}