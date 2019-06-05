package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 融资融券交易明细
 */
@Repository
public interface MarginDetailRepository extends JpaRepository<MarginDetailEntity, MarginDetailEntity.PrimaryKey> {
    
}