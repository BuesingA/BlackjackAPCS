package Variables;

import java.util.Scanner;

public class input
{
	

		public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();
		

		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();


		System.out.println("Enter a double :: ");
		doubleOne = keyboard.nextDouble();
		
		System.out.println("Enter a double :: ");
		doubleTwo = keyboard.nextDouble();

		System.out.println("Enter a Float :: ");
		floatOne = keyboard.nextFloat();
		
		System.out.println("Enter a Float :: ");
		floatOne = keyboard.nextFloat();
		
		System.out.println("Enter a short :: ");
		shortOne = keyboard.nextShort();
		
		System.out.println("Enter a short :: ");
		shortTwo = keyboard.nextShort();
		
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );

		System.out.println("double one = " + doubleOne );
		System.out.println("double two = " + doubleTwo );
		
		System.out.println("float one = " + floatOne );
		System.out.println("float two = " + floatTwo );
		
		System.out.println("short one = " + shortOne );
		System.out.println("short two = " + shortTwo );
}
}
}
