package com.in28minutes.JspidersQuestion;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class StringPractice {
	public String str;

	public StringPractice() {

	}

	public StringPractice(String str) {
		this.str = str;
	}


	public String reverseAString() {
		String reverse = "";
		for (int i = str.length(); i > 0; i--) {
			reverse = reverse + str.substring(i - 1, i);
		}
		return reverse;
	}

	public String reverseAStringWithRecussion(String str) {
		if (str.length() == 0) {
			return "";
		}
		return str.substring(str.length() - 1, str.length())
				+ reverseAStringWithRecussion(str.substring(0, str.length() - 1));
	}

	public String reverseFirstHalfandSecondHalfSeparately() {
		String reverse = "";
		for (int i = (str.length()) / 2; i > 0; i--) {
			reverse = reverse + str.substring(i-1,i);
		}
		for (int i = str.length(); i > str.length() / 2; i--) {
			reverse = reverse + str.substring(i-1,i);
		}
		return reverse;
	}

	public String rotateCharacters(int rotateBy) {
		String rotate = "";
		rotate = rotate + str.substring(rotateBy, str.length()) + str.substring(0, rotateBy);
		return rotate;
	}

	public int findLength() {
		int length = 0;
		while (length < str.length()) {
			length++;
		}
		return length;
	}

	public int findNumberOfWords() {
		int count = 1;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++ ;
			}
		}
		return count;
	}

	public int numberOfDuplicateWords() {
		int space = 0;
		int count = 0;
		LinkedList<String> words = new LinkedList<String>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ' || str.charAt(i) == '.') {
				words.add(str.substring(space, i));
				space = i + 1;
			}
			else if (i == str.length() - 1) {
				words.add(str.substring(space, i + 1));
				space = i;
			}
		}
			for (int i = 0 ; i< words.size(); i++) {
				String str = words.get(i);
				for(int j = i+1 ; j< words.size(); j++) {
				if(str.equals(words.get(j))) {
				count++;
				break;
				}
				}
			}
			System.out.println(words);
			return count;
		}

		public String reverseStringWordWise() {
			int space = 0;
			String reverse = "";
			LinkedList<String> words = new LinkedList<String>();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ' || str.charAt(i) == '.') {
					words.add(str.substring(space, i));
					space = i + 1;
				} else if (i == str.length() - 1) {
					words.add(str.substring(space, i + 1));
					space = i;
				}
			}
			for (int i = words.size() - 1; i >= 0; i--) {
				reverse = reverse + words.get(i) + " ";
			}
			return reverse;
		}

		public String rotateStringWordWise(int rotateBy) {
			int space = 0;
			String rotate = "";
			LinkedList<String> words = new LinkedList<String>();
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ' || str.charAt(i) == '.') {
					words.add(str.substring(space, i));
					space = i + 1;
				} else if (i == str.length() - 1) {
					words.add(str.substring(space, i + 1));
					space = i;
				}
			}
			int count = 0;
			for (int i = rotateBy; i < words.size() + rotateBy; i++) {
				if (i >= words.size()) {
					rotate = rotate + words.get(count) + " ";
					count++;
				}
				else if (i < words.size()) {
				rotate = rotate + words.get(i) + " ";
				}
			}
			return rotate;
	}

	public int countTheNumberOfOccurenceOfGivenCharacter(char check) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == check) {
				count++;
			}
		}
		return count;
	}

	public void countTheNumberOfOccurenceOfEachCharacter() {
		for (int index = 0; index < str.length(); index++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == str.charAt(index)) {
					count++;
				}
			}
			System.out.println("The number of occurances of char " + str.charAt(index) + " is " + count);
	}
	}

	public String removeWhiteSpacesWithoutLoops() {
		String remove = str.replaceAll(" ", "");
		return remove;
	}

	public String removeWhiteSpacesWithLoops() {
		String remove = "";
		int space = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(" ")) {
				remove = remove + str.substring(space, i);
				space = i + 1;
			}
			else if (i == str.length() - 1) {
				remove = remove + str.substring(space, i + 1);
				break;
			}
		}
		return remove;
	}

	public boolean isPalindromeOrNot(String str) {
		String palindrome = "";
		for (int i = str.length(); i > 0; i--) {
			palindrome = palindrome + str.substring(i - 1, i);
		}
		if (palindrome.equals(str)) {
			System.out.println("The String is a palindrome");
			return true;
		}
		System.out.println("The String is not a palindrome");
		return false;
	}

	public boolean isAnagramOrNot(String string1, String string2) {
		LinkedHashMap<Character, Integer> count1 = new LinkedHashMap<>();
		count1 = countOccuranceOfEachCharacter(string1);
		LinkedHashMap<Character, Integer> count2 = new LinkedHashMap<>();
		count2 = countOccuranceOfEachCharacter(string2);
		if (count1.equals(count2)) {
			return true;
		}
		return false;

	}

	public boolean checkBalanceOfBrackets(String str) {
		System.out.println(str);
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case '{':
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(j) == '[') {
						if (str.charAt(j) == ']' || str.charAt(j) == ')' && str.charAt(j) != '}') {
						}
					}
				}
			case '[':
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(j) == '}' || str.charAt(j) == ')') {
						return false;
					}
				}
			case '(':
				for (int j = i + 1; j < str.length(); j++) {
					if (str.charAt(j) == ']' || str.charAt(j) == '}') {
						return false;
					}
				}
			case '}':
				return false;
			case ']':
				return false;
			case ')':
				return false;
			default:
				break;
			}
		}
		return true;
	}

	public void findDuplicateChars() {
		String duplicate = "";
		for (int index = 0; index < str.length(); index++) {
			int count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(index) == str.charAt(j)) {
					count++;
					if (count > 1) {
						if (!(duplicate.contains(str.substring(index, index + 1)))) {
							duplicate = duplicate + str.substring(index, index + 1);
						break;
						}
					}
				}
			}
		}
	}

	public boolean checkIfOneIsWordWiseRoatationOfAnother(String check1, String check2) {
		int space = 0;
		int count = 0;
		LinkedList<String> words1 = new LinkedList<String>();
		LinkedList<String> words2 = new LinkedList<String>();
		for (int i = 0; i < check1.length(); i++) {
			if (check1.charAt(i) == ' ' || check1.charAt(i) == '.') {
				words1.add(check1.substring(space, i));
				space = i + 1;
			} else if (i == check1.length() - 1) {
				words1.add(check1.substring(space, i + 1));
			}
		}
		space = 0;
		for (int i = 0; i < check2.length(); i++) {
			if (check2.charAt(i) == ' ' || check2.charAt(i) == '.') {
				words2.add(check2.substring(space, i));
				space = i + 1;
			} else if (i == check2.length() - 1) {
				words2.add(check2.substring(space, i + 1));
			}
		}
		if (words1.size() == words2.size()) {
			for (int index = 0; index < words1.size(); index++) {
				for (int j = 0; j < words2.size(); j++) {
					if (words1.get(index).equals(words2.get(j))) {
						count++;
						break;
					}
				}
			}
			if (count == words1.size() && count == words2.size()) {
				return true;
			}
		}
		return false;
	}

	public boolean checkIfOneIsRoatationOfAnother(String check1, String check2) {
		int index = 0;
		if (check1.length() == check2.length()) {
			for (int j = 0; j < check2.length(); j++) {
				if (check1.charAt(index) == check2.charAt(j)) {
					int rotateBy = check1.length() - j;
					if (check1.substring(rotateBy, check1.length()).equals(check2.substring(0, j))
							&& check1.substring(0, rotateBy).equals(check2.substring(j, check2.length()))) {
							return true;
						}
					}
				}
		}
		return false;
	}

	public String reverseAStringPreservingSpaces() {
		String reverse = "";
		int j = str.length();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				j--;
			}
			else {
				reverse = reverse + str.substring(j - 1, j);
				j--;
			}
		}
		return reverse;
	}

	public String reverseEachWord() {
		String reverse = "";
		String wholeReverse = "";
		int space = 0;
		LinkedList<String> words = new LinkedList<String>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				words.add(str.substring(space, i));
				space = i + 1;
			} else if (i == str.length() - 1) {
				words.add(str.substring(space, i + 1));
			}
		}
		for (int index = 0; index < words.size(); index++) {
			reverse = "";
			for (int i = words.get(index).length(); i > 0; i--) {
				reverse = reverse + words.get(index).substring(i - 1, i);
			}
			wholeReverse = wholeReverse + reverse + " ";
		}
		return wholeReverse;
	}

	public double findPercentageOfUpperCaseLetters() {
		double count = 0.0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
				count++;
			}
		}
		double percentage = (count / str.length()) * 100;
		return percentage;
	}

	public double findPercentageOfLowerCaseLetters() {
		double count = 0.0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
				count++;
			}
		}
		double percentage = (count / str.length()) * 100;
		return percentage;
	}

	public double findPercentageOfDigits() {
		double count = 0.0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
				count++;
			}
		}
		double percentage = (count / str.length()) * 100;
		return percentage;
	}

	public double findPercentageOfSpecialCharacters() {
		double count = 0.0;
		for (int i = 0; i < str.length(); i++) {
			if (!(str.charAt(i) >= 97 && str.charAt(i) <= 122) && !(str.charAt(i) >= 48 && str.charAt(i) <= 57)
					&& !(str.charAt(i) >= 65 && str.charAt(i) <= 90) && !(str.charAt(i) == ' ')) {
				count++;
			}
		}
		double percentage = (count / str.length()) * 100;
		return percentage;
	}

	public String findLongestSubStringWithoutRepeatingCharacters() {
		String sub = "";
		for (int index = 0; index < str.length(); index++) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						break;
					}
					count++;
				}
				if (count == str.length()) {
					sub = sub + str.substring(i, i + 1);
				}
			}
		}
		return sub;
	}

	public void swapTwoStringVariables(String string1, String string2) {
		System.out.println("Before Swapping " + string1 + " # " + string2);
		string1 = string1.concat(string2);
		string2 = string1.replaceAll(string2, string1);
		string1 = string2.replaceAll(string1, string2);
		System.out.println("After Swapping " + string1 + " # " + string2);
	}

	public void findAllPermutationsOfAString(String str) {

	}

	public void findFirstRepeatedandNonRepeatedCharacter() {
		int count1 = 0;
		int count2 = 0;
		for (int index = 0; index < str.length(); index++) {
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(index) == str.charAt(j)) {
					count1++;

				} else if (str.charAt(index) != str.charAt(j)) {
				count2++;
				}
			}
			if (count1 > 1) {
				System.out.println("The first repeated character is " + str.charAt(index));
				break;
			}
			if (count2 == str.length() - 1) {
				System.out.println("The first non repeated character is " + str.charAt(index));
			}
		}
	}

	public LinkedHashMap<Character, Integer> countOccuranceOfEachCharacter(String str) {
		LinkedHashMap<Character, Integer> occur = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			Integer count = occur.get(str.charAt(i));
			if (count == null) {
				occur.put(str.charAt(i), 1);
			} else {
				occur.put(str.charAt(i), count + 1);
			}
		}
		return occur;
	}

	public LinkedHashMap<String, Integer> countOccuranceOfWord(String str) {
		LinkedHashMap<String, Integer> occur = new LinkedHashMap<>();
		LinkedList<String> words = new LinkedList<>();
		int space = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.substring(i, i + 1).equals(" ")) {
				words.add(str.substring(space, i));
				space = i + 1;
			} else if (str.substring(i, i + 1).equals(".")) {
				words.add(str.substring(space, i));
				space = i + 1;
			}
		}
		for (int i = 0; i < words.size(); i++) {
			Integer occurance = occur.get(words.get(i));
			if (occurance == null) {
				occur.put(words.get(i), 1);
			} else {
				occur.put(words.get(i), occurance + 1);
			}
		}
		return occur;
	}
}
