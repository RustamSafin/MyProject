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

    @NotEmpty(message = "Поле обязательно для заполнения")
    @Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}",
            message="Неверный формат email")
    private String email;


    @Size(min=6, max=20, message="Пароль должен быть от 6 до 20 символов")
    private String password;

    @Size(min=6, max=20, message="Пароль должен быть от 6 до 20 символов")
    private String confirmPassword;

    public RegistrationFormBean() {
    }



    public RegistrationFormBean(String fio, String email, String login, String password, String confirmPassword) {
        this.fio = fio;
        this.email = email;

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

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}
}
