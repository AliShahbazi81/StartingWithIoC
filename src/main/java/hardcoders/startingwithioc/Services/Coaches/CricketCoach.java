package hardcoders.startingwithioc.Services.Coaches;

import org.springframework.stereotype.Component;

@Component
// @Lazy means that this class will be loaded only when it is needed
//@Lazy
public class CricketCoach implements ICoach{

    public CricketCoach()
    {
        System.out.println("CricketCoach: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
