package com.revature.strings;

import java.io.*;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		int len = s.length();
		int cap = s.capacity();
		System.out.println("Length of string: " + len);
		System.out.println("Capacity of string: " + cap);
		
		s.append("absentmindedness");

		int len2 = s.length();
		int cap2 = s.capacity();
		System.out.println("Length of string: " + len2);
		System.out.println("Capacity of string: " + cap2);
		
		s.append(1);
		
		int len3 = s.length();
		int cap3 = s.capacity();
		System.out.println("Length of string: " + len3);
		System.out.println("Capacity of string: " + cap3);

	}

}
