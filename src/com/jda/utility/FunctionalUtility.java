package com.jda.utility;

import java.util.Scanner;

public class FunctionalUtility 
{
	static Scanner input = new Scanner(System.in);
	public static int getInt() 
	{
		int n = input.nextInt();
		return n;
	}

	public static String getString() 
	{
		String string = input.nextLine();
		return string;
	}
}
