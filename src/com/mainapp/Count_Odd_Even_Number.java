package com.mainapp;

public class Count_Odd_Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Count count = new Count(23421);
       System.out.println(count.countEven);
       System.out.println(count.countOdd);
	}

}
class Count{
	int countOdd;
	int countEven;
	public Count(int n) {
		while(n!=0) {
			int k=n%10;
			if(k%2==0) {
				countEven++;
			}
			else {
				countOdd++;
			}
			n=n/10;
		}
	}
	public int getCountOdd() {
		return countOdd;
	}
	public int getCountEven() {
		return countEven;
	}
	
}
