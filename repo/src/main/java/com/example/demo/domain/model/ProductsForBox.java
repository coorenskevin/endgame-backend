package com.example.demo.domain.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Table(name = "products_for_box")
public class ProductsForBox {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Min(value= 0L , message="")
    private int box_id;

    @Min(value= 0L, message="")
    private int product_id;

    @Min(value= 0L, message="Amount can't be empty or null")
    private int amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBox_id() {
        return box_id;
    }

    public void setBox_id(int boxId) {
        this.box_id = boxId;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int productId) {
        this.product_id = productId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

}
