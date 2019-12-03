package com.hotelfoodbooking.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "shipping")
public class ShippingDetails {
    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    @Column(name = "address")
    String address;

    @Column(name = "town")
    String town;

    @Column(name = "phone")
    String phone;

//    @OneToMany
//    List<Orders> orders;
//


    public ShippingDetails(Long id,String address, String town, String phone) {
        this.id = id;
        this.address = address;
        this.town = town;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ShippingDetails{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", town='" + town + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
