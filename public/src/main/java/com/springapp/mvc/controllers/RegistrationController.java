package com.springapp.mvc.controllers;

import com.mailsender.tls.Sender;
import com.springapp.mvc.aspects.annotation.IncludeMenuInfo;
import com.springapp.mvc.common.UserInfo;
import com.springapp.mvc.form.RegistrationFormBean;
import com.springapp.mvc.services.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * Контроллер для регистрации новых пользователей
 *
 * Gataullin Kamil
 * 12.03.2016 22:53
 */
@Controller
@RequestMapping("/reg")
public class RegistrationController {

    public static final String ATTR_REGISTRATION_FORM = "regForm";

    @Autowired
    private UserService userService;
    @Autowired
    private HttpServletRequest request;

    /**
     * Отображение страницы регистрации
     */
    @IncludeMenuInfo
    @RequestMapping(method = RequestMethod.GET)
    public String renderRegistrationPage() {
        request.setAttribute(ATTR_REGISTRATION_FORM, new RegistrationFormBean());
//        request.setAttribute("loginErr",false);

        return "registration/registrationPage";
    }

    /**
     * Обработка формы Регистрации
     */
    @IncludeMenuInfo
    @RequestMapping(method = RequestMethod.POST)
    public String registrationForm(
            @Valid @ModelAttribute(ATTR_REGISTRATION_FORM) RegistrationFormBean registrationFormBean,
//            RegistrationFormBean registrationFormBean, // TODO хотя работает и без этой аннотации, обычно её используют для переименования аргумента
            BindingResult bindingResult,String fio ,String email, String login, String password) {
        if (bindingResult.hasErrors()) {
            return "registration/registrationPage";
        }
        if (userService.getUserByLogin(login)==null) {
            userService.add(new UserInfo(fio, login, email, md5Decoder(password), "ROLE_USER"));
        } else {
            request.setAttribute("loginErr",true);
            return "registration/registrationPage";
        }
        Sender sender= new Sender("lightbulb220kazan@gmail.com","light220kazan");
        sender.send("CONFIRM REGISTRATION",fio+", Вы успешно прошли регистрацию на сайте LightBulbs\n"+
                "Для подтверждения своего аккаунта пройдите по указанной ссылке :\n"+
                "http://localhost:8080/reg/enable?id="+userService.getUserByLogin(login).getId(),email);
//        System.out.println(registrationFormBean);
        return "redirect:/";
    }
    @RequestMapping(value = "/enable",method = RequestMethod.GET)
    public String enableUser(Long id) {
        UserInfo user=userService.getUserById(id);
        user.setEnabled(true);
        userService.update(user);
        return "redirect:/login";
    }
    private String md5Decoder(String pass) {
        String md5Hex = DigestUtils.md5Hex(pass);
        return md5Hex;
    }
}
