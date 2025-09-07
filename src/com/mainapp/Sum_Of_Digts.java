package com.mainapp;

public class Sum_Of_Digts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sum sum = new Sum(5555);
System.out.println(sum.getSum());
	}

}
class Sum{
	int sum;
	public Sum(int n) {
		while(n!=0) {
			int k=n%10;
			sum=sum+k;
			n=n/10;
		}
	}
	public int getSum() {
		return sum;
	}
	
}
