package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 利润表
 */
@Repository
public interface IncomeRepository extends JpaRepository<IncomeEntity, IncomeEntity.PrimaryKey> {
    
}