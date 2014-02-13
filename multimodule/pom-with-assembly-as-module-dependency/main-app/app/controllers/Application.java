package controllers;

import play.mvc.Controller;

import utils.AppUtil;

public class Application extends Controller {

    public static void index() {
        String message = AppUtil.getMessage();
        render(message);
    }

}