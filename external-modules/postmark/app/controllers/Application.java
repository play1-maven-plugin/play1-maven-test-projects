package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import jobs.postmark.PostmarkSender;

//import models.*;

public class Application extends Controller {

    public static void index() {
    	PostmarkSender.sendMail(
    			// To
    			"luke@space.com", 
    			// Subject
    			"Hello my son", 
    			// Body
    			"How are you? I am fine, although a bit lonely :|"
    	);
        renderText("Mail sent!");
    }

}