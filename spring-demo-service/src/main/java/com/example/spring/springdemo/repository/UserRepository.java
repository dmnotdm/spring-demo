package com.example.spring.springdemo.repository;

import com.example.spring.springdemo.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * Created by zhizhao.zhang on 2019/02/23 21:40.
 * Description:
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query(value = "select * from user where name = ?1", nativeQuery = true)
    User findAllByIdAndNameOrderByName(String name);

    String findNameById(Integer id);
}
