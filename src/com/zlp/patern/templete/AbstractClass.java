/**
 * 
 */
package com.zlp.patern.templete;

/**
 * @author zhangliping
 *
 */
public abstract class AbstractClass {
	
	public abstract void init();
	
	
	public void execute() {
		init();
		templeteMethod();
		destory();
	}
	
	public abstract void destory();
	
	
	public void templeteMethod(){
		System.out.println("公共的处理流程");
	}
	
}
