/**
 * @author XuMenglin
 * @date 2019年8月26日
 *
 */
package com.service.impl;

import java.util.List;

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
	/**
	 * <p>Title: regtest</p>
	 * <p>Description: 注册检验</p>
	 * @param record
	 * @return
	 * @see com.service.UserService#regtest(com.pojo.User)
	 */
	@Override
	public List<User> regtest(User record) {
		return userMapper.regtest(record);
	}
	/**
	 * <p>Title: change</p>
	 * <p>Description: 用户信息修改</p>
	 * @param record
	 * @return
	 * @see com.service.UserService#change(com.pojo.User)
	 */
	@Override
	public int change(User record) {
		return userMapper.change(record);
	}
	/**
	 * <p>Title: del</p>
	 * <p>Description:用户删除（用户状态信息改为1） </p>
	 * @param record
	 * @return
	 * @see com.service.UserService#del(com.pojo.User)
	 */
	@Override
	public int del(User record) {
		return userMapper.del(record);
	}
	
	

}
