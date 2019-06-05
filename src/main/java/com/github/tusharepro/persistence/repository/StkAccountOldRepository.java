package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

/**
 * 股票账户开户数据（旧）
 */
@Repository
public interface StkAccountOldRepository extends JpaRepository<StkAccountOldEntity, LocalDate> {
    
}