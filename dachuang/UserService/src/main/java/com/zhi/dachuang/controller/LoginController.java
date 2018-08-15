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
public class LoginController {

    @Autowired
    UserRepository userRepository;

    @PostMapping(value = "/login",produces = "application/json;charset=UTF-8")
    public String getByJson(@RequestBody JSONObject jsonObject){

        String email = jsonObject.getString("email");
        String password = jsonObject.getString("password");
        String verifyCode = jsonObject.getString("verifyCode");
        User user = userRepository.getByEmail(email);
        JSONObject result = new JSONObject();

        if (password.equals(user.getPassword())){
            result.put("status",0);
            result.put("message","登录成功");
            result.put("data",jsonObject.toString());
        }else{
            result.put("status",1);
            result.put("message","登录失败");
            result.put("data",jsonObject.toString());
        }
        return result.toJSONString();
    }
}
