package assignment10;

public class question27 {

	public static void main(String[] args) {
		/* coverString method will take 2 string parameters from the caller. 
		 * Your job is to write an important code that will :
		 * - to search and find each appearance of coverME within main - then surround
		 * it with [coverMe] (square brackets) - if you cannot find the coverME within
		 * main after tirelessly looping then just return whole main itself covered
		 * [main]. - keep in mind that coverME value can be of any length.
		 * Sample Output:
		 * coverString("java methods", "me") ) ; ==> "java [me]thods" 
		 * coverString("Certified Wooden Spoon", "o") ) ; ==>
		 * "Certified W[o][o]den Sp[o][o]n"
		 * coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
		 * coverString("apples", "pears") ) ; ==> "[apples]"
		 */
		System.out.println(coverString("java methods", "me"));
		System.out.println(coverString("Certified Wooden Spoon", "o"));
		System.out.println(coverString("hello hello", "ello"));
		System.out.println(coverString("apples", "pears"));

	}
	
	public static String coverString(String str1, String str2) {
		if(str1.contains(str2)) {
			return str1.replaceAll(str2, "["+str2+"]");
		}else {
			return "["+str1+"]";
		}
	}
	

}
