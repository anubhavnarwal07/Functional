package com.jda.core;

import com.jda.utility.FunctionalUtility;

public class Leapyear {
	public static void main(String args[])
	{ FunctionalUtility utility = new FunctionalUtility();
	int year = utility.getInt();
	while(year<1000 || year>=10000)
	{ System.out.println("Please Enter a three didgit number Mr. User . Unfortunately we dont support this format. ");	
	year = utility.getInt();
	}
	if(year%4==0)
		System.out.println("Hurrah , Leap year ");
	}
}
