package com.zlp.patern.templete;

public class Client {

	public static void main(String[] args) {
		
		AbstractClass ac = new ConcreteClass();
		ac.execute();
		
		AbstractClass ac2 = new ConcreteClass2();
		ac2.execute();
	}

}
