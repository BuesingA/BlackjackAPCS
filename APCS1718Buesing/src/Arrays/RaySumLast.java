package Arrays;

public class RaySumLast
{
	public static int go(int[] ray)
	{
	int last=ray[ray.length -1];
	int count=0;
	for(int i=0; i<ray.length -1; i++)
	{
		if(ray[i]>last)
			count+=ray[i];
	}
	return count;
	}
}