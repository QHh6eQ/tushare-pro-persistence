package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 现金流量表
 */
@Repository
public interface CashflowRepository extends JpaRepository<CashflowEntity, CashflowEntity.PrimaryKey> {
    
}