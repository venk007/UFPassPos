package com.venk.ufpasspos;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Description: VenkUtil
 * @author: Venk007
 * @date: 2015年12月5日上午1:41:15
 * 
 */
public class VenkUtil {

	static String uc = "UTF-8";
	static String tip1 = "%25u6562%25u7528%25u54e5%25u7684%25u4ee3%"
			+ "25u7801%25u7834%25u89e3%25u54e5%25u7684%25u5bc"
			+ "6%25u7801%25uff0c%25u662f%25u4e0d%25u662f%25u4"
			+ "e0d%25u60f3%25u6d3b%25u5566%25uff1f%25uff01";
	static String tip2 = "%25u5973%25u795e%25u7684%25u8d26%25u53f7%"
			+ "25u65e0%25u6cd5%25u7834%25u89e3%2521";
	
	public static String escape(String src) {
		int i;
		char j;
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length() * 6);

		for (i = 0; i < src.length(); i++) {
			j = src.charAt(i);
			if (Character.isDigit(j) || Character.isLowerCase(j)
					|| Character.isUpperCase(j))
				tmp.append(j);
			else if (j < 256) {
				tmp.append("%");
				if (j < 16)
					tmp.append("0");
				tmp.append(Integer.toString(j, 16));
			} else {
				tmp.append("%u");
				tmp.append(Integer.toString(j, 16));
			}
		}
		return tmp.toString();
	}

	public static String unescape(String src) {
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length());

		int lastPos = 0, pos = 0;
		char ch;
		while (lastPos < src.length()) {
			pos = src.indexOf("%", lastPos);
			if (pos == lastPos) {
				if (src.charAt(pos + 1) == 'u') {
					ch = (char) Integer.parseInt(
							src.substring(pos + 2, pos + 6), 16);
					tmp.append(ch);
					lastPos = pos + 6;
				} else {
					ch = (char) Integer.parseInt(
							src.substring(pos + 1, pos + 3), 16);
					tmp.append(ch);
					lastPos = pos + 3;
				}
			} else {
				if (pos == -1) {
					tmp.append(src.substring(lastPos));
					lastPos = src.length();
				} else {
					// why? by Venk 2015-11-05				 
					tmp.append(src.substring(lastPos, pos));
					lastPos = pos;
				}
			}
		}
		return tmp.toString();
	}

	/**
	 * MD5加密
	 * @param args
	 */
	public static String toMd5(String str) {

		String re = null;
		byte encrypt[];
		try {
			byte[] tem = str.getBytes();
			MessageDigest md5 = MessageDigest.getInstance("md5");
			md5.reset();
			md5.update(tem);
			encrypt = md5.digest();
			StringBuilder sb = new StringBuilder();
			for (byte t : encrypt) {
				sb.append(Integer.toHexString(t & 0xFF));
			}
			re = sb.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return re;
	}
	/** 
	 * Venk's say
	 * @param args
	 */
	public static void s(int i){
		if(i == 1){
			System.out.println(VenkUtil.unescape((Decode.urlDecode(tip1,uc))));
		} else if(i == 2) {
			System.out.println(VenkUtil.unescape((Decode.urlDecode(tip2,uc))));
		}
	}
	
	public static void goDie(){
		
		System.exit(0);
	}

}
