package com.hotelfoodbooking.repository;

import com.hotelfoodbooking.entities.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepo extends CrudRepository<Products,Long> {

}
