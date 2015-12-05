package com.venk.ufpasspos;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 省市名称转换地区码测试类
 * @author: Venk007
 * @date: 2015年12月4日下午9:58:26
 */
public class TestLocalId {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String province = "";
		String city = "朝阳";
	
		List<String> localId = new ArrayList<String>(LocalId.localToId(province, city));

		for(String str:localId)
		{
			System.out.println(str);
		}	
	}

}
