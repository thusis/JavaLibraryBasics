package com.thusis.javabasics.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);

	public void pr1() {
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void pr2() {
		int[] arr = new int[10];
		for(int i=1; i<=arr.length; i++) {
			System.out.print(arr[arr.length-i] + " ");
		}
		System.out.println();
	}
	
	public void pr3() {
		System.out.print("양의 정수 : ");
		int[] arr = new int[sc.nextInt()];
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public void pr4() {
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(arr[1]);
	}
	
	public void pr5() {
		int count=0;
		
		System.out.print("문자열 : ");
		String str = sc.next();
		String[] arr = str.split("");
		
		System.out.print("문자 : ");
		String search = sc.next();
		
		System.out.print(str + " 에 " + search +"가 존재하는 위치(인덱스) : ");
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(search)) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println(search + " 개수 : " + count);
	}
	
	public void pr6() {
		String[] week = { "월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int n = sc.nextInt();
		
		if(n>=0 && n<=6) {
			System.out.println(week[n] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void pr7() {
		System.out.print("정수 : ");
		int[] arr = new int[sc.nextInt()];
		
		for( int i = 0; i < arr.length ; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = Integer.parseInt(sc.next());
		}
		
		int result = 0;
		for(int n : arr) {
			System.out.print(n+" ");
			result = result + n;
		}
		System.out.println("\n총합 : " + result);
	}
	
	public void pr8() {
		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		while( n%2==0 || n<0 ) {
			System.out.println("다시 입력하세요.");
			System.out.print("정수 : ");
			n = sc.nextInt();
		}
		
		for(int i=1; i<=n/2+1; i++) {
			System.out.print(i+" ");
		}
		for(int i=n/2; i>0; i--) {
			System.out.print(i+" ");
		}
	}
	
	public void pr9() {
		boolean check = false;
		String[] chicken = {"후라이드", "양념", "간장", "레몬", "매콤", "마라"};
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String search = sc.next();
		
		for(String str : chicken) {
			if(str.equals(search)) {
				check = true;
				break;
			} 
		}
		
		if(check) {
			System.out.println(search + "치킨 배달 가능");
		} else {
			System.out.println(search + "치킨은 없는 메뉴입니다.");
		}
	}
	
	public void pr10() {
		
		System.out.print("주민등록번호(-포함) : ");
		String[] numbers = sc.next().split("");
		
		String[] copyArr = new String[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			if(i<8) {
				copyArr[i] = numbers[i];
			} else {
				copyArr[i] = "*";
			}
		}
		
		for(String str : copyArr) {
			System.out.print(str);
		}
	}
	
	public void pr11() {
		int[] arr = new int[10];
		// Math.random();  0~1 사이의 랜덤한 double 값 반환. 원하는 범위만큼 *10, +1 식으로 사용한다
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)Math.random()*10+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void pr12() {
		
		int[] arr = new int[10];
		int min = 10;
		int max = 1;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10) + 1;
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		} 
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void pr13() {
		int[] arr = new int[10];
		boolean flag = false;
		int temp = (int)(Math.random()*10) + 1 ;
		arr[0] = temp;
		
		for(int i=1; i<10; i++) {
			
			//flag = true; 
			// 일치한다면 깃발을 올립시다. 깃발이 올라가있다면 temp 를 재추출해야합니다. 
			//재추출한 후 비교한 temp 값이 해당 인덱스 이전의 모든 배열값과 같지 않다면 flag 를 내립니다.
			
			do {
				temp = (int)(Math.random()*10) + 1 ;
				for(int j=0; j<i ; j++) {
					if(arr[j] == temp) {
						flag = true;
						break;
					} else if (j == i-1) {
						flag = false;
					}
				}
			} while(flag);
			
			arr[i] = temp;
			
		}
		
		for(int n : arr) {
			System.out.print(n+" ");
		}
	
	}
	
	public void pr14() {
		
		int[] lotto = new int[6];
		boolean flag = false;
		int temp = 0;
		
		lotto[0] = (int)(Math.random()*45) + 1;
		
		for(int i=1; i<lotto.length; i++) {
			
			do {
				temp = (int)(Math.random()*45) + 1;
				for(int j=0; j<i; j++) {
					if(lotto[j] == temp) {
						flag = true;
						break;
					} else if (j == i-1) {
						flag = false;
					}
				}
			}while(flag);
			lotto[i] = temp;
			
		}
		
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
	}
	
	public void pr15() {
		System.out.print("문자열 : ");
		String str = sc.next();
		String[] arr = str.split("");
		
		boolean flag = false;
		String temp = "" + arr[0];
		
		for(int i=1; i<arr.length; i++) {
			
			/*
			 * a         true =>  concat
			 * p a       true =>  concat
			 * p a p     false 
			 * l a p     true => concat
			 * i a p l   true => concat
			 * c a p l i true => concat
			 * a
			 * t
			 * i
			 * o
			 * n
			 */
			
			for(int j=0; j<temp.length(); j++) {
				if(arr[i].equals(temp.charAt(j)+"")) {
					flag = false;
					break;
				} else if (j == temp.length()-1){
					flag = true;
				}
			}

			if(flag) {
				temp = temp + arr[i];
			}
		}
		
		System.out.println("문자열에 있는 문자 : " + Arrays.toString(temp.split("")) );
		System.out.println("문자 개수 : " + temp.length());
		
	}
	
	public void pr16() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			System.out.print(i+1+"번째 문자열 : ");
			arr[i] = sc.next();
		}
		
		boolean yes = false;
		String temp = "";
		
		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
		String answer = sc.next().toUpperCase();
		if(answer.equals("Y")) {
			yes = true;
		}
		
		while(yes) {
			
			System.out.print("더 입력하고 싶은 개수 : ");
			int more = sc.nextInt();
			
			if(temp.isEmpty()) {
				String[] newArr = new String[arr.length+more]; 
				// 기존 n+more 해서 새로운 배열 생성
				// 깊은 복사 + i부터 일일히 다시
				for(int i=0; i<n; i++) {
					newArr[i] = arr[i];
					temp += arr[i] + ",";
				}
				
				for(int i=n; i<newArr.length; i++) {
					System.out.print(i+1+"번째 문자열 : ");
					newArr[i] = sc.next();
					temp += newArr[i] + "," ;
				}
				
			} else {
				
				
			} 

			
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			if(sc.next().toUpperCase().equals("Y")) {
				yes = true;
			} else {
				yes = false;
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
}
