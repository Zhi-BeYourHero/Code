package com.zhi.dachuang.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author zhi
 */

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Data
public class User implements Serializable{
    private Integer id;
    private String username;
    private String password;
    private String email;
}
