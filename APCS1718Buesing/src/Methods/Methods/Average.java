package Methods;

public class Average
{
	//instance variables
	private double one, two, average;

	public void setNums(double num1, double num2)
	{
		one = num1;
		two = num2;
	}

	public void average( )
	{
		double sum = one + two;
		average = sum/2;
	}
	public void print( )
	{
		System.out.println( one + " and " + two + " have an average of:: " + average);
	}




	public static void main( String[] args )
   {
 		Average test = new Average();
 		test.setNums(4.5, 6.57);
 		test.average();
 		test.print();
 		
 		Average test2 = new Average();
 		test2.setNums(56.8, 45.7);
 		test2.average();
 		test2.print();
   }}