package com.springapp.mvc.controllers;

import com.springapp.mvc.aspects.annotation.IncludeMenuInfo;
import com.springapp.mvc.form.OrderFormBean;
import com.springapp.mvc.form.RegistrationFormBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Created by Rustam on 10.04.2016.
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    public static final String ATTR_ORDER_FORM = "orderForm";

    @Autowired
    private HttpServletRequest request;

    /**
     * Отображение страницы заказа
     */
    @IncludeMenuInfo
    @RequestMapping(method = RequestMethod.GET)
    public String renderRegistrationPage() {
        request.setAttribute(ATTR_ORDER_FORM, new OrderFormBean());
        return "order/orderPage";
    }
    /**
     * Обработка формы заказа
     */
    @IncludeMenuInfo
    @RequestMapping(method = RequestMethod.POST)
    public String registrationForm(
            @Valid @ModelAttribute(ATTR_ORDER_FORM) OrderFormBean OrderFormBean,
            BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "order/orderPage";
        }
        // здесь должна происходить регистрация пользователя
        System.out.println(OrderFormBean);
        return "order/result";
    }
}
