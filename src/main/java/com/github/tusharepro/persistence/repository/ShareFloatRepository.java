package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 限售股解禁
 */
@Repository
public interface ShareFloatRepository extends JpaRepository<ShareFloatEntity, ShareFloatEntity.PrimaryKey> {
    
}