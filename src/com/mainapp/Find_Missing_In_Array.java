package com.mainapp;

public class Find_Missing_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,4,5};
		
  Find1 find1 = new Find1(arr);
	}

}
class Find1{
	public Find1(int a[]) {
		int n=a.length+1;
		int acctualN=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		int missing=acctualN-sum;
		System.out.println("the missing number is="+missing);
	}
}
