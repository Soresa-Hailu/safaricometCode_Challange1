import java.util.Scanner;

public class Q2Ssolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in  = new Scanner(System.in);
		int num = in.nextInt();
		int returnVal = checkFive( num);
		System.out.println(returnVal);
		
	}

	private static  int  checkFive(int num) {
		// TODO Auto-generated method stub
		
	   int val;
	   while(num =!0) {
		   val = num/10;
		   num = num % 10;
	   }
		
		return 0;
		
	}

}
