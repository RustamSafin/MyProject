package com.springapp.mvc.services;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.catalog.CatalogFilterInfo;
import com.springapp.mvc.common.catalog.FilterItem;
import com.springapp.mvc.common.catalog.PriceFilterItem;
import org.springframework.stereotype.Service;

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
    public List<GoodInfo> getGoodsByCategoryId(Long categoryId) {
        CategoryInfo category = new CategoryInfo(categoryId, "Dresses", null);
        List<GoodInfo> goods = new ArrayList<GoodInfo>();
        goods.add(new GoodInfo(1L, "Lorem 2014", "/images/p1.jpg", category, new BigDecimal(100)));
        goods.add(new GoodInfo(2L, "Lorem 2015", "/images/p2.jpg", category, new BigDecimal(200)));
        goods.add(new GoodInfo(3L, "Lorem 2016", "/images/p3.jpg", category, new BigDecimal(200)));
        goods.add(new GoodInfo(4L, "Rolex 2015", "/images/p4.jpg", category, new BigDecimal(300)));
        goods.add(new GoodInfo(5L, "Rolex 2016", "/images/p5.jpg", category, new BigDecimal(300)));
        goods.add(new GoodInfo(6L, "OMEGA 2015", "/images/p6.jpg", category, new BigDecimal(250)));
        return goods;
    }

    /**
     * Получаем продвигаемые товары для главной
     */
    public List<GoodInfo> getTopGoodsForMain() {
        CategoryInfo category = new CategoryInfo(1L, "Watches", null);
        List<GoodInfo> goods = new ArrayList<GoodInfo>();
        goods.add(new GoodInfo(1L, "Men's", "Lorem ipsum dolor sit amet consectetur adipisicing.",
                "/images/p1.jpg", category, new BigDecimal(100)));
        goods.add(new GoodInfo(2L, "Men's", "Lorem ipsum dolor sit amet consectetur adipisicing.",
                "/images/p2.jpg", category, new BigDecimal(200)));
        goods.add(new GoodInfo(3L, "Women's", "Lorem ipsum dolor sit amet consectetur adipisicing.",
                "/images/p3.jpg", category, new BigDecimal(200)));
        return goods;
    }

    /**
     * Получаем значения фильтров для каталога
     *
     * @param categoryId id категории
     */
    public CatalogFilterInfo getCatalogFilters(Long categoryId) {
        CatalogFilterInfo filterInfo = new CatalogFilterInfo();
        List<FilterItem> categories = new ArrayList<FilterItem>();
        categories.add(new FilterItem(11L, "Dresses", 14));
        categories.add(new FilterItem(12L, "Glasses", 2));
        categories.add(new FilterItem(13L, "Gloves", 2));
        categories.add(new FilterItem(14L, "Jeans", 8));
        categories.add(new FilterItem(15L, "Shoes", 11));
        categories.add(new FilterItem(16L, "Shorts", 3));
        categories.add(new FilterItem(17L, "Skirts", 3));
        categories.add(new FilterItem(18L, "Sweaters", 6));
        categories.add(new FilterItem(19L, "T-Shirts", 12));
        categories.add(new FilterItem(10L, "Tops", 6));
        categories.add(new FilterItem(20L, "Watchers", 5));
        categories.add(new FilterItem(21L, "Women", 17));
        filterInfo.setCategories(categories);

        List<FilterItem> colors = new ArrayList<FilterItem>();
        colors.add(new FilterItem(11L, "Green", 14));
        colors.add(new FilterItem(12L, "Blue", 2));
        colors.add(new FilterItem(13L, "Red", 2));
        colors.add(new FilterItem(14L, "Gray", 8));
        colors.add(new FilterItem(15L, "Black", 11));
        filterInfo.setColors(colors);

        List<FilterItem> sizes = new ArrayList<FilterItem>();
        sizes.add(new FilterItem(11L, "L", 14));
        sizes.add(new FilterItem(12L, "M", 2));
        sizes.add(new FilterItem(13L, "S", 2));
        sizes.add(new FilterItem(14L, "XL", 8));
        sizes.add(new FilterItem(15L, "XS", 11));
        filterInfo.setSizes(sizes);

        List<PriceFilterItem> prices = new ArrayList<PriceFilterItem>();
        prices.add(new PriceFilterItem(new BigDecimal(100), new BigDecimal(150), 15));
        prices.add(new PriceFilterItem(new BigDecimal(150), new BigDecimal(200), 16));
        prices.add(new PriceFilterItem(new BigDecimal(200), new BigDecimal(250), 3));
        prices.add(new PriceFilterItem(new BigDecimal(250), new BigDecimal(300), 8));
        prices.add(new PriceFilterItem(new BigDecimal(300), new BigDecimal(350), 7));
        prices.add(new PriceFilterItem(new BigDecimal(350), new BigDecimal(400), 1));
        filterInfo.setPrices(prices);

        return filterInfo;
    }
}
