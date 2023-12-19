package portfolio.demo.service;

import java.util.List;
import portfolio.demo.entity.UserEntity;

public interface UserService {

    public UserEntity findById(long theId);

    public List<UserEntity> findAll();

    public List<UserEntity> listAll(String key);
}