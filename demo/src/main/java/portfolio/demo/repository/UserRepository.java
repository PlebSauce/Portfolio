package portfolio.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import portfolio.demo.entity.UserEntity;

import java.util.List;

public interface UserRepository extends CrudRepository<UserEntity, Long>{
    
    @Query("SELECT p FROM UserEntity p WHERE p.name LIKE %?1%")
    public List<UserEntity> search(String key);
}
