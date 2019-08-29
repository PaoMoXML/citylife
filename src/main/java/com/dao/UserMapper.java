package com.dao;

import com.pojo.User;
import com.pojo.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    /**
     *<p>Title: Login</p>
     *<p>Description: 用户登录</p>
     * @param record
     * @return
     */
    User Login(User record);
    
    /**
     *<p>Title: reg</p>
     *<p>Description: 用户注册</p>
     * @param record
     * @return
     */
    int reg(User record);
    
    /**
     *<p>Title: regtest</p>
     *<p>Description: 注册检验</p>
     * @param record
     * @return
     */
    List<User> regtest(User record);
    
    /**
     *<p>Title: change</p>
     *<p>Description: 修改用户信息</p>
     * @param record
     * @return
     */
    int change(User record);
    
    /**
     *<p>Title: del</p>
     *<p>Description:删除（将用户状态修改为1） </p>
     * @param record
     * @return
     */
    int del(User record);
}