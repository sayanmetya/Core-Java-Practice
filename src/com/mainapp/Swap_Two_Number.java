package com.mainapp;

public class Swap_Two_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         swap1(10, 20);
         swap2(10, 20);
         swap3(10, 20);
         swap4(10, 20);
         swap5(10, 20);
	}
	public static void swap1(int a,int b) {
		//Using third variable
		int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping a is "+a+" and b is "+b);
	}
    public static void swap2(int a,int b) {
		//Using (+ , -) operator, dont use third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a is "+a+" and b is "+b);
	}
    public static void swap3(int a,int b) {
    	//Using (* , /) operator
	    a=a*b;
	    b=a/b;
	    a=a/b;
	    System.out.println("After Swapping a is "+a+" and b is "+b);
    }
    public static void swap4(int a,int b) {
    	//Using (^) bitwise operator
	    a=a^b;
	    b=a^b;
	    a=a^b;
	    System.out.println("After Swapping a is "+a+" and b is "+b);
    }
     public static void swap5(int a,int b) {
        //Using Single Statement
    	b=a+b-(a=b);
    	System.out.println("After Swapping a is "+a+" and b is "+b);
    }
}
