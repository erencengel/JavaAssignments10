package assignment10;

public class question19 {

	public static void main(String[] args) {
		/*
		 * Return the number of times that the string "java" appears anywhere in the
		 * given string word. Sample Output:
		 * input: javaxjava 
		 * output: 2
		 * input: javaxjavaapplepearjavaegg
		 * output: 3
		 */
		System.out.println(search("javaxjava"));
		System.out.println(search("javaxjavaapplepearjavaegg"));
	}
	public static int search(String word) {
		int number=0;
		while (word.contains("java")) {
			number++;
			word=word.replaceFirst("java", "");
	}
		return number;
	}
}
