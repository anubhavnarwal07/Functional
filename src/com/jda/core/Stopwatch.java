package com.jda.core;

import com.jda.utility.FunUtility;

public class Stopwatch {
	public static void main(String args[]) {
		long current;
		long later;
		long difference;
		System.out.println("Bro write something");
		FunUtility.getInt();
		current = System.currentTimeMillis();
		System.out.println("Fireeee");
		FunUtility.getInt();
		later = System.currentTimeMillis();
		difference = later - current;
		System.out.println(difference / 1000);
	}
}
