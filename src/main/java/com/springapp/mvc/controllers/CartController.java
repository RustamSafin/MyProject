package com.springapp.mvc.controllers;

import com.springapp.mvc.common.CartInfo;
import com.springapp.mvc.common.MenuInfo;
import com.springapp.mvc.services.CartService;
import com.springapp.mvc.services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Контроллер для работы с корзиной
 *
 * Gataullin Kamil
 * 02.03.2016 0:17
 */
@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private HttpServletRequest request;
    @Autowired
    private CartService cartService;
    @Autowired
    private MenuService menuService;

    /**
     * Отображение содержимого коорзины
     */
    @RequestMapping
    public String renderCart(Model model) {
        CartInfo cart= cartService.getCart(request.getSession());
        List<MenuInfo> listMenu = menuService.getMainMenu();
        model.addAttribute("listMenu", listMenu);
        Map<String,Integer> cartFreemarker = null;
        if (cart==null){
            cart=new CartInfo();
            cartFreemarker = new HashMap<String,Integer>();
        } else {
            cartFreemarker = new HashMap<String,Integer>();
            for (Long aLong: cart.getGoods().keySet()) {
                cartFreemarker.put(String.valueOf(aLong),cart.getGoods().get(aLong));
            }
        }
        request.setAttribute("fCart",cartFreemarker);
        return "cart/cartPage";
    }

    /**
     * Добавление товара в корзину
     *
     * @param goodId id товара
     */
    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addInCart(Long goodId) {
        cartService.addInCart(request.getSession(), goodId, 1);
        return "ok";
    }
    @ResponseBody
    @RequestMapping(value = "/change", method = RequestMethod.POST)
    public String changeQuantity(Long goodId , Integer count) {
        cartService.addInCart(request.getSession(),goodId,count);
        return "done";
    }
    @ResponseBody
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public String removeFromCart(Long goodId) {
        cartService.removeFromCart(request.getSession(),goodId);
        return "removed";
    }
}
