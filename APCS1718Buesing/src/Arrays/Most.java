package Arrays;

public class Most {
	
	public static int go(int[] ray)
	{
		int mode= ray[0];
		int countMode=0;
		int countNum=0;
		for(int i=0; i<ray.length; i++)
		{
			for(int j=0; j<ray.length; j++)
			{
				if(ray[i]==ray[j])
					countNum++;
			}
		if(countNum>countMode)
		{
			countMode=countNum;
			mode=ray[i];
		}
		countNum=0;
		}
		return mode;
	}
}
