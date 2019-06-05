package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 停复牌信息
 */
@Repository
public interface SuspendRepository extends JpaRepository<SuspendEntity, SuspendEntity.PrimaryKey> {
    
}