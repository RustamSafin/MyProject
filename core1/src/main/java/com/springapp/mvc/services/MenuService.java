package com.springapp.mvc.services;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.MenuInfo;
import com.springapp.mvc.repositories.CategoryRepository;
import com.springapp.mvc.repositories.GoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GoodRepository goodRepository;
    /**
     * Получаем основное меню сайта
     */
    public List<MenuInfo> getMainMenu() {
        List<MenuInfo> listMenu = new ArrayList<MenuInfo>();
        listMenu.add(new MenuInfo(1L, "Products", "/catalog", getCategoriesForMenu(), getTrendsForMenu()));
        listMenu.add(new MenuInfo(2L, "Brands", "#", null, null));
        listMenu.add(new MenuInfo(3L, "Sale", "#", null, null));
        return listMenu;
    }

    /**
     * Получаем список популярных товаров для определенного элемента меню
     */
    public List<GoodInfo> getTrendsForMenu() {
//        CategoryInfo category = new CategoryInfo(1L, "Watches", null);
        return goodRepository.findByPriceGreaterThanEqual(new BigDecimal(600));
    }

    /**
     * Получаем категории для отображения в меню
     */
    public List<CategoryInfo> getCategoriesForMenu() {
        return categoryRepository.findAllByNameNotNull();
    }
}
