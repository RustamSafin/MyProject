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
import java.math.BigDecimal;
import java.util.ArrayList;
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
                                @RequestParam(required = false, defaultValue = "9") Integer limit,
                                Model model) {

        List<GoodInfo> goods = catalogService.getGoodsByCategoryId(id);
        model.addAttribute("goods", goods);

        CatalogFilterInfo catalogFilter = catalogService.getCatalogFilters();
        model.addAttribute("catalogFilter", catalogFilter);

        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        model.addAttribute("goodsCount", catalogService.countAllGoods());
        return "catalog/catalogPage";
    }
    /**
     * Отображение главной страницы каталога
     */
    @IncludeMenuInfo
    @RequestMapping(method = RequestMethod.GET)
    public String renderCatalogForAll(@RequestParam(value = "page", required = false, defaultValue = "1") Integer page,
                                @RequestParam(required = false, defaultValue = "9") Integer limit,
                                Model model) {
        List<GoodInfo> goods = catalogService.getAllGoods();
        model.addAttribute("goods",goods.subList(0,limit));
        CatalogFilterInfo catalogFilter = catalogService.getCatalogFilters();
        model.addAttribute("catalogFilter", catalogFilter);

        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
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
    public String showMoreGoods(Integer page, Integer limit, Model model,@RequestParam(value ="sort",required = false,defaultValue = "") String sort) { //@RequestParam(value ="sort",required = false,defaultValue = "") String sort
        // Эта страшная проверка с page и limit только для теста, так как у нас пока нет реальных данных
        List<GoodInfo> goods = catalogService.getSortedGoods(sort);
        model.addAttribute("goods",(catalogService.countAllGoods()>page*limit)? goods.subList((page-1)*limit,page*limit):goods.subList((page-1)*limit,catalogService.countAllGoods()));
        return "catalog/ajaxGoods";
    }
    @RequestMapping(value = "/sort", method = RequestMethod.GET)
    public String sortGoods(
            Model model,@RequestParam(value ="sort",required = false,defaultValue = "") String sort, @RequestParam(required = false,defaultValue = "9") Integer limit,
                            @RequestParam(value = "page",defaultValue = "1") Integer page) {
        List<GoodInfo> goods= catalogService.getSortedGoods(sort);
//        if (id==null) {
//            goods = catalogService.getSortedGoods(sort);
//        } else {
//            goods =catalogService.getSortedGoods(id,sort);
//        }
        model.addAttribute("goods",goods.subList((page-1)*limit,page*limit));
        return "catalog/sortedGoods";
    }
    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public String findGoodsByFilter(Model model,@RequestParam(value = "categories",required = false,defaultValue = "") String categories,String brands,BigDecimal minPrice,BigDecimal maxPrice, @RequestParam(required = false,defaultValue = "9") Integer limit,
                                    @RequestParam(value = "page",defaultValue = "1") Integer page) {
        //List<GoodInfo> goods = catalogService.findGoodsByFiltres()
        return "catalog/sortedGoods";
    }
}
