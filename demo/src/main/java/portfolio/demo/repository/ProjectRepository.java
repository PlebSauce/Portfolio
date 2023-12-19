package portfolio.demo.repository;

import org.springframework.data.repository.CrudRepository;
import portfolio.demo.entity.ProjectEntity;

public interface ProjectRepository extends CrudRepository<ProjectEntity, Long>{

}
