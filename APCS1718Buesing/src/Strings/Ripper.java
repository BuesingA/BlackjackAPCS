package Strings;

import static java.lang.System.*;

public class Ripper
{
	private String word;
	
	public Ripper()
	{
	}

	public Ripper(String s)
	{
		setString(s);
	}
	
   public void setString(String s)
   {
	   word = s;
   }	

	public String ripString(int x, int y)
	{
		return word.substring(x, y);
	}

 	public String toString()
 	{
 		return "\n\n" + word;
	}
}