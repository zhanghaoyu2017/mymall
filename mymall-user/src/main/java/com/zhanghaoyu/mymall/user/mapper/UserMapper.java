package com.zhanghaoyu.mymall.user.mapper;


import com.zhanghaoyu.mymall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @InterfaceName UserMapper
 * @Description T0D0
 * @Author zhanghaoyu
 * @Date 2021/2/3-10:25
 * @Version 1.0
 **/
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
