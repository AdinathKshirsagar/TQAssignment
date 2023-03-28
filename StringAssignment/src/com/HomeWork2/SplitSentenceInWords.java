package com.HomeWork2;

import java.util.Arrays;

public class SplitSentenceInWords {

	public static void main(String[] args) {

		String sentence = "I am learing java honestly";

		String[] words = splitSentenceByWords(sentence);

		System.out.println(Arrays.toString(words));

	}

	private static String[] splitSentenceByWords(String str) {

		if (str == null || str.equals(""))
			return new String[0];

		String[] words = str.split(" ");

		return words;
	}
}