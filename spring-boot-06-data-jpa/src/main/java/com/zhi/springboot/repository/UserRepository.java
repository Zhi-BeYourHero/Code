package com.zhi.springboot.repository;

import com.zhi.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
}
