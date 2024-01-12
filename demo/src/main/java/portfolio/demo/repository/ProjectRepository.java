package portfolio.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import portfolio.demo.entity.ProjectEntity;

import java.util.List;

public interface ProjectRepository extends CrudRepository<ProjectEntity, Long>{

    @Query("SELECT p FROM ProjectEntity p WHERE p.name LIKE %?1%")
    public List<ProjectEntity> search(String key);

}
