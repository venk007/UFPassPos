package com.venk.ufpasspos;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Decode {

	/**
	 * 参数encode
	 * @param old
	 * @return
	 * @throws KoowoHibernateException
	 */
	public static String urlEncode(String old){
		if(old==null){
			return "";
		}
		return URLEncoder.encode(old);
	}
	/**
	 * 参数decode
	 * @param old
	 * @return
	 * @throws KoowoHibernateException
	 */
	public static String urlDecode(String old,String charset){
		if(old==null){
			return "";
		}
		if(charset!=null && !"".equals(charset)){
			try {
				return URLDecoder.decode(old,charset);
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return URLDecoder.decode(old);
	}
}