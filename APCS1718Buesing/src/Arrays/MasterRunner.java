package Arrays;

public class MasterRunner {
	
	public static void main( String args[] )
	{		
		Most test= new Most();
		System.out.println("Most; " + test.go(new int[] {4,5,7,5,3,6,10}));
		NoRepeat demo = new NoRepeat();
		System.out.println("No Repeat; " + demo.go(new int[] {4,5,7,5,3,6,10}));
		RayFirst demo2= new RayFirst();
		System.out.println("Ray First; " + demo2.go(new int[] {4,5,7,5,3,6,10}));
		RaySmallest test2= new RaySmallest();
		System.out.println("Ray Smallest; " + test2.go(new int[] {4,5,7,5,3,6,10}));
		RaySumLast test3= new RaySumLast();
		System.out.println("Ray Sum Last; " + test3.go(new int[] {4,5,7,5,3,6,10}));
		GoingDown test4= new GoingDown();
		System.out.println("Going Down; " + test4.go(new int[] {4,5,7,5,3,6,10}));
	}
}
