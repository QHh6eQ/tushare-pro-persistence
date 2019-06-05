package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

/**
 * 沪深港通资金流向
 */
@Repository
public interface MoneyflowHsgtRepository extends JpaRepository<MoneyflowHsgtEntity, LocalDate> {
    
}