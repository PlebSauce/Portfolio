package portfolio.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import portfolio.demo.entity.ProjectEntity;
import portfolio.demo.service.ProjectService;

@RequestMapping("/api/projects")
public class GetProjectsController {

    private final ProjectService projectService;

    public GetProjectsController(ProjectService projectService){
        this.projectService = projectService;
    }
    public List<ProjectEntity> getAllProjects() {
        return projectService.findAll();
    }
    
}
