package com.mainapp;

import java.util.Arrays;

public class Check_Equality_Of_two_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr1[]= {2,3,4,5};
      int arr2[]= {2,3,4,5,3};
      
      Check1 check = new Check1(arr1,arr2);
      
	}

}
class Check1{
	public Check1(int a1[],int a2[]) {
//		if(Arrays.equals(a1, a2)) {
//			System.out.println("the arrays is equal");
//		}
//		else {
//			System.out.println("the arrays is not equal");
//		}
		boolean s=false;
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]==a2[i]) {
					s=true;
				}
				
			}
		}
		else {
			System.out.println("the arrays is not equal");
		}
		if(s==true) {
			System.out.println("the arrays is equal");
		}
		else {
			System.out.println("the arrays is not equal");
		}
	}
}
