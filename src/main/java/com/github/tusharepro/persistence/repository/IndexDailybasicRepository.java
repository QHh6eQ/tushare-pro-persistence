package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 大盘指数每日指标
 */
@Repository
public interface IndexDailybasicRepository extends JpaRepository<IndexDailybasicEntity, IndexDailybasicEntity.PrimaryKey> {
    
}