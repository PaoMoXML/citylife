/**
 * @author XuMenglin
 * @date 2019年8月26日
 *
 */
package com.service;

import java.util.List;

import com.pojo.Info;

/**
 * <p>Title: InfoService</p>
 * <p>Description: 信息</p>
 * @author XuMenglin
 * @date 2019年8月26日
 */
public interface InfoService {
	
	
	List<Info> likeSearch(Info record);
	
	List<Info> search(Info record);

	List<Info> adminInfo(Info record);
	
	Info selectByPrimaryKey(Integer id);
	
	int insert(Info record);
	
	List<Info> idSearch(Info record);
	
	int del(Info record);
	
	int change(Info record);
}
