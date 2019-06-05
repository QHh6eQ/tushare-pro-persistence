package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 周线行情
 */
@Repository
public interface WeeklyRepository extends JpaRepository<WeeklyEntity, WeeklyEntity.PrimaryKey> {
    
}