package portfolio.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Override
    public boolean validateUser(String name, String password) {
        return name.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password");
    }
}
