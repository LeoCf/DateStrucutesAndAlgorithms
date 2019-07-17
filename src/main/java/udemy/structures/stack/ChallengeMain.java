package udemy.structures.stack;

import java.util.concurrent.SynchronousQueue;

import udemy.structures.Employee;

public class ChallengeMain {

	public static void main(String[] args) {
		// should return true
		System.out.println(checkForPalindrome("abccba"));
		// should return true
		System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
		// should return true
		System.out.println(checkForPalindrome("I did, did I?"));
		// should return false
		System.out.println(checkForPalindrome("hello"));
		// should return true
		System.out.println(checkForPalindrome("Don't nod"));
	}

	public static boolean checkForPalindrome(String string) {
		LinkedStackString aStack = new LinkedStackString();
		String parsedString = string.toLowerCase();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < string.length(); i++) {
			String aStringChar = parsedString.substring(i, i + 1);
			char charToInsert = aStringChar.charAt(0);
			if(charToInsert>='a' && charToInsert <='z') {
				str.append(aStringChar);
				aStack.push(String.valueOf(charToInsert));
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (!(str.substring(i, i + 1).equals(aStack.peek()))) {
				return false;
			} else {
				aStack.pop();
			}
		}
		
		return true;
	}	
}
