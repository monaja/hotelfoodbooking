package com.hotelfoodbooking.repository;

import com.hotelfoodbooking.entities.Roles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends CrudRepository<Roles,Long> {
}
