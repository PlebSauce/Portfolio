package portfolio.demo.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import portfolio.demo.entity.ProjectEntity;
import portfolio.demo.repository.ProjectRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    
    private final ProjectRepository projectRepository;
    
    public BootStrapData(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }
    @Override
    public void run(String... args) throws Exception {
    
        if (projectRepository.count() == 0){
            ProjectEntity project1 = new ProjectEntity();
            //project1.setId((long)1);
            project1.setName("Next Chess Move Machine Learning");
            project1.setDetails("This is just some example description to fill in later!");
            project1.setStartDate("1/15/2024");
            projectRepository.save(project1);

            ProjectEntity project2 = new ProjectEntity();
            //project2.setId((long)2);
            project2.setName("A different example");
            project2.setDetails("This is just some example description to fill in later! But this one is going to have some more than the other...");
            project2.setStartDate("5/25/2023");
            projectRepository.save(project2);
        }
    }
}
