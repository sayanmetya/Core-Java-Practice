package com.mainapp;

public class Count_Number_digit {

	public static void main(String[] args) {
		Logic logic = new Logic(124334);
		System.out.println(logic.getCount());
	}

}
class Logic{
	int count;
	public Logic(int n) {
		while(n!=0) {
			n=n/10;
			count++;
		}
	
	}
	public int getCount() {
		return count;
	}
	
	
}
