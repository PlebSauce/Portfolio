package portfolio.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import portfolio.demo.entity.ProjectEntity;
import portfolio.demo.service.ProjectService;

@CrossOrigin
@Controller
public class ProjectsController {

    private final ProjectService projectService;

    public ProjectsController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public String listProjects(Model model){

        List<ProjectEntity> projects = projectService.getAllProjects(); //add logic
        model.addAttribute("projects", projects);
        return "projects";
    }

}
