package com.zhi.dachuang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;

/**
 * @author zhi
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain=true)
@Entity
@Table(name="user")
public class User {
    @Id//这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;

    @Column(name="password")
    private String password;

    @Column(name = "username", length = 50)
    private String username;

    @Column//省略就默认列名是属性名
    private String email;
}
