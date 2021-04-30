package assignment10;

import java.util.Scanner;

public class question17 {

	public static void main(String[] args) {
	/*	Write a program that will print out letters in the alphabetic order accordingly to the given range within 2 chars.
		Sample Output:
     	input: A
     	input: Z
     	output: ABCDEFGHIJKLMNOPQRSTUVWXYZ
     	input: a
     	input: f
     	output: abcdef
     	input: a
     	input: d
     	output: abcd
     	input: B
     	input: O
     	output: BCDEFGHIJKLMNO 
     	done by erencengel.
     	*/
		Alphabet();
	}
	public static void Alphabet () {
		String alpha1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alpha2 = alpha1.toLowerCase();
		Scanner scan = new Scanner (System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		alpha1.indexOf(str1);
		alpha1.indexOf(str2);
		if (str1.toUpperCase().equals(str1) && str2.toUpperCase().equals(str2)) {
		System.out.println(alpha1.substring(alpha1.indexOf(str1), alpha1.indexOf(str2)+1));
		}else if (str1.toLowerCase().equals(str1) && str2.toLowerCase().equals(str2)){
		System.out.println(alpha2.substring(alpha2.indexOf(str1), alpha2.indexOf(str2)+1));
		}
		
	}
}
