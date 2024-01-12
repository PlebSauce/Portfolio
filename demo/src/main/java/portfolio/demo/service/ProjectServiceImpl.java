package portfolio.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import portfolio.demo.entity.ProjectEntity;
import portfolio.demo.repository.ProjectRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectServiceImpl implements ProjectService {
    private ProjectRepository projectRepository;

    @Autowired
    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }
    
    @Override
    public ProjectEntity findById(long theId) {
        
        Optional<ProjectEntity> result = projectRepository.findById(theId);
        ProjectEntity theProject = null;
        
        if(result.isPresent()) {
            theProject = result.get();
        }
        else {
            return null;
        }
        return theProject;
    }
    
    public List<ProjectEntity> findAll() {
        return (List<ProjectEntity>)projectRepository.findAll();
    }

    public List<ProjectEntity> listAll(String key){
        if (key != null){
            return projectRepository.search(key);
        }
        return (List<ProjectEntity>) projectRepository.findAll();
    }
}
