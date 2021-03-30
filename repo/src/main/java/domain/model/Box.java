package domain.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name= "box")
public class Box {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message="Box must belong to a customer")
    private String customerId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
