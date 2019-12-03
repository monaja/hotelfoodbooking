package com.hotelfoodbooking.repository;

import com.hotelfoodbooking.entities.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users, Long> {
    Users findByEmail(String email);

    Users findOneByEmail(String email);
}
