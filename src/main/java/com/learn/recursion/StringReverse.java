package com.learn.recursion;

public class StringReverse {

	public static void stringRev(char [] s) {
		helper(0,s.length-1,s);
	}
	
	private static void helper(int start, int end , char[] s) {
		if(start >= end) {
			return ;
		}
		char temp = s[start];
		s[start] = s[end];
		s[end] = temp;
		helper(start+1, end-1,s);
	}
	
	public static void main(String [] args) {
		String s ="hello";
		char [] arr = s.toCharArray();
		stringRev(arr);
		System.out.println(arr);
	}

}
