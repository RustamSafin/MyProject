package com.springapp.mvc.controllers;

import com.springapp.mvc.common.CategoryInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.services.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Контроллер для тестовых запросов
 *
 * Gataullin Kamil
 * 25.02.2016 22:25
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private CatalogService catalogService;

    /**
     * Hello world!
     */
    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world!");
        return "test/main/main";
    }

    /**
     * Справочная информация по FreeMarker
     */
    @RequestMapping(value = "/freemarker", method = RequestMethod.GET)
    public String freemarkerTest() {
        request.setAttribute("param1", "value1");
        request.setAttribute("list", Arrays.asList("Пушкин", "Горький", "Толстой"));
        request.setAttribute("testMap", getTestMap());
        request.setAttribute("goodObject", new GoodInfo(12L, "Название товара", new CategoryInfo(15L, "Категория", null), new BigDecimal(1000)));
        return "test/freemarker";
    }

    /**
     * Отображение главной страницы каталога
     */
    @RequestMapping(value = "/catalog", method = {RequestMethod.GET, RequestMethod.POST})
    public String mainCatalog(HttpServletRequest request) {
        request.setAttribute("message", "Главная страница каталога");
        return "test/catalog/catalogMain";
    }
    /**
     * Отображение каталога
     *
     * @param id    id категории
     * @param page  номер страницы
     * @param limit кол-во товаров отображаемых на странице
     * @return отображение каталога
     */
    @RequestMapping(value = "/catalog/{id}", method = RequestMethod.GET)
    public String renderCatalog(@PathVariable("id") Long id,
                                @RequestParam(value = "page", required = false, defaultValue = "1") String page,
                                Long limit,
                                Model model) {
        List<GoodInfo> goods = catalogService.getGoodsByCategoryId(id);
        model.addAttribute("goods", goods);
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        return "test/catalog/catalog";
    }

    private Map<String, Long> getTestMap() {
        Map<String, Long> map = new HashMap<String, Long>();
        map.put("key1", 100L);
        map.put("key2", 200L);
        map.put("key3", 300L);
        map.put("key4", 400L);
        map.put("key5", 500L);
        return map;
    }
}
