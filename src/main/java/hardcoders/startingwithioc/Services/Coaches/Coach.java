package hardcoders.startingwithioc.Services.Coaches;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//! @Component informs the Spring that this class in part of Dependency Injection
@Component
// @Lazy means that this class will be loaded only when it is needed
@Lazy
public class Coach implements ICoach{

    @Override
    public String getDailyWorkout() {
        return "Here is your daily routine workout!";
    }
}
