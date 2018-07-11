package com.jda.utility;
import java.util.Scanner;
import java.util.Random;
public class FunUtility {
		public static int getInt()
		{
		
			Scanner input = new Scanner(System.in);
			int n = input.nextInt();
			return n;
		}
		public static String getString()
		{
	
			Scanner input = new Scanner(System.in);
			String inputString = input.nextLine();
			return inputString;
		}
		public static int getRandom()
		{ Random r = new Random();
		return r.nextInt();
		}
	}
