package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 财务指标数据
 */
@Repository
public interface FinaIndicatorRepository extends JpaRepository<FinaIndicatorEntity, FinaIndicatorEntity.PrimaryKey> {
    
}