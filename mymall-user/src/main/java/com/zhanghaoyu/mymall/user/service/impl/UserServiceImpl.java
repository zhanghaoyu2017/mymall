package com.zhanghaoyu.mymall.user.service.impl;

import com.zhanghaoyu.mymall.user.mapper.UserMapper;
import com.zhanghaoyu.mymall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2021/2/3-10:24
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
}
