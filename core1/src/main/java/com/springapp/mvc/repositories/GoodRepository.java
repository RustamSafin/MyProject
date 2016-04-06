package com.springapp.mvc.repositories;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * Gataullin Kamil
 * 07.03.2016 0:17
 */
public interface GoodRepository extends JpaRepository<GoodInfo,Long> {

    GoodInfo getGoodById(Long goodId);
    List<GoodInfo> findByPriceGreaterThanEqual(BigDecimal price);
    List<GoodInfo> findGoodsByCategory(CategoryInfo categoryInfo);
    List<GoodInfo> findAllByNameNotNull();
}
