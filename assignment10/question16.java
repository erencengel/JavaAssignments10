package assignment10;

public class question16 {

	public static void main(String[] args) {
	/*	Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
	 * 	such as with "javaxxx" or "xjavaxx" but not "xxjavaxx". The string should be 4 and more characters.
		Sample Output:
     	input: javapython
     	output: true
     	input: cjavac++
     	output: true
     	input: c#javaruby
     	output: false
	 *  done by erencengel.
	 */
		/*statement2("javaxxx");
		statement2("xjavaxxx");
		statement2("xxjavaxx");*/
		System.out.println(statement("javaphyton"));
		System.out.println(statement("cjavac++"));
		System.out.println(statement("c#javaruby"));
	}
	
	
	
	public static boolean statement (String word) {
		if(word.length()>=4) {
		if (word.substring(0, 4).equalsIgnoreCase("java") || word.substring(1, 5).equalsIgnoreCase("java")){
			return true;
		}else {
			return false;
		}
		}else {
			return false;
		}
	} 	
		
	/*public static void statement2 (String word) {
		if(word.length()>=4) {
			if (word.substring(0, 4).equalsIgnoreCase("java") || word.substring(1, 5).equalsIgnoreCase("java")){
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			}
	}*/

}
