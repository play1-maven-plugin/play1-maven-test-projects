package springtester;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class Person {
    // Here we are injecting the AgeCalculator into the Person class
    @Resource private AgeCalculator ageCalculator;

    public boolean canVote() {
        int age = ageCalculator.calculate("1-January-1980");
        return age >= 18;
    }
}
