package hardcoders.startingwithioc.config;

import hardcoders.startingwithioc.Services.ICoach;
import hardcoders.startingwithioc.Services.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public ICoach swimCoach() {
        return new SwimCoach();
    }
}
