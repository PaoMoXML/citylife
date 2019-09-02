package com.dao;

import com.pojo.Info;
import com.pojo.InfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface InfoMapper {
    long countByExample(InfoExample example);

    int deleteByExample(InfoExample example);

    int deleteByPrimaryKey(Integer id);

    /**
     *<p>Title: insert</p>
     *<p>Description: 添加信息</p>
     * @param record
     * @return
     */
    int insert(Info record);

    int insertSelective(Info record);

    List<Info> selectByExample(InfoExample example);

    /**
     *<p>Title: selectByPrimaryKey</p>
     *<p>Description: 输入id查询</p>
     * @param id
     * @return
     */
    Info selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKey(Info record);
    
    /**
     *<p>Title: likeSearch</p>
     *<p>Description: 模糊查询</p>
     * @param record
     * @return
     */
    List<Info> likeSearch(Info record);
    
    /**
     *<p>Title: search</p>
     *<p>Description:查询 </p>
     * @param record
     * @return
     */
    List<Info> search(Info record);
    
    /**
     *<p>Title: adminInfo</p>
     *<p>Description:管理员界面信息查询 </p>
     * @param record
     * @return
     */
    List<Info> adminInfo(Info record);
    
    /**
     *<p>Title: idSearch</p>
     *<p>Description: 用id查询信息</p>
     * @param record
     * @return
     */
    List<Info> idSearch(Info record);
    
    /**
     *<p>Title: del</p>
     *<p>Description:删除（修改状态为1） </p>
     * @param record
     * @return
     */
    int del(Info record);
    
    /**
     *<p>Title: change</p>
     *<p>Description: 修改信息</p>
     * @param record
     * @return
     */
    int change(Info record);
    
    /**
     *<p>Title: shownew</p>
     *<p>Description: 显示最新免费消息</p>
     * @param record
     * @return
     */
    Info shownew(Info record);
    
    Info shownew2(Info record);
}