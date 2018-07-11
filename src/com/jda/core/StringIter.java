package com.jda.core;

import com.jda.utility.FunctionalUtility;

public class StringIter {
	private static void swap(char[] ch, int i, int j) {
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	private static void permutations(char[] ch, int currentindex) {
		if (currentindex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}
		for (int i = currentindex; i < ch.length; i++) {
			swap(ch, currentindex, i);
			permutations(ch, currentindex + 1);
			swap(ch, currentindex, i);
		}
	}

	public static void main(String args[]) {
		String s = FunctionalUtility.getString();
		permutations(s.toCharArray(), 0);
	}

}
