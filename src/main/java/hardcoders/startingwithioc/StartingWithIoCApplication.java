package hardcoders.startingwithioc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StartingWithIoCApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartingWithIoCApplication.class, args);
    }

    // From the Spring Boot Framework
    // Executed after the Spring Beans have been loaded
    @Bean
    public CommandLineRunner commandLineRunner(String[] args)
    {
        return runner -> {
            System.out.println("Hello World!");
        };
    }

}
