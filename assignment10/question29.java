package assignment10;

public class question29 {

	public static void main(String[] args) {
		/*
		 * This method gets a string and an int, it returns a string. What it does is to
		 * limit the inputted string to a creating number of characters.
		 * Sample Output:
		 * limit("abcd",2) returns "ab"
		 * limit("bla bla",3) returns "bla"
		 */
		System.out.println(limit("abcd", 2));
		System.out.println(limit("bla bla", 3));

	}
		public static String limit(String str, int num) {
			return str=str.substring(0, num);
			
		}
}
