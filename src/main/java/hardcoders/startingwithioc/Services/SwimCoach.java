package hardcoders.startingwithioc.Services;

public class SwimCoach implements ICoach{
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
