package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 交易日历
 */
@Repository
public interface TradeCalRepository extends JpaRepository<TradeCalEntity, TradeCalEntity.PrimaryKey> {
    
}