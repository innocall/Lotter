package com.wuxt.test.jartest.simplefactory;

/**
 * 简单工厂
 * 1、又叫静态工厂，创造一个静态方法，通过静态方法里的参数返回实例。
 * @author wuxiaotie
 *
 */

public class SimpleFactory {
	
	
	public static Product create(int i) {
		switch(i) {
		case 0:
			return new Washer();
		case 1:
			return new Icebox();
		}
		return null;
	}
	
	
}
