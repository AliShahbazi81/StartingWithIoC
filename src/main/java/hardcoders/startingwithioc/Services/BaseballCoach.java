package hardcoders.startingwithioc.Services;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
// @Lazy means that this class will be loaded only when it is needed
//@Lazy
public class BaseballCoach implements ICoach{

    public BaseballCoach() {
        System.out.println("BaseballCoach: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}
