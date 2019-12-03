package com.hotelfoodbooking.entities;

import org.apache.catalina.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    @Column(name = "status")
    String status;

    @Column(name = "date")
    String date;

//    @OneToMany
//    List <Products> products;
//
//    @OneToOne
//    User user;


    public Orders() {
    }

    public Orders(Long id, String status, String date) {
        this.id = id;
        this.status = status;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
