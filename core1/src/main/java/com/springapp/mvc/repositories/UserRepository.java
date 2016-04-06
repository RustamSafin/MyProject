package com.springapp.mvc.repositories;

import com.springapp.mvc.common.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Gataullin Kamil
 * 28.03.2016 21:21
 */
public interface UserRepository extends JpaRepository<UserInfo,Long> {
//
//    void add(UserInfo userInfo);
//
//    UserInfo getUserByLogin(String login);
}
