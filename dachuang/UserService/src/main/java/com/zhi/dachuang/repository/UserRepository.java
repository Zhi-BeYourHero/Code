package com.zhi.dachuang.repository;

import com.zhi.dachuang.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author zhi
 */
public interface UserRepository extends JpaRepository<User,Integer>{

    User getByEmail(String email);
    User getByUsername(String username);
}
