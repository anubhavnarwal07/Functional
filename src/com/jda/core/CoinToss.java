package com.jda.core;
import java.util.Random;

import com.jda.utility.FunctionalUtility;
public class CoinToss {
	public static void main(String args[])
	{
		float headcount = 0;
		float tailcount = 0;
		Random rand = new Random();
		float count =  FunctionalUtility.getInt() ;
		for (float i = 0; i < count; i++) 
		{
			Float randomInteger = rand.nextFloat();
			if (randomInteger < 0.5)
				headcount = headcount + 1;
			else
				tailcount = tailcount + 1;
		}
		System.out.println(100 * (headcount / count) + "   " + 100 * (tailcount / count));

	}
	
}
