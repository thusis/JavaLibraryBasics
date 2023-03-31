package com.thusis.javabasics.callby;

//https://wikidocs.net/265 점프투자바 call by value

class Updater {
	
//	void update(int count) { 
//		count++;
//	} 
//	이 경우 before과 after count 값이 변화하지 않는다
	
	void update(Counter counter) {
		counter.count++;
	}
}

class Counter {
	int count = 0; //객체 변수
}

/*
 * 한 개의 자바파일에 2개 이상의 클래스 선언하기
	Sample.java라는 파일 내에 Sample, Updater, Counter라는 클래스 3개가 등장했다. 
	조금 특이하지만 가능한 코드이다. 하나의 java파일내에는 여러개의 클래스를 선언할 수 있다. 
	단 파일명이 Sample.java라면 Sample.java 내의 Sample 클래스는 public 으로 선언하라는 관례(규칙)가 있다.
 */

public class Sample {
	public static void main(String[] args) {
		Counter myCounter = new Counter();
		System.out.println("before update : " + myCounter.count);
		Updater myUpdater = new Updater();
//		myUpdater.update(myCounter.count);
		myUpdater.update(myCounter);
/*
 * 메서드의 입력으로 객체를 전달받는 경우에는 메서드가 입력받은 객체를 그대로 사용하기 때문에 
 * 메서드가 객체의 속성값을 변경하면 메서드 수행 후에도 객체의 변경된 속성값이 유지된다.
 */
		System.out.println("after update: "+myCounter.count);
	}
}

