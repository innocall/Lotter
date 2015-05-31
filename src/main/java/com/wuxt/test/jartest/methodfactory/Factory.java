package com.wuxt.test.jartest.methodfactory;

import com.wuxt.test.jartest.simplefactory.Product;

/**
 * 方法工厂：每一个对象实例的创建都是通过单独的方法来完成
 * 需要：工厂接口，实例方法
 * @author wuxiaotie
 *
 */
public interface Factory {
	
	/**
	 * 创建实例
	 * @return
	 */
	public Product create();
}
