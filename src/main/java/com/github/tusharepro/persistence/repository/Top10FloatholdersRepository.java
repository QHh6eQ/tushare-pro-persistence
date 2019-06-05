package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 前十大流通股东
 */
@Repository
public interface Top10FloatholdersRepository extends JpaRepository<Top10FloatholdersEntity, Top10FloatholdersEntity.PrimaryKey> {
    
}