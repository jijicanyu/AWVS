package com.zlp.patern.oberver;


public interface Subject {
	public void addach(Observer observer);
	
	public void delach(Observer observer);
	
	void notifyObservers();
	
}
