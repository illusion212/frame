package com.hjw.frame.business.controller;

import com.hjw.frame.business.pojo.ImUser;
import com.hjw.frame.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <Description>
 *
 * @author HJW
 * @version 1.0
 * @createDate 2019/10/09 9:48
 * @see com.hjw.frame.business.controller
 */
@RestController
public class UserController {
    
    @Autowired
    UserService userService;
    
    public List<ImUser> getUser(){
        return userService.getUser();
    }
}
