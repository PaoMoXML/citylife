/**
 * @author XuMenglin
 * @date 2019年8月27日
 *
 */
package com.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

/**
 * <p>Title: test</p>
 * <p>Description: </p>
 * @author XuMenglin
 * @date 2019年8月27日
 */
public class spilt {
	public static void main(String[] args) {
//		//遍历map
//		Map<String,String> map = new HashMap<String, String>();
//		map.put("1", "value1");
//		map.put("2", "value2");
//		map.put("3", "value3");
//		
//		System.out.println("通过map.keySet遍历key和value:");
//		for(String key : map.keySet()) {
//			System.out.println("key=" + key + "and value=" + map.get(key));
//			
//			}
//		//遍历数组
//		String [] a = {"he","she","it"};
//		for (String ab : a) {
//			System.out.println(ab);
//		}
//		
		String sp = "a,b,c";
		String[] finish = sp.split(",");
//		System.out.println(sp);
//		System.out.println(Arrays.toString(finish));
		for(int i = 0; i<finish.length;i++) {
			System.out.println(finish[i]);
		}
		
//		
//		for(String key : finish) {
//			System.out.println(key);
//		}
		
//		char[] abc = {1,2,3};
//		for(int i : abc) {
//			System.out.println(i);
//		}
		
		
//	    String str = "www-runoob-com";
//	      String[] temp;
//	      String delimeter = "-";  // 指定分割字符
//	      temp = str.split(delimeter); // 分割字符串
//	      // 普通 for 循环
//	      for(int i =0; i < temp.length ; i++){
//	         System.out.println(temp[i]);
//	         System.out.println("");
//	      }
	 
//	      System.out.println("------java for each循环输出的方法-----");
//	      String str1 = "www.runoob.com";
//	      String[] temp1;
//	      String delimeter1 = "\\.";  // 指定分割字符， . 号需要转义
//	      temp1 = str1.split(delimeter1); // 分割字符串
//	      for(String x :  temp1){
//	         System.out.println(x);
//	         System.out.println("");
//	      }
	   
		
	}
	
	
	
	
}
