package Arrays;

public class RaySmallest {
	
	public static int go(int[] ray)
	{
		int smol= ray[0];
		for(int i=1; i<ray.length; i++)
		{
			if(ray[i]<smol)
				smol=ray[i];
		}
		
		return smol;
	}
}
