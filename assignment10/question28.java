package assignment10;

public class question28 {

	public static void main(String[] args) {
		/*
		 * This method gets two strings (text and badWord) and returns a string. Basicly
		 * what it does is take out all the occurrences of badWord in text.
		 * Sample Output: 
		 * clean ("one two three","two") returns "one three"
		 * clean ("foo bar","foo") returns "bar"
		 * clean ("he said bla bla bla","bla") returns "he said "
		 */
		
		System.out.println(clean("one two three", "two"));
		System.out.println(clean("foo bar", "foo").trim());
		System.out.println(clean("he said bla bla bla", "bla").trim());

	}
		public static String clean(String text, String badWord) {
			while(text.contains(badWord)) {
				text=text.replaceFirst(badWord, "");
			}
			return text;
		}
}
