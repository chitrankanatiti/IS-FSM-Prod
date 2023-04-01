package com.hdsoft.fsm.purchasereceived.repository;

import com.hdsoft.fsm.purchasereceived.model.PurchaseReceived;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseReceivedRepository extends JpaRepository<PurchaseReceived, Long> {
}
