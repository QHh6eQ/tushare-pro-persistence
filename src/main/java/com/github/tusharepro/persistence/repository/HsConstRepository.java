package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 沪深股通成份股
 */
@Repository
public interface HsConstRepository extends JpaRepository<HsConstEntity, HsConstEntity.PrimaryKey> {
    
}