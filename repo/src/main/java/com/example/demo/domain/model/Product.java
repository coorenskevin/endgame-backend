package com.example.demo.domain.model;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name= "product")
public class Product{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NotBlank(message ="Description can't be empty")
    private String description;
    @NotBlank(message="Category can't be empty")
    private String category;

    @NotBlank(message="Name can't be empty")
    private String name;

    @Min(value= 0L, message="Price can't be empty")
    private double price;

    @Min(value= 0L, message="Amount can't be empty or null")
    private int amountbought;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmountbought() {
        return amountbought;
    }

    public void setAmountbought(int amount) {
        this.amountbought = amount;
    }




}
