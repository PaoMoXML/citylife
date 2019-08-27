/**
 * @author XuMenglin
 * @date 2019年8月26日
 *
 */
package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.pojo.User;
import com.service.UserService;

/**
 * <p>Title: UserController</p>
 * <p>Description: 用户控制器</p>
 * @author XuMenglin
 * @date 2019年8月26日
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	UserService userService;
	
	/**
	 *<p>Title: login</p>
	 *<p>Description:用户登录 </p>
	 * @param record
	 * @return
	 */
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login(User record) {
		User u = new User();
		u = userService.Login(record);
		if(u.getUserpassword().equals(record.getUserpassword())) {
			return"pages/admin/view/AdminTemp";
		}else {
			
			return "error";
		}
		
	}
	
	/**
	 *<p>Title: reg</p>
	 *<p>Description: 注册</p>
	 * @param record
	 * @return
	 */
	@RequestMapping(value = "/reg")
	@ResponseBody
	public String reg(@RequestBody User record) {
		JSONObject json = new JSONObject();
		String statue = "0";
		//设置用户状态为可用
		record.setUserstatue(statue);
		if(userService.Login(record).getUsername().equals("") || userService.Login(record).getUsername()==null ) {
			int u = userService.reg(record);
			if(u==1) {
				json.put("key", "success");
				return json.toJSONString();
			}else {
				json.put("key", "error");
				return json.toJSONString();	
			}
		}else {
			json.put("key", "用户名已存在");
			return json.toJSONString();
		}
	}
	
	
}

