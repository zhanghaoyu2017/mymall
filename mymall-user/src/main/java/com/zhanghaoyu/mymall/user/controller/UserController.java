package com.zhanghaoyu.mymall.user.controller;

import com.zhanghaoyu.mymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName UserController
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2021/2/3-10:23
 * @Version 1.0
 **/
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello world";
    }
}
