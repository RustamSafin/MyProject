package com.springapp.mvc.controllers;

import com.springapp.mvc.aspects.annotation.IncludeMenuInfo;
import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.services.CatalogService;
import com.springapp.mvc.services.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Контроллер для работы с карточкой товара
 *
 * Gataullin Kamil
 * 28.02.2016 21:04
 */
@Controller
@RequestMapping(value = "/good", method = RequestMethod.GET)
public class GoodController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private GoodService goodService;

    @Autowired
    private CatalogService catalogService;

    /**
     * Отображение карточки товара
     *
     * @param goodId id товара
     */
    @IncludeMenuInfo
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String renderGoodPage(@PathVariable("id") Long goodId,Model model) {
        model.addAttribute("good", goodService.getGood(goodId));
        return "good/goodPage";
    }

    /**
     * Получаем подробную информацию о товаре в JSON
     *
     * @param goodId id товара
     */
    @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public GoodInfo getFullInfo(@PathVariable("id") Long goodId) {
        return goodService.getGood(goodId);
    }
}
