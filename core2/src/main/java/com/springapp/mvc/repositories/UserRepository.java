package com.springapp.mvc.repositories;

import com.springapp.mvc.common.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Gataullin Kamil
 * 28.03.2016 21:21
 */
public interface UserRepository extends JpaRepository<UserInfo,Long> {

    UserInfo getUserByLogin(String login);
    UserInfo getUserById(Long id);
}
