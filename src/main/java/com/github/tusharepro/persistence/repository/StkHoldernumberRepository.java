package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 股东人数
 */
@Repository
public interface StkHoldernumberRepository extends JpaRepository<StkHoldernumberEntity, StkHoldernumberEntity.PrimaryKey> {
    
}