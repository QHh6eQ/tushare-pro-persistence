package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 大宗交易
 */
@Repository
public interface BlockTradeRepository extends JpaRepository<BlockTradeEntity, BlockTradeEntity.PrimaryKey> {
    
}