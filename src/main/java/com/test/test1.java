/**
 * @author XuMenglin
 * @date 2019年8月27日
 *
 */
package com.test;

/**
 * <p>Title: test</p>
 * <p>Description: </p>
 * @author XuMenglin
 * @date 2019年8月27日
 */
public class test1 {
	private void test() {
		String astr = " One ";
		String bstr = astr;
		astr.toUpperCase();
		astr.trim();
		System.out.println("[" + astr + "," + bstr + "]");
	}

	public static void main(String[] args) {
		new test1().test();
	}
}
