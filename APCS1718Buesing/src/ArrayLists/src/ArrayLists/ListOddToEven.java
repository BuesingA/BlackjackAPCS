package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int distance = 0;
		int findOdd = -1;
		int findEven = -1;
		
		for(int i = 0; i<ray.size(); i++)
		{
			while(findOdd==-1)
		{
				if(ray.get(i)%2==1)
					findOdd=i;
		}
			if(ray.get(i)%2==0)
				findEven=i;
		}
		if(findOdd==-1 || findEven==-1)
			return -1;
		else
		{
		distance= findEven-findOdd;
		return distance;
		}
	}
}