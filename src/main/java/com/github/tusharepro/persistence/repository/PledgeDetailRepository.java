package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 股权质押明细
 */
@Repository
public interface PledgeDetailRepository extends JpaRepository<PledgeDetailEntity, PledgeDetailEntity.PrimaryKey> {
    
}