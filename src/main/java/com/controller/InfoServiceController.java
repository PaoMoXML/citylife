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
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pojo.Info;
import com.service.InfoService;
import com.utils.Page;

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
	public List<Info> adminSearch(@RequestBody Info record) {
		record.setInfostatus("0");
		JSONObject json = new JSONObject();
		List<Info> info = infoService.adminInfo(record);
		json.put("key", info);
		return info;
	}
	
	/**
	 *<p>Title: selectID</p>
	 *<p>Description:输入id查询 </p>
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/selectID")
	public String selectID(@RequestBody Integer id) {
		JSONObject json = new JSONObject();
		Info info = infoService.selectByPrimaryKey(id);
		json.put("key", info);
		return json.toJSONString();
	}
	
	/**
	 *<p>Title: add</p>
	 *<p>Description: 添加信息</p>
	 * @param record
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/add")
	public String add(@RequestBody Info record) {
		JSONObject json = new JSONObject();
		//0为正常状态，未交费，未审核
		String b = "0";
		record.setInfocheck(b);
		record.setInfopayfor(b);
		record.setInfostatus(b);
		int a = infoService.insert(record);
		if(a==1) {
			json.put("key", "success");
		}else {
			json.put("key","error");
		}
		return json.toJSONString();
	}
	
	/**
	 *<p>Title: show</p>
	 *<p>Description: sigleshow</p>
	 * @param record
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/show")
	public ModelAndView show(Info record,Page page) {
		record.setInfostatus("0");
		PageHelper.offsetPage(page.getStart(),1);
		List<Info> info = infoService.adminInfo(record);
		int total = (int) new PageInfo<>(info).getTotal();
		page.calculateLast(total);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("pages/show/singleshow");
		mav.addObject("info", info);
		return mav;
	}
	
	/**
	 *<p>Title: listshow</p>
	 *<p>Description: listshow显示内容</p>
	 * @param record
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/listshow")
	public ModelAndView listshow(Info record,Page page) {
		record.setInfostatus("0");
		PageHelper.offsetPage(page.getStart(),1);
		record.setInfopayfor("0");
		List<Info> info01 = infoService.adminInfo(record);
		record.setInfopayfor("1");
		List<Info> info1 = infoService.adminInfo(record);
		int total = (int) new PageInfo<>(info01).getTotal();
		page.calculateLast(total);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("pages/show/listshow");
		mav.addObject("info0", info01);
		mav.addObject("info1", info1);
		return mav;
	}
	
	@ResponseBody
	@RequestMapping(value = "/idSearch")
	public List<Info> idSearch(@RequestBody Info record) {
		record.setInfostatus("0");
		List<Info> list = infoService.idSearch(record);
		JSONObject json = new JSONObject();
		json.put("key", list);
		return list;
	}
	
	/**
	 *<p>Title: del</p>
	 *<p>Description:删除信息（修改信息状态为2） </p>
	 * @param record
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/del")
	public String del(@RequestBody Info record) {
		record.setInfostatus("1");
		int a = infoService.del(record);
		System.out.println(a);
		JSONObject json = new JSONObject();
		if(a==1) {
			json.put("key", "success");
		}else {
			json.put("key", "error");
		}
		return json.toJSONString();
	}
	
	/**
	 *<p>Title: change</p>
	 *<p>Description:修改信息 </p>
	 * @param record
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/change")
	public String change(@RequestBody Info record) {
		int a = infoService.change(record);
		System.out.println(a);
		JSONObject json = new JSONObject();
		if(a==1) {
			json.put("key", "success");
		}else {
			json.put("key", "error");
		}
		return json.toJSONString();
	}
	
	
	
	
	
}
