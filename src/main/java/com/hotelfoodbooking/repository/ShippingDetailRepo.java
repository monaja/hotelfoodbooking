package com.hotelfoodbooking.repository;

import com.hotelfoodbooking.entities.ShippingDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingDetailRepo extends CrudRepository<ShippingDetails,Long> {
}
