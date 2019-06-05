package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 每日指标
 */
@Repository
public interface DailyBasicRepository extends JpaRepository<DailyBasicEntity, DailyBasicEntity.PrimaryKey> {
    
}