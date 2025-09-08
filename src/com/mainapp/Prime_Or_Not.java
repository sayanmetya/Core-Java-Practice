package com.mainapp;

public class Prime_Or_Not extends Check{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean s=isPrime(0000);
    if(s) {
    	System.out.println("this is prime");
    }
    else {
    	System.out.println("this is not prime");
    }
	}

}
class Check{
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		if(n==2||n==3) {
			return false;
		}
		if(n%2==0||n%3==0) {
			return false;
		}
		for(int i=5;i*i<=n;i+=6) {
			 if(n%i==0||n%(i+2)==0){
	                return false;
	            }
		}
		return true;
	}
}
