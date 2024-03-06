package com.ass2.java;

import java.util.Scanner;

public class ArithmeticOperationTesting { 
	
	public static void main(String[] args) {
		
	  Scanner scanner = new Scanner(System.in);
		
		try {
			
			int a,b;
			
            a=scanner.nextInt();
           
            b=scanner.nextInt();
    		
            int add= Math.addExact(a, b);
            
            int sub = Math.subtractExact(a, b);
    		
    		int product = Math.multiplyExact(a, b);
    		
    		double mod = Math.floorMod(a, b);
    		
    		double div = Math.floorDiv(a, b);
    		
    		int max = Math.max(a, b);
    		
    		int min = Math.min(a, b);
    		
    		int abs = Math.abs(a);
    		
    		
    		System.out.println(add);
    		
    		System.out.println(sub);
    		
    		System.out.println(product);
    		
    		System.out.println(mod);
    		
    		System.out.println(div);
    		
    		System.out.println(max);
    		
    		System.out.println(min);
    		
    		System.out.println(abs);
            
           }catch(Exception e) {
			
			System.out.println("exception occured");
			
		  }finally {
						
			System.out.println("something went wrong.please change the input");
		}
			
			
			
	}
	
}
