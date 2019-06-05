package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 业绩快报
 */
@Repository
public interface ExpressRepository extends JpaRepository<ExpressEntity, ExpressEntity.PrimaryKey> {
    
}