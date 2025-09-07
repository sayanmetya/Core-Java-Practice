package com.mainapp;

public class Fibonacci_Series extends Fibo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    fibo(10);
	}

}
class Fibo{
    public static void fibo(int n) {
        int a = 0, b = 1;
        if(n>=1){
            System.out.print(a+" ");
        }
        if(n>=2){
            System.out.print(b+" ");
        }
        for(int i=3;i<=n;i++) {
            int sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}
