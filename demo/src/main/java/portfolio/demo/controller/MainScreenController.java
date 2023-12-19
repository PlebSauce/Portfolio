package portfolio.demo.controller;

import org.hibernate.mapping.List;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.demo.service.*;
import portfolio.demo.entity.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class MainScreenController {
    
    private UserService userService;

    private ProjectService projectService;

    public MainScreenController(UserService userService, ProjectService projectService){
        this.userService = userService;
        this.projectService = projectService;
    }

    public String listUsersAndProjects(Model theModel, @Param("userkey") String userkey, @Param("projectkey") String projectkey){

        java.util.List<UserEntity> userList = userService.listAll(userkey);
        theModel.addAttribute("users", userList);
        theModel.addAttribute("userkey", userkey);

        java.util.List<ProjectEntity> projectList = projectService.listAll(userkey);
        theModel.addAttribute("projects", projectList);
        theModel.addAttribute("projectkey", projectkey);
        return "mainscreen";
    }
}
