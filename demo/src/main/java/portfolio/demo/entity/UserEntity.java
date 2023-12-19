package portfolio.demo.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
/*Add table sql statement*/
public class UserEntity {

    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Nonnull
    private String Name;
}