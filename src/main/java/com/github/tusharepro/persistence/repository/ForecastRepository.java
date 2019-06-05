package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 业绩预告
 */
@Repository
public interface ForecastRepository extends JpaRepository<ForecastEntity, ForecastEntity.PrimaryKey> {
    
}