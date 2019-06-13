import java.util.Scanner;
public class Lottery {

	public static void main(String[] args) {
		
		//Get number
		
		int lottery = (int)(Math.random() * 100);
		System.out.println(lottery);
		
		System.out.println("Guess a two digit number: ");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		int lotNum1 = lottery / 10;
		int lotNum2 = lottery % 10;
		
		int guessNum1 = guess / 10;
		int guessNum2 = guess % 10;
		
		if (lottery == guess) {
			System.out.println("you got 10000000$");
		}
		
		

	}

}
