package assignment10;

public class question25 {

	public static void main(String[] args) {
		/*
		 * When gears merge and work together, one tooth from each one goes in order.
		 * Write a method mergeStrings that will return the strings merged, one letter
		 * at a time, starting with one. Please note one and two can be of different
		 * lengths. Please look at below examples:
		 * s1 ==> "12345" s2 ==> "abcde" mergeStrings(s1,s2) ==> "1a2b3c4d5e"
		 * mergeStrings("wooden", "spoon") ==> "wsopoodoenn"
		 * mergeStrings("java", "selenium") ==> "jsaevlaenium"
		 */
		
		System.out.println(mergeStrings("12345", "abcde"));
		System.out.println(mergeStrings("wooden", "spoon"));
		System.out.println(mergeStrings("java", "selenium"));
		
	}
		
	public static String mergeStrings(String str1,String str2) {
		String str3="";
		String str4="";
		String str5="";
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				str3+=str1.substring(i, i+1).concat(str2.substring(i, i+1));
			}
			return str3;
		}else if (str1.length()>str2.length()) {
			for(int i=0;i<str2.length();i++) {
				str4+=str1.substring(i, i+1).concat(str2.substring(i, i+1));
			}
			str1=str1.substring(str2.length());
			str4=str4.concat(str1);
			return str4;
		}else {
			for(int i=0;i<str1.length();i++) {
				str5+=str1.substring(i, i+1).concat(str2.substring(i, i+1));
			}
			str2=str2.substring(str1.length());
			str5=str5.concat(str2);
			return str5;
		}
	}

	
	
}
