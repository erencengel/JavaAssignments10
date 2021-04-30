package assignment10;

public class question31 {

	public static void main(String[] args) {
		/*
		 * Palindrome is a word, phrase, or sequence that reads the same backward as
		 * forward, e.g., madam or nurses run.
		 * So method isPalindrome checks that and returns true if check is palindrome
		 * and false if it is not.
		 * make your conditions case insensitive. ex: Civic and civic are both
		 * palindromes - make your conditions space insensitive. Race car is a
		 * palindrome even though there is space in between.
		 * Sample Output:
		 * isPalindrome("Noon") ==> true
		 * isPalindrome("I am not palindrome") ==> false
		 * isPalindrome("wooden") ==> false
		 * isPalindrome("Nurses Run") ==> true
		 */
		
		System.out.println(isPalindrome("Noon"));
		System.out.println(isPalindrome("I am not palindrome"));
		System.out.println(isPalindrome("wooden"));
		System.out.println(isPalindrome("Nurses Run"));
		
	}
	
	public static boolean isPalindrome(String word) {
		
		String word1="";
		if (word.contains(" ")) {
			word=word.replace(" ", "");
		}
		for(int i=word.length()-1;i>=0;i--) {
			word1+=word.charAt(i);
		}
		if (word.equalsIgnoreCase(word1)) {
			return true;
		}else {
			return false;
		}
	}

}
