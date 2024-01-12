package portfolio.demo.service;

import portfolio.demo.entity.ProjectEntity;

import java.util.List;

public interface ProjectService {

    public ProjectEntity findById(long theId);

    public List<ProjectEntity> listAll(String key);

    public List<ProjectEntity> findAll();
    
}