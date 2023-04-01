package com.thusis.javabasics.Thread;

import java.util.ArrayList;

public class ThreadSample extends Thread {
/**
 * https://wikidocs.net/230
 */
	
	int seq;
	
	public ThreadSample(int seq) {
		this.seq = seq;
	}
	
	public void run() {
		System.out.println(this.seq + " thread start.");
		try {
			ThreadSample.sleep(1000);//1초(1000밀리언세컨즈) 대기한다
			//Thread.sleep(milli)
			//Causes the currently executing thread to sleep (temporarily ceaseexecution) for the specified number of milliseconds, subject tothe precision and accuracy of system timers and schedulers. The threaddoes not lose ownership of any monitors.
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		System.out.println(this.seq + " thread end.");
	}
	
	public static void main(String[] args) {
		
		ArrayList<Thread> threads = new ArrayList<>();
		// (0) 문제 : 생성된 쓰레드는 순서대로 실행되지 않고, 순서에 상관없이 동시 실행되며 0~9까지의 쓰레드가 종료되기 전에 main 메서드가 종료된다.
		
		for(int i=0; i<10; i++) {
			Thread t = new ThreadSample(i);
			t.start();
			//Thread.start()
			//이 스레드가 실행을 시작하도록 스레드의 실행 메소드를 호출. 그 결과 두 개의 스레드가 동시에 실행됩니다. 즉, 현재 스레드(start 메서드 호출에서 반환됨)와 다른 스레드(run 메서드를 실행함)입니다. 
			//It is never legal to start a thread more than once. 특히 스레드는 실행이 완료되면 다시 시작할 수 없습니다.
			
			threads.add(t);
			// (1) 생성된 쓰레드를 ArrayList 에 담아
		}
		
		for(int i=0; i<threads.size(); i++) {
			Thread t = threads.get(i); 
			try {
				t.join();// 쓰레드가 종료할 떄까지 기다린다.
				// (2) 각각의 thread 에 join 메소드를 호출하여 쓰레드가 종료될 때까지 대기하도록 한다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		System.out.println("main end.");
		
	}

}
