package com.springapp.mvc.common;

import java.util.List;

/**
 * Информация о категории
 *
 * Gataullin Kamil
 * 27.02.2016 0:48
 */
public class CategoryInfo {

    /**
     * id категории
     */
    private Long id;

    /**
     * Название категории
     */
    private String name;

    /**
     * Список дочерних категорий
     */
    private List<CategoryInfo> children;

    public CategoryInfo() {
    }

    public CategoryInfo(Long id, String name, List<CategoryInfo> children) {
        this.id = id;
        this.name = name;
        this.children = children;
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

    public List<CategoryInfo> getChildren() {
        return children;
    }

    public void setChildren(List<CategoryInfo> children) {
        this.children = children;
    }
}
