package hardcoders.startingwithioc.config;

import hardcoders.startingwithioc.Services.Coaches.ICoach;
import hardcoders.startingwithioc.Services.Coaches.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public ICoach swimCoach() {
        return new SwimCoach();
    }
}
