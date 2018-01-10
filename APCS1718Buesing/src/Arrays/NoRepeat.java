package Arrays;

public class NoRepeat {

	public static boolean go(int[] ray)
	{	
		for(int i=0; i<ray.length; i++)
		{
			for(int j=0; j<ray.length; j++)
			{
				if(ray[i]==ray[j])
					return false;
			}
		}
		
		return true;
	}
}
