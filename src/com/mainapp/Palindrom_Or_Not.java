package com.mainapp;

public class Palindrome_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Check(121);
	}
	public static void Check(int num) {
		int org=num;
		int rev=0;
		while(num!=0) {
			int s=num%10;
			rev=rev*10+s;
			num=num/10;
		}
		if(rev==org) {
			System.out.println("number is palindrom");
		}
		else {
			System.out.println("number is not palindrom");
		}
		
//		String o=String.valueOf(num);
//		String s = new StringBuffer(o).reverse().toString();
//		
//		
//		if(o.equals(s)) {
//			System.out.println("number is palindrom");
//		}
//		else {
//			System.out.println("number is not palindrom");
//		}
		
	}

}
