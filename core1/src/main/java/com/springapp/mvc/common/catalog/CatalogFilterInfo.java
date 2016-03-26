package com.springapp.mvc.common.catalog;

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
    private List<FilterItem> categories;

    /**
     * Фильтры по цвету
     */
    private List<FilterItem> colors;

    /**
     * Фильтры по размеру
     */
    private List<FilterItem> sizes;

    /**
     * Фильтры по цене
     */
    private List<PriceFilterItem> prices;

    public CatalogFilterInfo() {
    }

    public CatalogFilterInfo(List<FilterItem> categories, List<FilterItem> colors, List<FilterItem> sizes, List<PriceFilterItem> prices) {
        this.categories = categories;
        this.colors = colors;
        this.sizes = sizes;
        this.prices = prices;
    }

    public List<FilterItem> getCategories() {
        return categories;
    }

    public void setCategories(List<FilterItem> categories) {
        this.categories = categories;
    }

    public List<FilterItem> getColors() {
        return colors;
    }

    public void setColors(List<FilterItem> colors) {
        this.colors = colors;
    }

    public List<FilterItem> getSizes() {
        return sizes;
    }

    public void setSizes(List<FilterItem> sizes) {
        this.sizes = sizes;
    }

    public List<PriceFilterItem> getPrices() {
        return prices;
    }

    public void setPrices(List<PriceFilterItem> prices) {
        this.prices = prices;
    }
}
