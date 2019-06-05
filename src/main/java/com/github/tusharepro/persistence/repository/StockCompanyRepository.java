package com.github.tusharepro.persistence.repository;

import com.github.tusharepro.core.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 上市公司基本信息
 */
@Repository
public interface StockCompanyRepository extends JpaRepository<StockCompanyEntity, String> {
    
}