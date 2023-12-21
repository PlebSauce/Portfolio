package portfolio.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import portfolio.demo.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long>{
    
    @Query("SELECT p FROM UserEntity p WHERE p.name LIKE %?1%")
    public List<UserEntity> search(String key);
}
