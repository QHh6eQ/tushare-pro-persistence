package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 主营业务构成
 */
@Repository
public interface FinaMainbzRepository extends JpaRepository<FinaMainbzEntity, FinaMainbzEntity.PrimaryKey> {
    
}