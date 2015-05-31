package com.wuxt.test.jartest.methodfactory;

import com.wuxt.test.jartest.simplefactory.Icebox;
import com.wuxt.test.jartest.simplefactory.Product;

/**
 * 创建冰箱的工厂
 * @author wuxiaotie
 *
 */
public class IceboxFactory implements Factory {

	public Product create() {
		// TODO Auto-generated method stub
		return new Icebox();
	}

}
