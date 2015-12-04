package com.venk.ufpasspos;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Description: TODO
 * @author: Venk007
 * @date: 2015年12月5日上午1:41:15
 * 
 */
public class VenkUtil {

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
	 * 
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

	public static void main(String[] args) {

		// 测试escape编码
		
		  String testEscapeA = "嘿嘿啊哈"; String testEscapeB =
		  "`~!@-=+,./?01234aBcDeFg啊哈"; System.out.println("A编码：" +
		  escape(testEscapeA)); System.out.println("B编码：" +
		  escape(testEscapeB));
		 

		// 测试unescape解码
		
		  String testUnescapeA = "%u563f%u563f%u554a%u54c8"; String
		  testUnescapeB =
		  "%60%7e%21%40%2d%3d%2b%2c%2e%2f%3f01234aBcDeFg%u554a%u54c8";
		  System.out.println("A解码：" + unescape(testUnescapeA));
		  System.out.println("B解码：" + unescape(testUnescapeB));
		 

		// 测试md5加密
		/*
		 * String testMd5 = "Hello Venk"; System.out.println(toMd5(testMd5));
		 * System.out.println(toMd5("Hello Venk"));
		 * System.out.println(toMd5("Hello md5"));
		 * System.out.println(toMd5("c945041e6aa78ff5ca8fdb2a238d9d"));
		 * System.out.println(toMd5(toMd5("Hello md5")));
		 */

	}

}
