package com.thusis.javabasics.thread.ramen;

import java.util.Scanner;

public class RamenProgram {
	//얄팍한 코딩사전 : https://www.youtube.com/watch?v=iks_Xb9DtTM
	
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("라면 몇 개 끓일까요?");
		
		num = sc.nextInt();
		
		System.out.println(num+"개 주문 완료! 조리시작!");
		
		RamenCook ramenCook = new RamenCook(num);
		new Thread(ramenCook,"A").start();
		new Thread(ramenCook,"B").start();
		new Thread(ramenCook,"C").start();
		new Thread(ramenCook,"D").start();
		
	}

}
