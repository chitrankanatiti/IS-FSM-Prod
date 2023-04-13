package com.hdsoft.fsm.purchase.repository;

import com.hdsoft.fsm.purchase.model.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseRepository extends JpaRepository<Purchase, Long> {
}
