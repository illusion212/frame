package com.hjw.frame.appinit;

import com.hjw.frame.business.controller.UserController;
import com.hjw.frame.business.pojo.ImUser;
import com.hjw.frame.business.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component 
public class Appinit implements CommandLineRunner {

	@Autowired
	UserController userController;
	
	@Override
	public void run(String... arg0) throws Exception {
		List<ImUser> list= userController.getUser();
        list.forEach(user->System.out.println(user));
	}
}
