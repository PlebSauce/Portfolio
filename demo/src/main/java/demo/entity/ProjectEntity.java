package portfolio.demo.entity;

import java.time.LocalDate;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProjectEntity {
    
    @Id
    private Long id;

    @Nonnull
    private String name;

    private String details;

    private LocalDate startDate;

    private LocalDate endDate;

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
