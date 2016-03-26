package com.springapp.mvc.services;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.MenuInfo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Сервис для работы с навигацией
 *
 * Gataullin Kamil
 * 27.02.2016 1:08
 */
@Service
public class MenuService {

    /**
     * Получаем основное меню сайта
     */
    public List<MenuInfo> getMainMenu() {
        List<MenuInfo> listMenu = new ArrayList<MenuInfo>();
        listMenu.add(new MenuInfo(1L, "Mens", "#", getCategoryForMenu(1L), getTrendsForMenu(1L)));
        listMenu.add(new MenuInfo(2L, "Womens", "#", getCategoryForMenu(2L), getTrendsForMenu(2L)));
        listMenu.add(new MenuInfo(3L, "Brands", "#", null, null));
        listMenu.add(new MenuInfo(4L, "Sale", "#", null, null));
        return listMenu;
    }

    /**
     * Получаем список популярных товаров для определенного элемента меню
     */
    public List<GoodInfo> getTrendsForMenu(Long menuId) {
        CategoryInfo category = new CategoryInfo(1L, "Watches", null);
        List<GoodInfo> trendGoods = new ArrayList<GoodInfo>();
        trendGoods.add(new GoodInfo(1L, "Denim shirt", "/images/p1.jpg", category, new BigDecimal(100)));
        trendGoods.add(new GoodInfo(2L, "Denim shirt", "/images/p2.jpg", category, new BigDecimal(200)));
        trendGoods.add(new GoodInfo(3L, "Denim shirt", "/images/p3.jpg", category, new BigDecimal(200)));
        return trendGoods;
    }

    /**
     * Получаем категории для отображения в меню
     */
    public List<CategoryInfo> getCategoryForMenu(Long menuId) {
        List<CategoryInfo> categories = new ArrayList<CategoryInfo>();
        List<CategoryInfo> menCategories = new ArrayList<CategoryInfo>();
        menCategories.add(new CategoryInfo(1L, "Watches", null));
        menCategories.add(new CategoryInfo(2L, "Blazers", null));
        menCategories.add(new CategoryInfo(3L, "Suits", null));
        menCategories.add(new CategoryInfo(4L, "Trousers", null));
        menCategories.add(new CategoryInfo(5L, "Jeans", null));
        menCategories.add(new CategoryInfo(6L, "Shirts", null));
        menCategories.add(new CategoryInfo(7L, "Sweatshirts & Hoodies", null));
        menCategories.add(new CategoryInfo(8L, "Swim Wear", null));
        menCategories.add(new CategoryInfo(9L, "Accessories", null));
        categories.add(new CategoryInfo(11L, "Men", menCategories));

        List<CategoryInfo> womenCategories = new ArrayList<CategoryInfo>();
        womenCategories.add(new CategoryInfo(1L, "Watches", null));
        womenCategories.add(new CategoryInfo(2L, "Outerwear", null));
        womenCategories.add(new CategoryInfo(3L, "Dresses", null));
        womenCategories.add(new CategoryInfo(4L, "Handbags", null));
        womenCategories.add(new CategoryInfo(5L, "Trousers", null));
        womenCategories.add(new CategoryInfo(6L, "T-Shirts", null));
        womenCategories.add(new CategoryInfo(7L, "Coats", null));
        womenCategories.add(new CategoryInfo(8L, "Shoes", null));
        womenCategories.add(new CategoryInfo(9L, "Accessories", null));
        categories.add(new CategoryInfo(22L, "Women", womenCategories));
        return categories;
    }
}
