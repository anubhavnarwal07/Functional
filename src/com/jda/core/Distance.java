package com.jda.core;
import com.jda.utility.FunUtility;
public class Distance {

	public static void main(String args[])
	{
		int x= FunUtility.getInt();
		int y = FunUtility.getInt();
		double a=Math.pow(x, 2);
		double b=Math.pow(y, 2);
		Double result = Math.pow(a+b, 0.5);
		System.out.println(result);
	}
}
