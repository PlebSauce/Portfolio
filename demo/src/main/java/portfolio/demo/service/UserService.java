package portfolio.demo.service;

import portfolio.demo.entity.UserEntity;

import java.util.List;

public interface UserService {

    public UserEntity findById(long theId);

    public List<UserEntity> findAll();

    public List<UserEntity> listAll(String key);
}