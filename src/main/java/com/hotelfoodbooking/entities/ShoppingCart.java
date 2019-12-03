package com.hotelfoodbooking.entities;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "shopping_cart")
public class ShoppingCart {
    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    @Column(name = "quantity")
    int quantity;

    @Column(name = "price")
    int price;

//    @OneToMany
//    List<Products> products;
//
//    @OneToOne
//    User user;


    public ShoppingCart(Long id,int quantity, int price) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
