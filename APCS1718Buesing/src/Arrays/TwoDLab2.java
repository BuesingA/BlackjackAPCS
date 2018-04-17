package twoDArrays;

public class TwoDLab2 {

	public TwoDLab2() {

	}

	// 1. Swapping 2 rows in a 2D array – This can be done both with and without
	// traversing the rows.
	public void rowSwap(int[][] mat, int rowAIndex, int rowBIndex) {
		
		
		
	}

	// 2. Swapping 2 columns in a 2D array – The columns must be traversed.
	public void colSwap(int[][] mat, int colAIndex, int colBIndex) {
		
		
		
	}

	// 3. Fill a 2D array in row-major order from a 1D data structure, in this
	// case a string
	public String[][] fillRowMajor(String str, int rows, int cols) {
		String[][] mat = new String[rows][cols];

		

		return mat;
	}

	// 4. Fill a 2D array in column-major order from a 1D data structure, in this
	// case a 1D array
	public int[][] fillColumnMajor(int[] vals, int rows, int cols) {
		int[][] mat = new int[rows][cols];

		
		
		
		return mat;
	}

	// 5. Fill a 2D array from the bottom up (see description) from a 1D data
	// structure
	public int[][] fillDownUp(int[] vals, int rows, int cols) {

		
		
		

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
