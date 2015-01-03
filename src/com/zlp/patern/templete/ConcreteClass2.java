package com.zlp.patern.templete;

public class ConcreteClass2 extends AbstractClass {

	@Override
	public void init() {
		System.out.println("init2");
	}

	@Override
	public void destory() {
		System.out.println("destory2");
	}
}
