package Variables;

import java.util.Scanner;

public class changeMachine {

	public static void main(String[] args) {
		
		Scanner money = new Scanner(System.in);
		System.out.println("Cost of Item:"); 
		double cost = money.nextDouble();
		System.out.println("Amount Paid:");
		double paid = money.nextDouble();
		double owed = paid - cost;
		owed = (int)(owed*100);
		int quarters = (int)(owed/25);
		int dimes = (int)((owed%25)/10);
		int nickles = (int)(((owed%25)%10)/5);
		int pennies = (int)(((owed%25)%10)%5);
		System.out.println("Your change is:");
		System.out.println(quarters +"quarters");
		System.out.println(dimes +"dimes");
		System.out.println(nickles +"nickles");
		System.out.println(pennies +"pennies");
	}

}
