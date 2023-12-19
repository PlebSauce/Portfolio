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

}
