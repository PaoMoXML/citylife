/**
 * @author XuMenglin
 * @date 2019年9月2日
 *
 */
package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TypeMapper;
import com.pojo.Type;
import com.service.TypeService;

/**
 * <p>Title: TypeServiceImpl</p>
 * <p>Description: </p>
 * @author XuMenglin
 * @date 2019年9月2日
 */
@Service("TypeService")
public class TypeServiceImpl implements TypeService{
	
	@Autowired
	TypeMapper typeMapper;

	/**
	 * <p>Title: selectType</p>
	 * <p>Description: 查询类型</p>
	 * @param record
	 * @return
	 * @see com.service.TypeService#selectType(com.pojo.Type)
	 */
	@Override
	public Type selectType(Type record) {
		return typeMapper.selectType(record);
	}

}
