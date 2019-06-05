package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 龙虎榜机构明细
 */
@Repository
public interface TopInstRepository extends JpaRepository<TopInstEntity, TopInstEntity.PrimaryKey> {
    
}