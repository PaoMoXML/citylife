/**
 * @author XuMenglin
 * @date 2019年8月26日
 *
 */
package com.service;

import java.util.List;

import com.pojo.User;

/**
 * <p>Title: userService</p>
 * <p>Description: 用户信息处理业务</p>
 * @author XuMenglin
 * @date 2019年8月26日
 */
public interface UserService {
	
	User Login(User record);
	
	int reg(User record);
	
	List<User> regtest(User record);
	
	int change(User record);
	
	int del(User record);

}
