package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 股权质押统计数据
 */
@Repository
public interface PledgeStatRepository extends JpaRepository<PledgeStatEntity, PledgeStatEntity.PrimaryKey> {
    
}