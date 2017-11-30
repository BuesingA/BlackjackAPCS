package Loops;

import static java.lang.System.*;

public class ReverseNum
{
   private static int number;

	public void int ReverseNum()
	{

	}
	
	
	public static int setReverse(num)
	{
		number=num;
	}


	public static int getReverse()
	{
		int rev=0;	
		while (number>0)
		{
			rev=rev*10;
			rev+=(number%10);
		}
		return rev;
	}

	public String toString()
	{
		return (number + "  " + ReverseNum.getReverse());
	}
	
}