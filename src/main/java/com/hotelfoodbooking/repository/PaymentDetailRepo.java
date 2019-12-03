package com.hotelfoodbooking.repository;

import com.hotelfoodbooking.entities.PaymentDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDetailRepo extends CrudRepository<PaymentDetails,Long> {
}
