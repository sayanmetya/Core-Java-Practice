package com.mainapp;

public class Factorial_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
//		int fact=1;
//        for(int i=1;i<=n;i++){
//            fact=fact*i;
//        }
//        System.out.println("Factorial of "+n+" is: "+fact);
	
        int result=factorial(n);
        System.out.println("Factorial of "+n+" is:"+result);
        
	}
	public static int factorial(int n){
        if(n==0||n==1)  {
          return 1; 
        } 
        else{
          return n*factorial(n-1); 
        }
    }

}
