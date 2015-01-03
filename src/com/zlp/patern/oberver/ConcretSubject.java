/**
 * 
 */
package com.zlp.patern.oberver;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author zhangliping
 *
 */
public class ConcretSubject implements Subject {

	private Vector observersVector = new Vector();

	public void addach(Observer observer) {
		observersVector.addElement(observer);
	}

	public void delach(Observer observer) {
		observersVector.removeElement(observer);
	}

	public void notifyObservers() {

		for (Iterator iterator = observersVector.iterator(); iterator.hasNext();) {
			Observer observer = (Observer) iterator.next();

			observer.update();
		}
	}
}
