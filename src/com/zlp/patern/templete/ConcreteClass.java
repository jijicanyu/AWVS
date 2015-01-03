/**
 * 
 */
package com.zlp.patern.templete;

/**
 * @author zhangliping
 *
 */
public class ConcreteClass extends AbstractClass {

	@Override
	public void init() {
		System.out.println("init1");

	}

	@Override
	public void destory() {
		System.out.println("destory1");
	}

}
