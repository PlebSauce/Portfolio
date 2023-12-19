package portfolio.demo.repository;

import org.springframework.data.repository.CrudRepository;
import portfolio.demo.entity.UserEntity;

public interface UserRepository extends CrudRepository<UserEntity, Long>{

}
