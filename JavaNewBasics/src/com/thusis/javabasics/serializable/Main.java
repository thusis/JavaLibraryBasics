package com.thusis.javabasics.serializable;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Base64;

public class Main {

	public static void main(String[] args) {
		Member member = new Member("이동백", "thusis@github.com", 27);
		byte[] serializedMember = null;
		
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(member);
			serializedMember = baos.toByteArray(); // 직렬화된 Member 객체
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(Base64.getEncoder().encodeToString(serializedMember));
		
	}
}
