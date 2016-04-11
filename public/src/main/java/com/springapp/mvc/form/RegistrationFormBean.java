package com.springapp.mvc.form;


import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Gataullin Kamil
 * 13.03.2016 0:10
 */
public class RegistrationFormBean {

    @NotEmpty(message = "Поле обязательно для заполнения")
    private String fio;

    @NotEmpty(message = "Поле обязательно для заполнения")
    private String login;

    @Size(min = 3, max = 13, message = "Введите верный номер телефона")
    private String phone;

    @Size(min=6, max=20, message="Пароль должен быть от 6 до 20 символов")
    private String password;

    @Size(min=6, max=20, message="Пароль должен быть от 6 до 20 символов")
    private String confirmPassword;

    public RegistrationFormBean() {
    }

    public RegistrationFormBean(String fio, String login, String password, String confirmPassword) {
        this.fio = fio;
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "RegistrationFormBean{" +
                "fio='" + fio + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}
