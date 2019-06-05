package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 资产负债表
 */
@Repository
public interface BalancesheetRepository extends JpaRepository<BalancesheetEntity, BalancesheetEntity.PrimaryKey> {
    
}