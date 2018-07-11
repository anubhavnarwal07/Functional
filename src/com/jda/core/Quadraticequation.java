package com.jda.core;

import com.jda.utility.FunctionalUtility;

public class Quadraticequation {
	public static void main(String args[]) {
		
		String number1 = args[0];
		String number2 = args[1];
		String number3 = args[2];
		double  int1 = Double.parseDouble(number1);
	double  int2 = Double.parseDouble(number2);
		double int3 = Double.parseDouble(number3);
		
		
		double f = Math.pow(int2,2) - 4*int1*int3 ;
		double root1 = (-int2 + f)/2*int1 ;
		double root2 = (-int2 - f)/2*int1;
		System.out.println("root 1 is " + root1 + "   root 2 is" + root2);
	}
}
