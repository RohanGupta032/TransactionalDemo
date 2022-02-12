package com.javatechie.tx.repository;

import com.javatechie.tx.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInforepository extends JpaRepository<PaymentInfo,String> {
}
