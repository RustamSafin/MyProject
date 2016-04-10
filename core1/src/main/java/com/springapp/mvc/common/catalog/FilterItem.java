package com.springapp.mvc.common.catalog;

/**
 * Одна позиция фильтра
 *
 * Gataullin Kamil
 * 28.02.2016 20:31
 */
public class FilterItem {

    /**
     * ID фильтра
     */
    private Long id;

    /**
     * Название
     */
    private String name;

    public FilterItem() {
    }

    public FilterItem(Long id, String name) {
        this.id = id;
        this.name = name;
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

}
