package com.mainapp;

public class Reverse_A_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      reverse("sayan");
	}
	public static void reverse(String s) {
		String rev="";	
		//Way 1: Using +(String concatination)operator
		
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
		
		//Way 2: Using char Array
//		
//		char a[]=s.toCharArray();
//		for(int i=a.length-1;i>=0;i--) {
//			rev=rev+a[i];
//		}
//		System.out.println(rev);
		
		//Way 3: Using StringBuffer class
		
		StringBuffer buffer = new StringBuffer(s);
		System.out.println(buffer.reverse());
	}
	

}


