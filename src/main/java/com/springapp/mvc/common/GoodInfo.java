package com.springapp.mvc.common;

import java.math.BigDecimal;

/**
 * Основная информация о товаре
 *
 * Gataullin Kamil
 * 22.02.2016 22:54
 */
public class GoodInfo {

    /**
     * id товара
     */
    private Long id;

    /**
     * Название товара
     */
    private String name;

    /**
     * Описание товара
     */
    private String description;

    /**
     * URL изображения
     */
    private String imageUrl;

    /**
     * Категория товара
     */
    private CategoryInfo category;

    /**
     * Цена
     */
    private BigDecimal price;

    public GoodInfo() {
    }

    public GoodInfo(Long id, String name, CategoryInfo category, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public GoodInfo(Long id, String name, String imageUrl, CategoryInfo category, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.category = category;
        this.price = price;
    }

    public GoodInfo(Long id, String name, String description, String imageUrl, CategoryInfo category, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDecoratedName() {
        return "*** " + name + " ***";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public CategoryInfo getCategory() {
        return category;
    }

    public void setCategory(CategoryInfo category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
