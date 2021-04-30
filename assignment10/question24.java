package assignment10;

public class question24 {

	public static void main(String[] args) {
		/*
		 * Given a string, print out true if the number of appearances of "java"
		 * anywhere in the string is equal to the number of appearances of "python"
		 * anywhere in the string (case sensitive).
		 * Sample Output:
		 * input: We study java not python 
		 * output: true
		 * input: What's the difference between java, javascript and python? 
		 * output: false
		 */
		
		System.out.println(equality("We study java not python"));
		System.out.println(equality("What's the difference between java, javascript and python"));
		System.out.println(equality("javapythonpython"));

	}
	public static boolean equality(String sentence) {
		int num1=0;
		int num2=0;
		while (sentence.contains("java")) {
			num1++;
			sentence=sentence.replaceFirst("java", "");
		}
		
		while(sentence.contains("python")) {
			num2++;
			sentence=sentence.replaceFirst("python", "");
		}
		if(num1==num2) {
			return true;
		}else {
			return false;
		}
	}
	
	
}
