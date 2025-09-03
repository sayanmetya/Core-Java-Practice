package com.mainapp;

public class Reverse_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        reverse1(1234);
        reverse2(1234);
        reverse3(1234);
	}
	//Using Algorithm
	public static void reverse1(int num) {
		int rev=0;
		while(num!=0) {
			int s=num%10;
			rev=rev*10+s;
			num=num/10;
		}
		System.out.println("After reverse the number : "+rev);
	}
	
	
	//Using StringBuffer class--Java Buildin class
    public static void reverse2(int num) {
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev = sb.reverse();
		System.out.println("After reverse the number : "+rev);
	}
    
    
  //Using StringBuilder class--Java Buildin class
    public static void reverse3(int n) {
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(n);
	StringBuilder reverse = stringBuilder.reverse();
	System.out.println("After reverse the number : "+reverse);
   }

}
