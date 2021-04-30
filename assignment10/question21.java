package assignment10;

public class question21 {

	public static void main(String[] args) {
		/*
		 * Given a string, consider the prefix string made of the first n chars of the
		 * string. Does that prefix string appear somewhere else in the string? Assume
		 * that the string is not empty and that n is in the range from 1 till str.length().
		 * Sample Output:
		 * input: abXYabc input: 1
		 * output: true a appears twice
		 * input: abXYabc input: 2 
		 * output: true ab appears twice
		 * input: abXYabc input: 3 
		 * output: false abX appears once only
		 * (input.replaceFirst(input.substring(0, number), "")).contains(input.substring(0, number))
		 */
		given("abXYabc", 1);
		given("abXyabc", 2);
		given("abXYabc", 3);
		
		
	}
	
	public static void given(String str, int num) {
		int count=0;
		String str2=str.substring(0, num);
		do {
			str=str.replaceFirst(str2, "");
			count++;
		}while(str.contains(str2));
		
		if(count>1) {
			System.out.println(true +" "+ str2 + " appears " + count + " times");
		}else {
			System.out.println(false + " " + str2 + " appears once only");
		}
	}
	
	

}
