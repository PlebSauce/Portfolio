package portfolio.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.demo.entity.UserEntity;
import portfolio.demo.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @Override
    public UserEntity findById(long theId) {
        
        Optional<UserEntity> result = userRepository.findById(theId);
        UserEntity theUser = null;
        
        if(result.isPresent()) {
            theUser = result.get();
        }
        else {
            return null;
        }
        return theUser;
    }
    
    public List<UserEntity> findAll() {
        return (List<UserEntity>)userRepository.findAll();
    }

    
    public List<UserEntity> listAll(String key){
        if(key != null){
            return userRepository.search(key);
        }
        return (List<UserEntity>) userRepository.findAll();
    }
}
