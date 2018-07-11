package com.jda.core;

import java.util.Scanner;
import com.jda.utility.FunUtility;

public class TwoDimenArray 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the size of matrix");
		int num1 = FunUtility.getInt();
		int num2 = FunUtility.getInt();
		String arr[][] = new String[num1][num2];
		for (int i = 0; i < num1; i++) 
		{
			for (int j = 0; j < num2; j++) 
			{
				arr[i][j] = FunUtility.getString();
			}
		}
		System.out.println("Here is the output ");
		for (int k = 0; k < num1; k++) 
		{
			for (int j = 0; j < num2; j++)
				System.out.print(arr[k][j] + " ");
			System.out.println();

		}
	}
}
