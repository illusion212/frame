package com.hjw.frame.business.mapper;

import com.hjw.frame.business.pojo.ImUser;
import com.hjw.frame.common.mapper.MyMapper;

import java.util.List;

public interface ImUserMapper extends MyMapper<ImUser> {
    
    List<ImUser> getUser();
}