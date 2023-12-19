package portfolio.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import portfolio.demo.entity.ProjectEntity;

public interface ProjectRepository extends CrudRepository<ProjectEntity, Long>{

    public List<ProjectEntity> search(String key);

}
