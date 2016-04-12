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

    @Query("select count(g) from GoodInfo g")
    Integer countAllGoods();


    List<GoodInfo> findByNameNotNullOrderByPrice();
    List<GoodInfo> findByNameNotNullOrderByPriceDesc();
    List<GoodInfo> findByNameNotNullOrderByName();
    List<GoodInfo> findByCategoryOrderByPrice(CategoryInfo categoryInfo);
    List<GoodInfo> findByCategoryOrderByPriceDesc(CategoryInfo categoryInfo);
    List<GoodInfo> findByCategoryOrderByName(CategoryInfo categoryInfo);

//    @Query("select g from GoodInfo g where g.brand in (:brand) and g.size in (:size) and g.price=:price")
//    List<GoodInfo> findGoodsByFiltres(@Param("brand") String brand,@Param("size") String size,@Param("price") BigDecimal price);
//    @Query("select g from GoodInfo g where g.brand in (:brand)")
//    List<GoodInfo> findGoodsByFiltres(@Param("brand") String brand);
}
