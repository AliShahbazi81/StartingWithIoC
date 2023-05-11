package hardcoders.startingwithioc.Controllers;

import hardcoders.startingwithioc.Services.Coaches.ICoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// @RestController means that this class is a controller
@RestController
public class DemoController {
    private final ICoach _coach;

    // !Whenever we have only 1 constructor, writing @AutoWired is not necessary
    @Autowired // -> AutoWired annotation tells Spring to inject a dependency
    // Define a constructor for Dependency Injections
    // For avoiding ambiguous, we can either use @Qualifier or @Primary
    // ! We can use @Primary just once for subclasses of the Interface
    public DemoController(@Qualifier("aquatic") ICoach coach) {
        _coach = coach;
    }

    @GetMapping("/DailyWorkout")
    public String getDailyWorkout()
    {
        return _coach.getDailyWorkout();
    }
}
