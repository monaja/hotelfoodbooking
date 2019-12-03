package com.hotelfoodbooking.repository;

import com.hotelfoodbooking.entities.ShoppingCart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingDetailRepo extends CrudRepository<ShoppingCart,Long> {
}
