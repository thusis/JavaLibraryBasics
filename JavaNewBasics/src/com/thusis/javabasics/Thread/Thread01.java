package com.thusis.javabasics.thread;

public class Thread01 {
	
   public static void main(String[] args){
        ThreadWithClass thread1 = new ThreadWithClass();       // Thread 클래스를 상속받는 방법
        Thread thread2 = new Thread(new ThreadWithRunnable()); // Runnable 인터페이스를 구현하는 방법

        thread1.start(); // 스레드의 실행
        thread2.start(); // 스레드의 실행
    }

}
