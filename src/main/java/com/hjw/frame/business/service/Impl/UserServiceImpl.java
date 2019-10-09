package com.hjw.frame.business.service.Impl;

import com.hjw.frame.business.mapper.ImUserMapper;
import com.hjw.frame.business.pojo.ImUser;
import com.hjw.frame.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <Description>
 *
 * @author HJW
 * @version 1.0
 * @createDate 2019/10/09 9:39
 * @see com.hjw.frame.business.service.Impl
 */
@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    ImUserMapper userMapper;
    
    @Override
    public List<ImUser> getUser() {
        List<ImUser> list= userMapper.selectAll();
        list = userMapper.getUser();
        return list;
    }
}
