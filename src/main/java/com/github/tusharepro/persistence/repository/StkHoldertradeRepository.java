package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 股东增减持
 */
@Repository
public interface StkHoldertradeRepository extends JpaRepository<StkHoldertradeEntity, StkHoldertradeEntity.PrimaryKey> {
    
}