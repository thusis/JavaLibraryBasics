package com.thusis.javabasics.string;

public class WrapperTest {

	//String을 기본 자료형으로 바꾸기
	byte b = Byte.parseByte("1");
	short s = Short.parseShort("2");
	int i = Integer.parseInt("3");
	long l = Long.parseLong("4");
	float f = Float.parseFloat("0.1");
	double d = Double.parseDouble("0.2");
	boolean bool = Boolean.parseBoolean("true");
	char c = "abc".charAt(0);
	
	//기본 자료형을 String으로 바꾸기
	String b2 = Byte.valueOf((byte)1).toString();
	String s2 = Short.valueOf((short)2).toString();
	String i2 = Integer.valueOf(3).toString();
	String l2 = Long.valueOf(4L).toString();
	String f2 = Float.valueOf(0.1f).toString();
	String d2 = Double.valueOf(0.2).toString();
	String bool2 = Boolean.valueOf(true).toString();
	String ch2 = Character.valueOf('a').toString();
	
}
