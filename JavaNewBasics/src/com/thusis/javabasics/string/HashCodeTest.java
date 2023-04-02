package com.thusis.javabasics.string;

public class HashCodeTest {
	/*
	 * System.identityHashCode() 와 hashCode() 는 객체의 고유값을 리턴합니다
	 * 
	 * Object의 hashCode() 메소드는 하위 클래스에서 override가 가능하기 때문에 
	 * 객체마다 유일한 값을 갖고 있지 않습니다. 
	 * 객체의 특성이 동일하다는 것을 표현하기 위해 이 메소드를 오버라이드할 수 있습니다. 
	 * 예를 들어, String의 hashcode가 갖다면 객체는 달라도 문자열은 동일하다는 것을 의미합니다.
	 * 
	 * 반면에 System.identityHashCode()는 오버라이드가 안되며 객체의 고유한 hashCode를 리턴합니다. 
	 * 객체 자체를 비교하려면 이 메소드를 사용하는 것이 좋습니다
	 * 
	 */
	
	public void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String ("java");
		
		System.out.println("str1의 hashCode : " + str1.hashCode());
		System.out.println("str2의 hashCode : " + str2.hashCode());
		System.out.println("str3의 hashCode : " + str3.hashCode());
		
		System.out.println("str1의 실주소값 : " + System.identityHashCode(str1));
		System.out.println("str2의 실주소값 : " + System.identityHashCode(str2));
		System.out.println("str3의 실주소값 : " + System.identityHashCode(str3));
		
	}

}
