package com.hotelfoodbooking.service;

import com.hotelfoodbooking.entities.*;

import java.util.List;

public interface ServiceClass {

    //add products
    void addProduct(Products products);

    //get all products
    List<Products> getAllProducts();

    public void deleteProduct(Long id);

    //users

    //add user
    void addUsers(Users users);

    Users getUser(String email);
    //get all users
    List<Users> getAllUsers();

    void deleteUsers(Long id);

    //orders
    void addOrders(Orders orders);

    void deleteOrders(Long id);
    //payment details
    void addPaymentDetails(PaymentDetails paymentDetails);

    List<PaymentDetails> getAllPaymentDetails();

    void deletePaymentDetails(Long id);

    //shipping details
    void addShippingDetails(ShippingDetails shippingDetails);

    List<ShippingDetails> getAllShippingDetails();

    void deleteShippingDetails(Long id);

    //shopping cart
    void addShoppingCart(ShoppingCart shoppingCart);

    List<ShoppingCart> getAllShoppingCarts();

    void deleteShoppingCard(Long id);

    //roles
    void addRoles(Roles roles);

    List<Roles> getAllRoles();

    void deleteRole(Long id);

     List<Orders> getAllOrders();
     void deleteOrder(Long id);
}
