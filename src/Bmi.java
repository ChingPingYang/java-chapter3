import java.util.Scanner;
public class Bmi {
	public static void main(String[] args) {
		System.out.println("Put your scors for Math, English, Science");
		Scanner input = new Scanner(System.in);
		int math = input.nextInt();
		int english = input.nextInt();
		int science = input.nextInt();
		
		int average = (math + english + science) / 3;	
		System.out.print("You got " + average + "   ");
		if (average >= 90) {
			System.out.println("A");
		} else if (average >= 80){
			System.out.println("B");
		} else if (average >= 70) {
			System.out.println("C");
		} else if (average >= 60) {
			System.out.println("D");
		} else if (average >= 50) {
			System.out.println("E");
		} else {
			System.out.println("Fuck");
		}
		
		
	}

}
