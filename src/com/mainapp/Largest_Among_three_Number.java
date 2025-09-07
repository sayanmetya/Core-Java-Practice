package com.mainapp;

public class Largest_Among_three_Number extends Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        find(2,4,3);
	}

}
class Find{
	public static void find(int a,int b,int c) {
		// 1 :- Using if-else statement
//		if(a>b&&a>c) {
//			System.out.println(" a is Greater");
//		}
//		else if(b>a&&b>c) {
//			System.out.println(" b is greater");
//			}
//		else {
//			System.out.println("c is greater");
//		}
		
		//Using ternary operator
		System.out.println(c>(a>b?a:b)?c:(a>b?a:b));
		}
}
