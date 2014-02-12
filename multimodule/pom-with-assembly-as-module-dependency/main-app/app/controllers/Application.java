package controllers;

import play.mvc.Controller;

import utils.Util;

public class Application extends Controller {

    public static void index() {
        Util util = new Util(); // class from "dep-module" dependency
        String message = Util.getMessage();
        render(message);
    }

}