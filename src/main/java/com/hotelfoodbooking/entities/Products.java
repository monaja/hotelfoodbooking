package com.hotelfoodbooking.entities;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Products {
    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "quantity")
    Integer quantity;

    @Column(name = "price")
    Integer unitPrice;

//    @OneToOne(mappedBy = "product")
//    Users users;


    public Products() {
    }

    public Products(Long id,String name, Integer quantity, Integer unitPrice) {
        this.id =  id;
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

