package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 分红送股
 */
@Repository
public interface DividendRepository extends JpaRepository<DividendEntity, DividendEntity.PrimaryKey> {
    
}