package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 融资融券交易汇总
 */
@Repository
public interface MarginRepository extends JpaRepository<MarginEntity, MarginEntity.PrimaryKey> {
    
}