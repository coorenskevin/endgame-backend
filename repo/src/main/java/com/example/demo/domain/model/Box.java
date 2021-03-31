package com.example.demo.domain.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name= "box")
public class Box {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message="Box must belong to a customer")
    private String customer_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(String customerId) {
        this.customer_id = customerId;
    }
}
