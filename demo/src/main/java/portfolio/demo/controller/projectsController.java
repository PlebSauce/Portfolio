package portfolio.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@CrossOrigin
public class projectsController {
    
    @GetMapping("/projects")
    public String listProjects(){
        return "projects";
    }

}
