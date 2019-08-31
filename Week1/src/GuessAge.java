
import java.util.Scanner;
public class GuessAge {

	public static void main(String[] args) {
		String name;
		int ageGuess;
		Scanner scan = new Scanner(System.in);
		// Collect name from user and set variable
		System.out.print("Enter the name: ");
		name = scan.next();
		// Collect age from user and set variable
		System.out.print("Enter the age: ");
		ageGuess = scan.nextInt();
		System.out.println("You guessed that " + name + " is " + ageGuess + " years old!");
			
	}

}
