package com.mainapp;

import java.util.Random;

public class Generate_Random_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Random random = new Random();
      
//      int rand_int=random.nextInt(100);
//      System.out.println(rand_int);
      
//      float rant_D=random.nextFloat();
//      System.out.println(rant_D);
      
       char rand_char=(char)random.nextInt(300);
       System.out.println(rand_char);
      
	}

}
