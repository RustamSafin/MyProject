package com.springapp.mvc.controllers;

import com.springapp.mvc.aspects.annotation.IncludeMenuInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.MenuInfo;
import com.springapp.mvc.common.catalog.CatalogFilterInfo;
import com.springapp.mvc.services.CatalogService;
import com.springapp.mvc.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Контроллер отвечающий за каталог
 *
 * Gataullin Kamil
 * 22.02.2016 22:46
 */
@Controller
@RequestMapping("/catalog")
public class CatalogController {

    private static final Integer TEST_LIMIT = 6;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private CatalogService catalogService;

    /**
     * Отображение каталога для данной категории
     *
     * @param id    id категории
     * @param page  номер страницы
     * @param limit кол-во товаров отображаемых на странице
     * @return отображение каталога
     */
    @IncludeMenuInfo
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String renderCatalog(@PathVariable("id") Long id,
                                @RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                Integer limit,
                                Model model) {

        List<GoodInfo> goods = catalogService.getGoodsByCategoryId(id);
        model.addAttribute("goods", goods);

        CatalogFilterInfo catalogFilter = catalogService.getCatalogFilters();
        model.addAttribute("catalogFilter", catalogFilter);

        model.addAttribute("page", page);
        model.addAttribute("limit", limit == null ? TEST_LIMIT : limit);
        model.addAttribute("goodsCount", catalogService.countAllGoods());
        return "catalog/catalogPage";
    }
    /**
     * Отображение главной страницы каталога
     */
    @IncludeMenuInfo
    @RequestMapping(method = RequestMethod.GET)
    public String renderCatalogForAll(@RequestParam(value = "page", required = true, defaultValue = "1") Integer page,
                                @RequestParam(required = false, defaultValue = "9") Integer limit,
                                Model model) {
        List<GoodInfo> goods = catalogService.getAllGoods();
        model.addAttribute("goods",goods.subList(0,limit));
        CatalogFilterInfo catalogFilter = catalogService.getCatalogFilters();
        model.addAttribute("catalogFilter", catalogFilter);

        model.addAttribute("page", page);
        model.addAttribute("limit", limit == null ? TEST_LIMIT : limit);
        model.addAttribute("goodsCount", catalogService.countAllGoods());
        return "catalog/catalogPage";
    }

    /**
     * Показать еще товары
     *
     * @param id    id категории
     * @param page  номер страницы
     * @param limit кол-во отображаемых товаров
     */
    @RequestMapping(value = "/showMore", method = RequestMethod.POST)
    public String showMoreGoods(Integer page, Integer limit, Model model) {
        System.out.println(page);
        // Эта страшная проверка с page и limit только для теста, так как у нас пока нет реальных данных
        List<GoodInfo> goods = catalogService.getAllGoods();
        model.addAttribute("goods",(catalogService.countAllGoods()>page*limit)? goods.subList((page-1)*limit,page*limit):goods.subList((page-1)*limit,catalogService.countAllGoods()));
//        model.addAttribute("goods",(catalogService.countAllGoods()>page*limit)? goods.subList(limit*page-limit,limit*page):goods.subList(limit*(page-1),catalogService.countAllGoods()));
//        if (TEST_GOODS_COUNT + limit > page * limit)
//            model.addAttribute("goods", (TEST_GOODS_COUNT > page * limit) ? goods : goods.subList(0, TEST_GOODS_COUNT + limit - page * limit));

        return "catalog/ajaxGoods";
    }
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public String findGoodsByFilters() {

        return "catalog/catalogPage";
    }
}
