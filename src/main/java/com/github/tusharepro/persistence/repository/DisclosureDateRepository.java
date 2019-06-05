package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 财报披露计划
 */
@Repository
public interface DisclosureDateRepository extends JpaRepository<DisclosureDateEntity, DisclosureDateEntity.PrimaryKey> {
    
}