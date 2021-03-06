/**
 * chenPeng
 * com.mic.core
 * NoToClass.java
 * 创建人:chenpeng
 * 时间：2018年8月15日-下午9:11:05 
 * 2018陈鹏-版权所有
 */
package com.mic.core;

/**
 * 
 * NoToClass
 * 创建人:chenPeng
 * 时间：2018年8月15日-下午9:11:05 
 * @version 1.0.0
 * 
 */
public class NoToClass {
	/**
	 * 自己格式的时间转换为正常时间
	 * 方法名：getTime
	 * 创建人：chenPeng
	 * 时间：2018年8月15日-下午9:39:38 
	 * 手机:17673111810
	 * @param time
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	public String getTime(String time){
		int i = time.lastIndexOf("/");
		return time.substring(0, i);
	}
	
	/**
	 * 时间转换为自己的课程节数编号
	 * 方法名：classToNo
	 * 创建人：chenPeng
	 * 时间：2018年8月15日-下午9:38:44 
	 * 手机:17673111810
	 * @param time
	 * @return Integer
	 * @exception 
	 * @since  1.0.0
	 */
	public Integer classToNo(String time){
		int i = time.lastIndexOf("/");
		String times = time.substring(i+1, time.length());
		if(times.equals("1-2")){
			return 1;
		}else if (times.equals("3-4")) {
			return 2;
		}else if (times.equals("5-6")){
			return 3;
		}else if(times.equals("7-8")){
			return 4;
		}else if(times.equals("9-10")){
			return 5;
		}else {
			return null;
		}
	}
	/**
	 * 编号转换为时间
	 * 方法名：noToClass
	 * 创建人：chenPeng
	 * 时间：2018年8月15日-下午9:39:11 
	 * 手机:17673111810
	 * @param no
	 * @return String
	 * @exception 
	 * @since  1.0.0
	 */
	public String noToClass(Integer no){
		if (no == 1) {
			return "/1-2";
		} else if (no == 2) {
			return "/3-4";
		} else if (no == 3) {
			return "/5-6";
		} else if (no == 4) {
			return "/7-8";
		} else if (no == 5) {
			return "/9-10";
		} else {
			return null;
		}
	}
}
