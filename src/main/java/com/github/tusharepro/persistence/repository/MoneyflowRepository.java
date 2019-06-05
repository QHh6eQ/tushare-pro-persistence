package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 个股资金流向
 */
@Repository
public interface MoneyflowRepository extends JpaRepository<MoneyflowEntity, MoneyflowEntity.PrimaryKey> {
    
}