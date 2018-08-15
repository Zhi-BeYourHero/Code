package com.zhi.dachuang.controller;

import com.alibaba.fastjson.JSONObject;
import com.zhi.dachuang.entity.User;
import com.zhi.dachuang.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhi
 */

@RestController
public class RegisterController {

    @Autowired
    UserRepository userRepository;
    /*
    * 通过RequestBody方式来获取JSON数据
    * */
    @PostMapping(value = "/register",produces = "application/json;charset=UTF-8")
    public String getByJson(@RequestBody JSONObject jsonObject){
        String username = jsonObject.getString("userName");
        String password = jsonObject.getString("password");
        String email = jsonObject.getString("email");
        JSONObject result = new JSONObject();
        if (userRepository.getByEmail(email)!=null){
            result.put("status",1);
            result.put("message","注册失败，邮箱已被注册");
            result.put("data",jsonObject.toString());
            return result.toJSONString();
        }else if (userRepository.getByUsername(username)!=null){
            result.put("status",1);
            result.put("message","注册失败，用户名已经被使用");
            result.put("data",jsonObject.toString());
            return result.toJSONString();
        }else{
            User user = new User();
            user.setEmail(email).setUsername(username).setPassword(password);
            User save = userRepository.save(user);
            result.put("status",0);
            result.put("message","注册成功");
            result.put("data",jsonObject.toString());
            return result.toJSONString();
        } }
    }
