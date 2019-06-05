package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 龙虎榜每日明细
 */
@Repository
public interface TopListRepository extends JpaRepository<TopListEntity, TopListEntity.PrimaryKey> {
    
}