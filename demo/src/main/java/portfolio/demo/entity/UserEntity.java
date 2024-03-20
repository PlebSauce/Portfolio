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
    private String name;

    @Nonnull
    private String email;

    @Nonnull
    private String password;

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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}