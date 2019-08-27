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
}