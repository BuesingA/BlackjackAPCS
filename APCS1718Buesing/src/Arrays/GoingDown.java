package Arrays;

public class GoingDown {

	public static boolean go(int[] numArray)
	{
		for(int i=0; i<numArray.length -1; i++)
		{
			if(numArray[i+1]>=numArray[i])
				return false;
		}
		return true;
	}
}
