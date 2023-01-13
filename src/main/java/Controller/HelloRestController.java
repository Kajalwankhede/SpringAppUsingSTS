package Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

    // curl localhost:8080/ -w "\n"
    @RequestMapping( "/" )
    public String index() {
        return "Hello from BridgeLabz";
    }
}