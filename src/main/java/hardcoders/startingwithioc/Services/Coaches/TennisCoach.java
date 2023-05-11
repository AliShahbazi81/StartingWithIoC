package hardcoders.startingwithioc.Services.Coaches;

import org.springframework.stereotype.Component;

@Component
// @Lazy means that this class will be loaded only when it is needed
//@Lazy
public class TennisCoach implements ICoach{

    public TennisCoach()
    {
        System.out.println("TennisCoach: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
