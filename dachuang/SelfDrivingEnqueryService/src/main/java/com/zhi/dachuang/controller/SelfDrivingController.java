package com.zhi.dachuang.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhi
 */

@RestController
public class SelfDrivingController {

    @GetMapping("/selfDrvingService")
    public String enqeury(){
        JSONObject result = new JSONObject();
        result.put("status",0);
        result.put("message","json");
        result.put("data","成功使用自驾车出行服务");
        return result.toJSONString();
    }
}
