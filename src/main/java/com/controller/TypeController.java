/**
 * @author XuMenglin
 * @date 2019年9月2日
 *
 */
package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.pojo.Type;
import com.service.TypeService;

/**
 * <p>Title: TypeController</p>
 * <p>Description: </p>
 * @author XuMenglin
 * @date 2019年9月2日
 */
@Controller
@RequestMapping(value = "/type")
public class TypeController {

	@Autowired
	TypeService typeService;
	
	@RequestMapping(value = "/ShowType")
	@ResponseBody
	public String ShowType(Type record) {
		JSONObject json = new JSONObject();
		System.out.println(record.getTypesign());
		Type type = typeService.selectType(record);
		json.put("key", type);
		return json.toJSONString();
		
	}
}
