package portfolio.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import portfolio.demo.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long>{
    
    public List<UserEntity> search(String key);
}
