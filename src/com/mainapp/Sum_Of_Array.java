package com.mainapp;

public class Sum_Of_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr={10,20,30,40,50};
	     int sum=0;
	     for(int i=0;i<arr.length;i++) {
	        sum+=arr[i];
	     }

	    System.out.println("Sum of array elements: " +sum);
	}

}
