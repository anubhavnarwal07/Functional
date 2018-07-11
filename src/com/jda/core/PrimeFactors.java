package com.jda.core;

import com.jda.utility.FunctionalUtility;

public class PrimeFactors {
	public static void main(String args[]) {
		FunctionalUtility utility = new FunctionalUtility();
		int number = utility.getInt();
		for (int i = 2; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
				while (number % i == 0)
					number = number / i;
			}
		}
	}
}
