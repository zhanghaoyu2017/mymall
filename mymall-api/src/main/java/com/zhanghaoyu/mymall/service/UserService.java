package com.zhanghaoyu.mymall.service;


import com.zhanghaoyu.mymall.bean.UmsMember;
import com.zhanghaoyu.mymall.bean.UmsMemberReceiveAddress;

import java.util.List;

/**
 * @InterfaceName UserService
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2021/2/3-10:24
 * @Version 1.0
 **/
public interface UserService {

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
