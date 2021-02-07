package com.zhanghaoyu.mymall.user.controller;

import com.zhanghaoyu.mymall.user.bean.UmsMember;
import com.zhanghaoyu.mymall.user.bean.UmsMemberReceiveAddress;
import com.zhanghaoyu.mymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

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


    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {

        List<UmsMember> umsMembers = userService.getAllUser();

        return umsMembers;
    }
    @RequestMapping("getReceiveAddress")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {

        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userService.getReceiveAddressByMemberId(memberId);

        return umsMemberReceiveAddresses;
    }
    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello world";
    }
}
