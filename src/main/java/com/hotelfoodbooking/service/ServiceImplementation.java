package com.hotelfoodbooking.service;

import com.hotelfoodbooking.entities.*;
import com.hotelfoodbooking.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceImplementation implements ServiceClass {

     ProductRepo productRepo;
     OrderRepo orderRepo;
     PaymentDetailRepo paymentDetailRepo;
     RoleRepo roleRepo;
     ShippingDetailRepo shippingDetailRepo;
     ShoppingDetailRepo shoppingDetailRepo;
     UserRepo userRepo;


    public ServiceImplementation(ProductRepo productRepo, OrderRepo orderRepo, PaymentDetailRepo paymentDetailRepo,
                                 RoleRepo roleRepo, ShippingDetailRepo shippingDetailRepo, ShoppingDetailRepo shoppingDetailRepo,
                                 UserRepo userRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
        this.paymentDetailRepo = paymentDetailRepo;
        this.roleRepo = roleRepo;
        this.shippingDetailRepo = shippingDetailRepo;
        this.shoppingDetailRepo = shoppingDetailRepo;
        this.userRepo = userRepo;
    }

    //products

    //add products
    @Override
    public void addProduct(Products products){
        productRepo.save(products);
    }

    //get all products
    @Override
    public List<Products> getAllProducts(){
        return (List<Products>) productRepo.findAll();
    }

    @Override
    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }

    //users

    //add user
    @Override
    public void addUsers(Users users){
        userRepo.save(users);
    }
    @Override
    public Users getUser(String email){
        Users user = userRepo.findOneByEmail(email);
        System.out.println(email);


        System.out.println(user.toString() + "service implementations");
        return user;
    }
    //get all users
    @Override
    public List<Users> getAllUsers(){
        return (List<Users>) userRepo.findAll();
    }

    @Override
    public void deleteUsers(Long id){
        userRepo.deleteById(id);
    }

    //orders
    @Override
    public void addOrders(Orders orders){
        orderRepo.save(orders);
    }
    @Override
    public void deleteOrders(Long id){
        orderRepo.deleteById(id);
    }
    //payment details
    @Override
    public void addPaymentDetails(PaymentDetails paymentDetails){
        paymentDetailRepo.save(paymentDetails);
    }

    @Override
    public List<PaymentDetails> getAllPaymentDetails(){
        return (List<PaymentDetails>) paymentDetailRepo.findAll();
    }

    @Override
    public void deletePaymentDetails(Long id){
        paymentDetailRepo.deleteById(id);
    }

    //shipping details
    @Override
    public void addShippingDetails(ShippingDetails shippingDetails){
        shippingDetailRepo.save(shippingDetails);
    }

    @Override
    public List<ShippingDetails> getAllShippingDetails(){
        return (List<ShippingDetails>) shippingDetailRepo.findAll();
    }

    @Override
    public void deleteShippingDetails(Long id){
        shippingDetailRepo.deleteById(id);
    }

    //shopping cart
    @Override
    public void addShoppingCart(ShoppingCart shoppingCart){
        shoppingDetailRepo.save(shoppingCart);
    }

    @Override
    public List<ShoppingCart> getAllShoppingCarts(){
        return (List<ShoppingCart>) shoppingDetailRepo.findAll();
    }

    @Override
    public void deleteShoppingCard(Long id){
        shoppingDetailRepo.deleteById(id);
    }

    //roles
    @Override
    public void addRoles(Roles roles){
        roleRepo.save(roles);
    }

    @Override
    public List<Roles> getAllRoles(){
        return (List<Roles>) roleRepo.findAll();
    }

    @Override
    public void deleteRole(Long id){
        roleRepo.deleteById(id);
    }

    @Override
    public List<Orders> getAllOrders(){
        return (List<Orders>) orderRepo.findAll();
    }

    @Override
    public void deleteOrder(Long id){
        orderRepo.deleteById(id);
    }
}
