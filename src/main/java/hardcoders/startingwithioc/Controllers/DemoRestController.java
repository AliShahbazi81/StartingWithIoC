package hardcoders.startingwithioc.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class DemoRestController {

    // Add code for the /Hello endpoint
    @GetMapping("/Hello")
    public String HelloWorld()
    {
        return "Hello World!";
    }
}
