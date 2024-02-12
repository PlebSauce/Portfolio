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
            project1.setUrl("https://github.com/PlebSauce/ChessMachineLearning");
            projectRepository.save(project1);

            ProjectEntity project2 = new ProjectEntity();
            //project2.setId((long)2);
            project2.setName("A different example");
            project2.setDetails("This is just some example description to fill in later! But this one is going to have some more than the other...");
            project2.setStartDate("5/25/2023");
            projectRepository.save(project2);

            ProjectEntity project3 = new ProjectEntity();
            //project2.setId((long)2);
            project3.setName("A different example");
            project3.setDetails("This is just some example description to fill in later! I really wanted to make this one long just to see what would happen so i just kept" +
            " typing and typing over and over again Yet somehow the description needs even more. I wonder how to span more lines? Maybe I need to make a whole seperate text field." + 
            " Maybe then I'll be able to have enough information...");
            project3.setStartDate("5/25/2023");
            projectRepository.save(project3);

            ProjectEntity project4 = new ProjectEntity();
            //project2.setId((long)2);
            project4.setName("A different example");
            project4.setDetails("This is just some example description to fill in later! But this one is going to have some more than the other, no libraries needed for this! Isn't that just crazy?");
            project4.setStartDate("5/25/2023");
            projectRepository.save(project4);

            ProjectEntity project5 = new ProjectEntity();
            //project2.setId((long)2);
            project5.setName("A different example");
            project5.setDetails("This is just some example description to fill in later! But this one is going to have some more than the other. I used 57,000 libraries, woah...");
            project5.setStartDate("5/25/2023");
            projectRepository.save(project5);
        }
    }
}
