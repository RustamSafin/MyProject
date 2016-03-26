package com.springapp.mvc.services;

import com.springapp.mvc.common.CartInfo;
import com.springapp.mvc.util.Constants;
import org.springframework.stereotype.Service;



import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Gataullin Kamil
 * 02.03.2016 0:20
 */
@Service
public class CartService {


    /**
     * Добавление товара в корзину
     */
    public void addInCart(HttpSession session, Long goodId, Integer count) {
        CartInfo cart = (CartInfo) session.getAttribute(Constants.SESSION_CART);
        if (cart == null) {
            cart = new CartInfo();
        }
        if (cart.getGoods() == null) {
            Map<Long, Integer> map = new HashMap<Long, Integer>();
            map.put(goodId, count);
            cart.setGoods(map);
        } else {
            if (cart.getGoods().containsKey(goodId)) {
                cart.getGoods().put(goodId, count);
            } else {
                cart.getGoods().put(goodId, count);
            }
        }
        session.setAttribute(Constants.SESSION_CART, cart);
    }
    public void removeFromCart(HttpSession session, Long goodId) {
        CartInfo cart = (CartInfo) session.getAttribute(Constants.SESSION_CART);
        if (cart!=null) {
            cart.getGoods().remove(goodId);

        }
    }
    public CartInfo getCart (HttpSession session) {
        return (CartInfo) session.getAttribute("cart");
    }
}
