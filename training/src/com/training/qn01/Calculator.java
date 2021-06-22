package com.training.qn01;

public class Calculator {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c;
		System.out.println("Addition of "+a+" "+b+": "+(a+b));
		System.out.println("Subtraction of "+a+" "+b+":  "+(a-b));
		System.out.println("multiplication of "+a+" "+b+": "+(a*b));
		System.out.println("Division of "+a+" "+b+": "+(a/b));
		System.out.println("Mod of "+a+" "+b+": "+(a%b));
		
		
	}

}
