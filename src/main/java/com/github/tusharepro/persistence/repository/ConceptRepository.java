package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 概念股分类
 */
@Repository
public interface ConceptRepository extends JpaRepository<ConceptEntity, String> {
    
}