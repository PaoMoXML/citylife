/**
 * @author XuMenglin
 * @date 2019年8月26日
 *
 */
package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.pojo.User;
import com.service.UserService;

/**
 * <p>Title: userServiceImpl</p>
 * <p>Description: </p>
 * @author XuMenglin
 * @date 2019年8月26日
 */
@Service("UserService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	/**
	 * <p>Title: Login</p>
	 * <p>Description: 用户登录 </p>
	 * @param record
	 * @return
	 * @see com.service.UserService#Login(com.pojo.User)
	 */
	@Override
	public User Login(User record) {
		return userMapper.Login(record);
	}
	/**
	 * <p>Title: reg</p>
	 * <p>Description: 用户注册</p>
	 * @param record
	 * @return
	 * @see com.service.UserService#reg(com.pojo.User)
	 */
	@Override
	public int reg(User record) {
		return userMapper.reg(record);
	}

}
