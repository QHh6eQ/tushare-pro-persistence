package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 月线行情
 */
@Repository
public interface MonthlyRepository extends JpaRepository<MonthlyEntity, MonthlyEntity.PrimaryKey> {
    
}