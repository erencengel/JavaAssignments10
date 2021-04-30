package assignment10;

public class question23 {

	public static void main(String[] args) {
		/*
		 * A sandwich is two pieces of bread with something in between. Print the string
		 * that is between the first and last appearance of "bread" in the given string,
		 * or return string "nothing" if there are not two pieces of bread.
		 * Sample Output:
		 * input: breadjambread output: jam
		 * input: xxbreadjambreadyy output: jam
		 * input: xxbreadapple output: nothing
		 * input: breadbutterbread output: butter
		 */
		
		
		System.out.println(sandwich("breadjambread"));
		System.out.println(sandwich("xxbreadjambreadyy"));
		System.out.println(sandwich("xxbreadapple"));
		System.out.println(sandwich("breadbutterbread"));
	}
	
	public static String sandwich(String statement) {
		int a = statement.indexOf("bread");
		if(statement.contains("bread")) {
			statement=statement.replaceFirst("bread", "");
		}
		if(statement.contains("bread")) {
			return statement.substring(a, statement.indexOf("bread"));
		}else {
			return "nothing";
		}
		
		
	}
	

}
