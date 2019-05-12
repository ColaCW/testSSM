package com.lgq.cotroller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lgq.obj.UserObj;
import com.lgq.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	@ResponseBody
	@RequestMapping(value = "/test")
	public String getBlogs(HttpSession session, HttpServletRequest request, HttpServletResponse response) {
		try {
			return "234";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "123";
	}
	
	
	@Resource
    private UserService userService;
	
	@ResponseBody
    @RequestMapping(value = "/list")
    public List<UserObj> list()
    {
        return userService.findAll();
    }
    
}
