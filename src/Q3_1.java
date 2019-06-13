import java.util.Scanner;

public class Q3_1 {
	
	public static void main(String[] args) {
		
		
		double random1 = (double)Math.random() * 10;
		int num1 = (int)random1;
		
		double random2 = (double)Math.random() * 10;
		int num2 = (int)random2;
		
		System.out.println("What is " + num1 + " + " + num2 + "?");
		
		int sum = num1 + num2;
		
		boolean go = true;
		
		while (go) {
			Scanner input = new Scanner(System.in);
			int user = input.nextInt();
			if (user > sum) {
				System.out.println("Too Big");
			} else if (user < sum) {
				System.out.println("Too Small!");
			} else {
				System.out.println("Correct");
				go = false;
			}
			
		}
		
	}
	
	
}