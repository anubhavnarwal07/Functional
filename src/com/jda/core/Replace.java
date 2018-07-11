package com.jda.core;
import com.jda.utility.FunctionalUtility;

public class Replace 
{
	public static void main(String args[]) 
	{
		//FunctionalUtility utility = new FunctionalUtility();
		System.out.println("Enter your name");
		String inputString = FunctionalUtility.getString();
		String msg = " Hello <<dhskskdhfkjsdhx>> <<Username>> , How are you?";
		msg = msg.replaceFirst("\\<<(.*?)\\>>", inputString);
		System.out.println(msg);
	}
}
