package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 沪深股通十大成交股
 */
@Repository
public interface HsgtTop10Repository extends JpaRepository<HsgtTop10Entity, HsgtTop10Entity.PrimaryKey> {
    
}