package com.venk.ufpasspos;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @Description: 日期遍历模块测试类
 * @author: Venk007
 * @date: 2015年12月4日下午3:16:22
 */
public class TestDateUtil {

	public static void main(String[] args) {

		// 日期遍历模块
		final int startYear = 1993;
		final int startMonth = 01;
		final int startDay = 01;

		final int endYear = 1994;
		final int endMonth = 12;
		final int endDay = 31;

		Calendar start = Calendar.getInstance();
		start.set(startYear, startMonth - 1, startDay);
		Calendar end = Calendar.getInstance();
		end.set(endYear, endMonth - 1, endDay);

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		while (start.compareTo(end) <= 0) {
			System.out.println(format.format(start.getTime()));
			start.set(Calendar.DATE, start.get(Calendar.DATE) + 1);
		}
	}

}
