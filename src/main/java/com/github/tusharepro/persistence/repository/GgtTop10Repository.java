package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 港股通十大成交股
 */
@Repository
public interface GgtTop10Repository extends JpaRepository<GgtTop10Entity, GgtTop10Entity.PrimaryKey> {
    
}