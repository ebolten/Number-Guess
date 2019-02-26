import java.lang.Math;
import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		
		int RandInt;
		int UserGuess;
		
		Scanner input = new Scanner(System.in);
		RandInt = (int)(Math.random() * 101);
		
		System.out.println("Guess the Number: ");
		UserGuess = input.nextInt();
		
		while(UserGuess != RandInt) {
			if(UserGuess > RandInt) {
				System.out.println("You\'re guess it too high.");
				System.out.println(". . .");
			}
			else if(UserGuess < RandInt) {
				System.out.println("You\'re guess is too low.");
				System.out.println(". . .");
			}
			
			System.out.println("Guess the Number: ");
			UserGuess = input.nextInt();
		}
		if(UserGuess == RandInt) {
			System.out.println("You guessed the number!");
		}
		
		

	}

}
