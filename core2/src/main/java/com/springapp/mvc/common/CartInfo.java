package com.springapp.mvc.common;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Map;

/**
 * Содержимое корзины
 *
 * Gataullin Kamil
 * 02.03.2016 0:23
 */
//@Entity
//@Table(name = "h_carts")
public class CartInfo {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    /**
//     * key - id товара, value - кол-во товара
//     */
//    @ManyToOne
//    @JoinColumn(name = "good_id")
//    private GoodInfo goodInfo;
//
//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    private UserInfo userInfo;


    private Map<Long, Integer> goods;

    public Map<Long, Integer> getGoods() {
        return goods;
    }

    public void setGoods(Map<Long, Integer> goods) {
        this.goods = goods;
    }
}
