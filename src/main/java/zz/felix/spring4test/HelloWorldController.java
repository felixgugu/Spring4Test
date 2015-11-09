package zz.felix.spring4test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * http://127.0.0.1:8080/Spring4Test/mvc/helloWorld
 * 
 * @author felix
 *
 */
@Controller
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model) {
        
        
        System.out.println("\n\n####helloWorld#####\n\n");
        
        model.addAttribute("message", "Hello World!");
        return "helloWorld";
    }
}
