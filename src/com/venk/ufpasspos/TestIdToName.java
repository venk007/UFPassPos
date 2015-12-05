package com.venk.ufpasspos;

import java.io.UnsupportedEncodingException;

/**
 * @Description: IdToName测试类
 * @author: Venk007
 * @date: 2015年12月3日上午10:39:47 
 *
 */
public class TestIdToName {

	public static void main(String[] args) {
		
		// 输入学号，查看学生姓名
		String id = "1201234567";
		
		try {
			IdToName.idToName(id,0);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error: IdToName()");
			e.printStackTrace();
		}
	}
}

