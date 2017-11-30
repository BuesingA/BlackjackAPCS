package Loops;

import static java.lang.System.*;

public class BoxWord
{
	private static String word;

	public BoxWord()
	{
		
	}

	public BoxWord(String s)
	{
		word=s;
	}

	public void setWord(String s)
	{
		word=s;
	}

	public static String getBox(String s)
	{
		word=s;
		int length=word.length();
		while (length>0)
		{
			length=length-1;
			return word;
		}
	}
}