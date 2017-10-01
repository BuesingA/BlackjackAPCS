package Variables;

import java.util.Scanner;

public class WeightedAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input your test scores:");
		System.out.println("Test 1:"); int testOne = scan.nextInt();
		System.out.println("Test 2:"); int testTwo = scan.nextInt();
		
		System.out.println("Input your quiz scores:");
		System.out.println("Quiz 1:"); int quizOne = scan.nextInt();
		System.out.println("Quiz 2:"); int quizTwo = scan.nextInt();
		System.out.println("Quiz 3:"); int quizThree = scan.nextInt();
		
		System.out.println("Enter your Homework Average"); double homework = scan.nextDouble();
		double testAvg = (testOne + testTwo)/2;
		double quizAvg = (quizOne + quizTwo + quizThree)/3;
		double grade = (.5*testAvg) + (.3*quizAvg) + (.2*homework);
		System.out.println("Your test average is:" + testAvg);
		System.out.println("Your quiz average is:" + quizAvg);
		System.out.println("Your grade is:" + grade);
	}

}
