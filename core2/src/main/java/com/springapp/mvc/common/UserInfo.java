package com.springapp.mvc.common;


import javax.persistence.*;


/**
 * Created by Rustam on 04.04.2016.
 */
@Entity
@Table(name = "h_users")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * ФИО пользователя
     */
    private String fio;
    /**
     * Логин пользователя для входа на сайт, он же email
     */
    private String login;

    /**
     * hash пароля пользователя
     */
    private String hashPassword;
    /**
     * Права доступа пользователя (возможные значения 'ROLE_USER', 'ROLE_ADMIN')
     */
    private String role;
    /**
     * Уникальный ключ для подтверждения пользователя, отправляется по почте
     */
    private String email;

    /**
     * Флаг, что пользователь подтвержден и активен.
     */
    private Boolean enabled;

    public UserInfo(){}

    public UserInfo(String fio,String login,String email,String hashPassword,String role) {
        this.fio=fio;
        this.login=login;
        this.email=email;
        this.hashPassword=hashPassword;
        this.role=role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {this.email = email;}

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
}
