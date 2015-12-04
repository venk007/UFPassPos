package com.venk.ufpasspos;

import java.io.UnsupportedEncodingException;

/**
 * @Description: IdToName测试类
 * @author: Venk007
 * @date: 2015年12月3日上午10:39:47 
 *
 */
public class TestIdToName {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String id = "1205170100";
		
		try {
			IdToName.idToName(id);
		} catch (UnsupportedEncodingException e) {
			System.out.println("Error: idToName()");
			e.printStackTrace();
		}
	}

}

