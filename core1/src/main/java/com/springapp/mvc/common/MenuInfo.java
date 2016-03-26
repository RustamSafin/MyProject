package com.springapp.mvc.common;

import java.util.List;

/**
 * Меню в шапке сайта
 *
 * Gataullin Kamil
 * 27.02.2016 0:42
 */
public class MenuInfo {

    /**
     * id пункта меню
     */
    private Long id;

    /**
     * Название пункта меню
     */
    private String name;

    /**
     * Ссылка на соответствующий раздел
     */
    private String link;

    /**
     * Список категорий для отображения
     */
    private List<CategoryInfo> listCategory;

    /**
     * Популярные товары категории
     */
    private List<GoodInfo> trends;

    public MenuInfo() {
    }

    public MenuInfo(Long id, String name, String link, List<CategoryInfo> listCategory, List<GoodInfo> trends) {
        this.id = id;
        this.name = name;
        this.link = link;
        this.listCategory = listCategory;
        this.trends = trends;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<CategoryInfo> getListCategory() {
        return listCategory;
    }

    public void setListCategory(List<CategoryInfo> listCategory) {
        this.listCategory = listCategory;
    }

    public List<GoodInfo> getTrends() {
        return trends;
    }

    public void setTrends(List<GoodInfo> trends) {
        this.trends = trends;
    }
}
