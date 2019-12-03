package com.hotelfoodbooking.entities;

import javax.persistence.*;

@Entity
@Table(name = "payment_detail")
public class PaymentDetails {
    @Id
    @GeneratedValue
    @Column(name = "id")
    Long id;

    @Column(name = "paymentmethod")
    String paymentMethod;

    @Column(name = "amount")
    int amount;

//    @OneToOne(mappedBy = "paymentDetails")
//    Orders orders;
//
//    @OneToOne(mappedBy = "paymentDetails")
//    Users users;


    public PaymentDetails(Long id,String paymentMethod, int amount) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentDetails{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", amount=" + amount +
                '}';
    }
}
