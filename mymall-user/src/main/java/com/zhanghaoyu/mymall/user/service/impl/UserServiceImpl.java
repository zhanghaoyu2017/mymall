package com.zhanghaoyu.mymall.user.service.impl;

import com.zhanghaoyu.mymall.service.UserService;
import com.zhanghaoyu.mymall.bean.UmsMember;
import com.zhanghaoyu.mymall.bean.UmsMemberReceiveAddress;
import com.zhanghaoyu.mymall.user.mapper.UmsMemberReceiveAddressMapper;
import com.zhanghaoyu.mymall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

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
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        //List<UmsMember> umsMemberList = userMapper.selectAllUser();
        //改成通用mapper的方式查询
        List<UmsMember> umsMemberList =userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.selectByExample(e);
        return umsMemberReceiveAddressList;
    }
}
