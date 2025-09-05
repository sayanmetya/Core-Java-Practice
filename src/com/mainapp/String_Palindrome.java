package com.mainapp;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Check("mam");
	}
	public static void Check(String s) {
//		String org=s;
//		String rev="";	
//		
//		
//		for(int i=s.length()-1;i>=0;i--) {
//			rev=rev+s.charAt(i);
//		}
//		if(org.equals(rev)) {
//			System.out.println("String is Palindrome");
//		}
//		else {
//			System.out.println("String is not palindrome");
//		}
		
		
		String rev=new StringBuffer(s).reverse().toString();
		
		if(s.equals(rev)) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("not palindrom");
		}
	}

}
