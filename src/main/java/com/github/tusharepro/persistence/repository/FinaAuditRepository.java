package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 财务审计意见
 */
@Repository
public interface FinaAuditRepository extends JpaRepository<FinaAuditEntity, FinaAuditEntity.PrimaryKey> {
    
}