package portfolio.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import portfolio.demo.service.LoginService;

@Controller
@SessionAttributes("name")
public class LoginController {

    private LoginService loginService;

    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }
    
    @GetMapping("/login")
    public String showLoginPage(Model model) {
        return "login";
    }

    @PostMapping("/login")
    public String showMainScreen(Model model, @RequestParam String name, @RequestParam String password) {

        boolean isValidUser = loginService.validateUser(name, password);

        if (!isValidUser) {
            model.addAttribute("errorMessage", "Access Denied, Invalid Credentials");
            return "login";
        }

        model.addAttribute("name", name);
        model.addAttribute("password", password);

        return "mainscreen";
    }

    @GetMapping("/logout")
    public String showLogoutPage(Model model) {
        return "redirect:/login";
    }
}
