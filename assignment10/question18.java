package assignment10;

public class question18 {

	public static void main(String[] args) {
	/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
	 * separated by the separator string.Sample Output:
     input: Word
     input: X
     input: 3
     output: WordXWordXWord
     input: This
     input: And
     input: 2
     output: ThisAndThis
     input: This
     input: And
     input: 1
     output: This 
     done by erencengel.
     */
		speech("Word", "X", 3);
		speech("This", "And", 2);
		speech("This", "And", 1);
	}
	public static void speech (String word, String seperator, int num) {
		String wordd="";
		for(int i=1;i<=num;i++) {
			wordd+=word.concat(seperator);
			}
		System.out.println(wordd.substring(0, (word.length()+seperator.length())*num-seperator.length()));
	}

}
