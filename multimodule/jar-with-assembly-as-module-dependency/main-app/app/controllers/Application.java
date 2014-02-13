package controllers;

import play.mvc.Controller;

import utils.AppUtil;
import utils.ClassPathUtil;

public class Application extends Controller {

    public static void index() {
        String message = AppUtil.getMessage();
        String message2 = ClassPathUtil.getMessage();

        render(message, message2);
    }

}