package Loops;

import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number=stop=0;
	}

	public MultTable(int num, int end)
	{
		number=num;
		stop=end;
	}

	public void setTable(int num, int end)
	{
		number=num;
		stop=end;
	}

	public void printTable( )
	{
		for (i=0; i<end; i++)
			return (i + "    " + (i*number));
	}
}