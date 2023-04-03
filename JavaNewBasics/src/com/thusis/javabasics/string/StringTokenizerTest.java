package com.thusis.javabasics.string;

import java.util.StringTokenizer;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "AA|BB|CC";
		StringTokenizer st = new StringTokenizer(str, "|");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
