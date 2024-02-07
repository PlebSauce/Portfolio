package portfolio.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import portfolio.demo.service.ProjectService;

@Controller
@CrossOrigin
public class ProjectsController {

    private ProjectService projectService;

    public ProjectsController(ProjectService projectService){
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public String listProjects(){
        return "projects";
    }

}
