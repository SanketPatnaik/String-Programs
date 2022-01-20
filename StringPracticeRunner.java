package com.in28minutes.JspidersQuestion;

public class StringPracticeRunner {

	public static void main(String[] args) {
		StringPractice string = new StringPractice("Neetushri Kabi is So Beautiful.I Love Neetushri Kabi.");

		System.out.println(string.reverseAString());

		System.out.println(string.reverseAStringWithRecussion("Neetushri Kabi"));

		System.out.println(string.reverseFirstHalfandSecondHalfSeparately());

		System.out.println(string.rotateCharacters(3));

		System.out.println(string.findLength());

		System.out.println(string.findNumberOfWords());

		// System.out.println(string.numberOfDuplicateWords());

		System.out.println(string.reverseStringWordWise());

		System.out.println(string.rotateStringWordWise(3));

		System.out.println(string.countTheNumberOfOccurenceOfGivenCharacter('u'));

		// string.countTheNumberOfOccurenceOfEachCharacter(); //(Completed but o/p too
		// long)

		System.out.println(string.removeWhiteSpacesWithoutLoops());

		System.out.println(string.removeWhiteSpacesWithLoops());

		System.out.println(string.isPalindromeOrNot("XXRRooRRXX"));

		System.out.println(string.isAnagramOrNot("Neetushri Kabi", "Kabi Neetushri"));

		// System.out.println(string.checkBalanceOfBrackets("{[()]}")); // (Not
		// Completed)

		string.findDuplicateChars();
		System.out.println();

		System.out.println(string.checkIfOneIsWordWiseRoatationOfAnother("Neetushri Kabi is So Beautiful",
				"Kabi is So Beautiful Neetushri"));

		System.out.println(string.checkIfOneIsRoatationOfAnother("Neetushri Kabi is So Beautiful",
				"tushri Kabi is So BeautifulNee"));

		// System.out.println(string.reverseAStringPreservingSpaces()); // (Not
		// Completed)

		System.out.println(string.reverseEachWord());

		System.out.println(string.findPercentageOfUpperCaseLetters());

		System.out.println(string.findPercentageOfLowerCaseLetters());

		System.out.println(string.findPercentageOfDigits());

		System.out.println(string.findPercentageOfSpecialCharacters());

		// System.out.println(string.findLongestSubStringWithoutRepeatingCharacters());//(Not
		// Completed)

		// string.swapTwoStringVariables("Neetu", "Liza");// (Not Completed)

		string.findFirstRepeatedandNonRepeatedCharacter();

		string.countOccuranceOfEachCharacter("Neetushri Kabi");

		string.countOccuranceOfWord("Neetushri Kabi ");
	}

}
