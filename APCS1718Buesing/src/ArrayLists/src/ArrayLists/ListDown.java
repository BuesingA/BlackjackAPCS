package ArrayLists;

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	
	public static boolean go(List<Integer> numArray)
	{
		for(int i = 0; i<numArray.size()-1; i++)
		{
			if(numArray.get(i)<=numArray.get(i+1))
				return false;
		}
		return true;
	}	
}

