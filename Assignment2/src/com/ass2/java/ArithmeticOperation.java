package com.ass2.java;

public class ArithmeticOperation {
	
	
	public static int add(int a,int b) {
		
		return a+b;
		
	}
	
	public static int sub(int a,int b) {
		
		return a-b;
		
	}
	
	public static int product(int a, int b) {
		
		return a*b;
		
	}
	
	public static float mod(int a, int b) {
		
		return a%b;
		
	}
	
	public static float div(int a, int b) {
		
		return a/b;
		
	}
	
	
	public static void main(String[] args) {
		
		int a = 99;
		
		int b = 7;
		
		int add = Math.addExact(a, b);
		
		int sub = Math.subtractExact(a, b);
		
		int product = Math.multiplyExact(a, b);
		
		double mod = Math.floorMod(a, b);
		
		double div = Math.floorDiv(a, b);
		
		
		System.out.println(add);
		
		System.out.println(sub);
		
		System.out.println(product);
		
		System.out.println(mod);
		
		System.out.println(div);
		
		
		
		}
}
