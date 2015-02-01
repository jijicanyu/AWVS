/**
 * 
 */
package com.zlp.patern.oberver;


/**
 * @author zhangliping
 *
 */
public class ConcreteObserver implements Observer {

	public void update() {
		System.out.println("i am notified");
	}

}
