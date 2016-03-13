package com.springapp.mvc.controllers;

import com.springapp.mvc.common.GoodInfo;
import com.springapp.mvc.common.MenuInfo;
import com.springapp.mvc.services.CatalogService;
import com.springapp.mvc.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Контроллер главной страницы
 */
@Controller
public class MainController {

	@Autowired
	private MenuService menuService;
	@Autowired
	private CatalogService catalogService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String renderMain(ModelMap model) {
		// TODO вынести в аспект
		List<MenuInfo> listMenu = menuService.getMainMenu();
		model.addAttribute("listMenu", listMenu);

		List<GoodInfo> topGoods = catalogService.getTopGoodsForMain();
		model.addAttribute("topGoods", topGoods);
		return "main/main";
	}
}