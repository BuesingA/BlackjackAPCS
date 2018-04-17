package twoDArrays;

import java.util.Arrays;

public class TwoDLab1 {

	public int total;
	public TwoDLab1() {

	}

	// 1 - This method should accept a two-dimensional array as its argument and
	// return the total of all the values in the array.
	public int getTotal(int[][] arr) {
		for(int r=0; r<arr.length; r++);
		{
			for(int c=0; c<arr[r].length; c++)
				total+=arr[r][c];
		}
		return total;
	}

	// 2 - This method should accept a two-dimensional array as its argument and
	// return the average of all the values in the array.
	public double getAverage(int[][] arr) {
		int t=TwoDLab1.getTotal(arr);
		
		
		






	}

	// 3. This method should accept a two-dimensional array as its first argument
	// and an integer as its second argument. The second argument should be the
	// subscript of a row in the array. The method should return the total of the
	// values in the specified row.
	public int getRowTotal() {
		





	}

	// 4. - This method should accept a two-dimensional array as its First argument
	// and an integer as its second argument. The second argument should be the
	// subscript of a column in the array. The method should return the total of the
	// values in the specified column.
	public int getColumnTotal() {




		

	}

	// 5. - This method should accept a two-dimensional array as its First argument
	// and an integer as its second argument. The second argument should be the
	// subscript of a row in the array. The method should return the Highest value
	// in the specified row in the array.
	public int getHighestInRow() {
		





	}

	// 6 - This method should accept a two-dimensional array as its First argument
	// and an integer as its second argument. The second argument should be the
	// subscript of a row in the array. The method should return the lowest value
	// in the specified row in the array.
	public int getLowestInRow() {
		






	}

	//// print methods
	public void printString(String[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void printInt(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}