package portfolio.demo.controller;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import portfolio.demo.entity.ProjectEntity;
import portfolio.demo.entity.UserEntity;
import portfolio.demo.service.ProjectService;
import portfolio.demo.service.UserService;

@Controller
@CrossOrigin
@RequestMapping("/")
public class MainScreenController {
    
    private UserService userService;

    private ProjectService projectService;

    public MainScreenController(UserService userService, ProjectService projectService){
        this.userService = userService;
        this.projectService = projectService;
    }

    @GetMapping("/mainscreen")
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
