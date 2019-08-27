/**
 * @author XuMenglin
 * @date 2019年8月26日
 *
 */
package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.InfoMapper;
import com.pojo.Info;
import com.service.InfoService;

/**
 * <p>Title: InfoServiceImpl</p>
 * <p>Description: </p>
 * @author XuMenglin
 * @date 2019年8月26日
 */
@Service("InfoService")
public class InfoServiceImpl implements InfoService{

	@Autowired
	InfoMapper infoMapper;
	/**
	 * <p>Title: likeSearch</p>
	 * <p>Description: 模糊查询</p>
	 * @param record
	 * @return
	 * @see com.service.InfoService#likeSearch(com.pojo.Info)
	 */
	@Override
	public List<Info> likeSearch(Info record) {
		return infoMapper.likeSearch(record);
	}
	/**
	 * <p>Title: search</p>
	 * <p>Description: 查询</p>
	 * @param record
	 * @return
	 * @see com.service.InfoService#search(com.pojo.Info)
	 */
	@Override
	public List<Info> search(Info record) {
		return infoMapper.search(record);
	}
	/**
	 * <p>Title: adminInfo</p>
	 * <p>Description: 管理员查询信息</p>
	 * @param record
	 * @return
	 * @see com.service.InfoService#adminInfo(com.pojo.Info)
	 */
	@Override
	public List<Info> adminInfo(Info record) {
		return infoMapper.adminInfo(record);
	}
	/**
	 * <p>Title: selectByPrimaryKey</p>
	 * <p>Description:输入id查询 </p>
	 * @param id
	 * @return
	 * @see com.service.InfoService#selectByPrimaryKey(java.lang.Integer)
	 */
	@Override
	public Info selectByPrimaryKey(Integer id) {
		return infoMapper.selectByPrimaryKey(id);
	}
	/**
	 * <p>Title: insert</p>
	 * <p>Description: 添加信息</p>
	 * @param record
	 * @return
	 * @see com.service.InfoService#insert(com.pojo.Info)
	 */
	@Override
	public int insert(Info record) {
		return infoMapper.insert(record);
	}

}
