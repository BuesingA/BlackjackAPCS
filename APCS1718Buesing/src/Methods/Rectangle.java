package Methods;

public class Rectangle
{
	private int length;
	private int width;
	private int perimeter;

	public void setLengthWidth(int len, int wid )
	{
		length=len;
		width=wid;
	}

	public void calculatePerimeter( )
	{
		 perimeter = (length+length+width+width);
	}

	public void print( )
	{
		System.out.println("The Perimeter is ::" + perimeter);
	}

	public static void main( String[] args )
	{
		Rectangle test = new Rectangle();
		test.setLengthWidth(2,6);
		test.calculatePerimeter( );
		test.print();

		test.setLengthWidth(12,5);
		test.calculatePerimeter( );
		test.print();
	}}
