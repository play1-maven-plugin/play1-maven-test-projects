package controllers;

import play.modules.spring.Spring;
import play.mvc.Controller;
import springtester.Person;

public class Application extends Controller {

    public static void index() {
        Person person = Spring.getBeanOfType(Person.class);
        boolean canVote = person.canVote();
        render(canVote);
    }

}
