package portfolio.demo.service;

import java.util.List;
import portfolio.demo.entity.ProjectEntity;

public interface ProjectService {

    public ProjectEntity findById(long theId);

    public List<ProjectEntity> listAll(String key);

    public List<ProjectEntity> findAll();
    
}