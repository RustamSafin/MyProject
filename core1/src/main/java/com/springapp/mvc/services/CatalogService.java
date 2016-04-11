package com.springapp.mvc.services;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.catalog.CatalogFilterInfo;
import com.springapp.mvc.common.catalog.FilterItem;
import com.springapp.mvc.common.catalog.PriceFilterItem;
import com.springapp.mvc.repositories.CategoryRepository;
import com.springapp.mvc.repositories.GoodRepository;
import com.springapp.mvc.repositories.GoodRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с категориями товаров
 *
 * Gataullin Kamil
 * 22.02.2016 23:23
 */
@Service
public class CatalogService {

    /**
     * Получение товаров по id категории
     *
     * @param categoryId id категории
     * @return список товаров
     */

    @Autowired
    private GoodRepository goodRepository;

    @Autowired
    private CategoryRepository categoryRepository;
//    @Autowired
//    private GoodRepositoryCustom goodRepositoryCustom;

    public List<GoodInfo> getGoodsByCategoryId(Long categoryId) {
//        CategoryInfo category = new CategoryInfo(categoryId, "Dresses", null);
        return goodRepository.findGoodsByCategory(categoryRepository.findCategoryById(categoryId)) ;
    }
    public List<GoodInfo> getAllGoods() {
        return goodRepository.findAllByNameNotNull();
    }

    public Integer countAllGoods() {
       return goodRepository.countAllGoods();
    }
    /**
     * Получаем продвигаемые товары для главной
     */
    public List<GoodInfo> getTopGoodsForMain() {
        return goodRepository.findAllByNameNotNull().subList(0,8);
    }

    /**
     * Получаем значения фильтров для каталога
     *
     */
    public CatalogFilterInfo getCatalogFilters() {
        CatalogFilterInfo filterInfo = new CatalogFilterInfo();
        List<CategoryInfo> categories =categoryRepository.findAllByNameNotNull();
        filterInfo.setCategories(categories);

        List<String> brands = new ArrayList<String>();
        brands.add("A");

        filterInfo.setBrands(brands);

        List<FilterItem> sizes = new ArrayList<FilterItem>();
        sizes.add(new FilterItem(1L, "Mini"));
        sizes.add(new FilterItem(2L, "Small"));
        sizes.add(new FilterItem(3L, "Medium"));
        sizes.add(new FilterItem(4L, "Large"));
        filterInfo.setSizes(sizes);

        return filterInfo;
    }
    public List<GoodInfo> getSortedGoods(String sort) {
        if (sort.equals("price")) {
            return goodRepository.findByNameNotNullOrderByPrice();}
        if (sort.equals("name")) {
                return goodRepository.findByNameNotNullOrderByName();
        }
        if(sort.equals("price Desc")) {
            return goodRepository.findByNameNotNullOrderByPriceDesc();
        }
        return goodRepository.findAllByNameNotNull();
    }
//    public List<GoodInfo> getSortedGoods(Long categoryId,String sort) {
//        if (sort.equals("price")) {
//            return goodRepository.findByCategoryOrderByPrice(categoryRepository.findCategoryById(categoryId));}
//        if (sort.equals("name")) {
//            return goodRepository.findByCategoryOrderByName(categoryRepository.findCategoryById(categoryId));
//        }
//        if(sort.equals("price Desc")) {
//            return goodRepository.findByCategoryOrderByPriceDesc(categoryRepository.findCategoryById(categoryId));
//        }
//        return goodRepository.findGoodsByCategory(categoryRepository.findCategoryById(categoryId)) ;
//    }
    public List<GoodInfo> findGoodsByFiltres(String sizes,String brands,BigDecimal minPrice,BigDecimal maxPrice){
        categories=categories.substring(0,sizes.length()-1);
        brands=brands.substring(0,brands.length()-1);

    }
}
