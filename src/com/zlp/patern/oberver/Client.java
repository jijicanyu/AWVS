/**
 * 
 */
package com.zlp.patern.oberver;

/**
 * @author zhangliping
 * 2015年1月3日
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subject s = new ConcretSubject();
		Observer o1 = new ConcreteObserver();
		s.addach(o1);
		
		Observer o2 = new ConcreteObserver();
		s.addach(o2);
		
		s.notifyObservers();
		
		
	}

}
