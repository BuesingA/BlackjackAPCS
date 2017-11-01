package Strings;

import static java.lang.System.*;

public class FirstAndLast
{
	private String word;

	public FirstAndLast(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public String getFirst()
	{
		return String.valueOf(word.charAt(0));
	}
	
	public String getLast()
	{
		return String.valueOf(word.charAt(word.length() - 1));
	}

 	public String toString()
 	{
 		String output= word;
 		return output;
	}
}