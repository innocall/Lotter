package com.wuxt.test.jartest.methodfactory;

import com.wuxt.test.jartest.simplefactory.Product;
import com.wuxt.test.jartest.simplefactory.Washer;

/**
 * 创建洗衣机工厂
 * @author wuxiaotie
 *
 */
public class WasherFactory implements Factory{

	public Product create() {
		return new Washer();
	}

}
