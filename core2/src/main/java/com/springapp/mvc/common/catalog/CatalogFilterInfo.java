package com.springapp.mvc.common.catalog;

import com.springapp.mvc.common.CategoryInfo;

import java.util.List;

/**
 * Для фильтров каталога
 *
 * Gataullin Kamil
 * 28.02.2016 20:31
 */
public class CatalogFilterInfo {

    /**
     * Фильтры по категории
     */
    private List<CategoryInfo> categories;

    /**
     * Фильтры по цвету
     */
    private List<String> brands;

    /**
     * Фильтры по размеру
     */
    private List<FilterItem> sizes;

    /**
     * Фильтры по цене
     */
//    private List<PriceFilterItem> prices;

    public CatalogFilterInfo() {
    }

    public CatalogFilterInfo(List<CategoryInfo> categories, List<String> brands, List<FilterItem> sizes) {
        this.categories = categories;
        this.brands = brands;
        this.sizes = sizes;
//        this.prices = prices;
    }

    public List<CategoryInfo> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoryInfo> categories) {
        this.categories = categories;
    }

    public List<String> getBrands() {
        return brands;
    }

    public void setBrands(List<String> brands) {
        this.brands = brands;
    }

    public List<FilterItem> getSizes() {
        return sizes;
    }

    public void setSizes(List<FilterItem> sizes) {
        this.sizes = sizes;
    }

}
