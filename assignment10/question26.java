package assignment10;

public class question26 {

	public static void main(String[] args) {
		/*
		 * uniqueChars is a method that you will code now, should be able to accept any
		 * string in the word and return unique characters from the parameter.
		 * Sample Output:
		 * uniqueChars("java") ==> "jav"
		 * uniqueChars("mama") ==> "ma"
		 * uniqueChars("spoon") ==> "spon"
		 */
		System.out.println(uniqueChars("java"));
		System.out.println(uniqueChars("mama"));
		System.out.println(uniqueChars("spoon"));
	}
	
	public static String uniqueChars(String word) {
		String word1=word.charAt(0)+"";
		for(int i=1;i<word.length();i++) {
			if(!(word1.contains(word.charAt(i)+""))) {
				word1+=word.charAt(i);
			}
		}
		return word1;
		
		
	}
	
	
	
	
	
}