package com.thusis.javabasics.thread.ramen;

public class CurrentThread extends Thread {
	public RamenCook ramenCook;
	static String nam; 
	
	CurrentThread(){
		this(new RamenCook(5), "");
	}
	
	CurrentThread(RamenCook ramenCook, String nam){
		this.ramenCook = ramenCook;
		this.nam = nam;
	}

}
