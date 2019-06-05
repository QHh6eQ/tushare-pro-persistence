package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 股票曾用名
 */
@Repository
public interface NamechangeRepository extends JpaRepository<NamechangeEntity, NamechangeEntity.PrimaryKey> {
    
}