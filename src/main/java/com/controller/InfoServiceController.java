/**
 * @author XuMenglin
 * @date 2019年8月26日
 *
 */
package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.dao.InfoMapper;
import com.pojo.Info;
import com.service.InfoService;

/**
 * <p>Title: InfoServiceController</p>
 * <p>Description:INFO控制器 </p>
 * @author XuMenglin
 * @date 2019年8月26日
 */
@Controller
@RequestMapping(value = "/info")
public class InfoServiceController {
	@Autowired
	InfoService infoService;
	
	/**
	 *<p>Title: likeSearch</p>
	 *<p>Description: 模糊查询信息</p>
	 * @param record
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/likeSearch")
	public String likeSearch(@RequestBody Info record) {
		JSONObject json = new JSONObject();
		List<Info> i = infoService.likeSearch(record);
		json.put("key", i);
		return json.toJSONString();
	}
	
	/**
	 *<p>Title: search</p>
	 *<p>Description: 查询信息（非模糊）</p>
	 * @param record
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/search")
	public String search (@RequestBody Info record) {
		JSONObject json = new JSONObject();
		List<Info> i = infoService.search(record);
		json.put("key", i);
		return json.toJSONString();
	}
	
	/**
	 *<p>Title: adminSearch</p>
	 *<p>Description: 管理员查询信息</p>
	 * @param record
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/adminSearch")
	public String adminSearch(@RequestBody Info record) {
		record.setInfostatus("0");
		JSONObject json = new JSONObject();
		List<Info> info = infoService.adminInfo(record);
		json.put("key", info);
		return json.toJSONString();
	}
}
