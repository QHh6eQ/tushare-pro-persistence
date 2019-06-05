package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 指数月线行情
 */
@Repository
public interface IndexMonthlyRepository extends JpaRepository<IndexMonthlyEntity, IndexMonthlyEntity.PrimaryKey> {
    
}