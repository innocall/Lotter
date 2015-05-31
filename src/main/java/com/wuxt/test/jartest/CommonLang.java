package com.wuxt.test.jartest;

import org.apache.commons.lang3.StringUtils;

/**
 * Common-lang.jar 字符串处理工具类，
 * @author wuxiaotie
 *
 */
public class CommonLang {

	public static void main(String[] args) {
		String str = "";
		boolean param = StringUtils.isNotBlank(str); //判断字符串是否为空
		System.out.println(param);
		
	}
}
