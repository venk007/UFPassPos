package com.venk.ufpasspos;

import java.io.UnsupportedEncodingException;

/**
 * @Description: SchoolId ==> StudentName
 * @author: Venk007
 * @date: 2015年12月3日上午10:48:39 
 * TestEnd: 15/12/04 13:55
 */
public class IdToName {
	
	public static String idToName(String Sid) throws UnsupportedEncodingException{
		
		String url = "http://218.195.32.11/(amwck0550eos3lqjl3wv1b45)/lw_xscj.aspx";
		String errorTip = "%E5%AD%A6%E5%8F%B7%E4%B8%8D%E5%AD%98%E5%9C%A8%EF%BC%8C%E"
				+ "8%AF%B7%E6%A3%80%E6%9F%A5%EF%BC%81";
		String result = "false";
		String key = "xh=";
		String firstPoint = "abel4";
		String lastPoint = "%E5%9C%A8%E6%A0%A1";
		String schoolId = "%E5%AD%A6%E5%8F%B7%3A+";
		String name = "%0A%E5%A7%93%E5%90%8D%3A+";
		String uc = "UTF-8";
		String sr = HttpRequest.sendGet(url,key + Sid);

		int first = sr.lastIndexOf(firstPoint);
		int end = sr.lastIndexOf(Decode.urlDecode(lastPoint,uc));
		if( end > 20000){
			result = sr.substring(first+7,end).trim();
			System.out.println(Decode.urlDecode(schoolId,uc) + Sid + Decode.urlDecode(name,uc) + result);
		} else{
			System.out.println(Decode.urlDecode(errorTip,uc));
		}
		return result;	
	}
	
}
