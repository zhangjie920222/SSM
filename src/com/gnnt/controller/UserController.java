package com.gnnt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gnnt.model.User;
import com.gnnt.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
    UserService userService;
	

	@RequestMapping(value = "/findAllUser",method=RequestMethod.GET)
	@ResponseBody
	public List<User> findAllUser(HttpServletRequest request){
		String id = request.getParameter("id");
		List<User> listUser =  userService.findAllUser();
		
		request.setAttribute("listUser", listUser);
		return listUser;
	}
}
