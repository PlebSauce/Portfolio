package portfolio.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import portfolio.demo.entity.ProjectEntity;

public interface ProjectRepository extends CrudRepository<ProjectEntity, Long>{

    @Query("SELECT p FROM ProjectEntity p WHERE p.name LIKE %?1%")
    public List<ProjectEntity> search(String key);

}
