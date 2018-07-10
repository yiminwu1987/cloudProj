package com.yiminwu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yiminwu.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
   
   public User findByName(String name);
   
   public User findByPhone(String phone);
   
   public User findByCode(String code);

}
