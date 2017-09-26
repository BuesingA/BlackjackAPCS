package Variables;

import static java.lang.System.*;
import java.util.Scanner;

public class BirthdayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Use Pencil and paper to make the following calculations");
		System.out.println("Take your birth month and multiply by 5, add 6, multiply by 4");
		System.out.println("add 9, multiply by 5, add your birthday (1oth is 10 etc)");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's your number?");
		int intOne = keyboard.nextInt();
		int intTwo = intOne-165;
		int intThree = intTwo/100;
		int intFour = intTwo%100;
		System.out.println(intThree+"/"+intFour);

	}

}
