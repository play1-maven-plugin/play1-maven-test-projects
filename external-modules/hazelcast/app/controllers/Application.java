package controllers;

import static java.util.Arrays.asList;

import java.util.Queue;

import javax.inject.Named;

import org.apache.commons.lang.StringUtils;

import play.mvc.Controller;

public class Application extends Controller {
	
	@Named("MyQueue")
	private static Queue<String> queue;
	
    public static void index() {
    	if(queue == null){
    		error("Queue is NULL");
    	}
    	
    	queue.addAll(asList("A","B","C","D"));
    	
        renderText(StringUtils.join(queue.toArray(), ", "));
    }

}