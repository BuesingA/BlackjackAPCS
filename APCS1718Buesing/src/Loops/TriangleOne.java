package Loops;

import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
	}

	public void setWord(String s)
	{
		word=s;
	}

	public void print( )
	{
		for (int i=word.length(); i>0; i=i-1)
			out.println(word.substring(0, i-1));
	}
}