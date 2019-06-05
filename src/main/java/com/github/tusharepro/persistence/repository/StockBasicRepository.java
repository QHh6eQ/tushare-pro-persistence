package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 股票列表
 */
@Repository
public interface StockBasicRepository extends JpaRepository<StockBasicEntity, String> {
    
}