package com.example.spring.springdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zhizhao.zhang on 2019/02/23 21:40.
 * Description:
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private Integer id;
    private String name;
}
