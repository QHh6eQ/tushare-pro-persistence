package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 复权因子
 */
@Repository
public interface AdjFactorRepository extends JpaRepository<AdjFactorEntity, AdjFactorEntity.PrimaryKey> {
    
}