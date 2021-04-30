package assignment10;

public class question20 {

	public static void main(String[] args) {
		/*
		 * In mathematics, the factorial of a positive integer n, denoted by n!, is the
		 * product of all positive integers less than or equal to n. Calculate factorial
		 * and output result to the console.
		 * Sample Output:
		 * input: 5 output: 120
		 */
		factor(5);
	}
	public static void factor (int num) {
		int fak=1;
		if(num==0) {
			System.out.println(fak);
		}else if (num>1) {
		for(int i=1;i<=num;i++) {
			fak=fak*i;
		}
			System.out.println(fak);
		}else {
			System.out.println("invalid number");
		}
	}
}
