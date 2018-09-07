import java.util.Scanner;

public class NumberCheck {

	public static void main(String[] args) {
		int[] numberArray = new int [10] ;

			Scanner s = new Scanner(System.in);
		for (int x = 0; x < numberArray.length; x++) {
			System.out.print("number please:");
			numberArray [x] = s.nextInt();
	}// closes loop
		if(hasSeven(numberArray))
			System.out.println("This one has seven");
		else
			System.out.println("no seven");
		//no even numbers and all smaller than seven
		if (other(numberArray)) {
			System.out.println("all numbers smaller than 7 and odd");
		} else {
			System.out.println("some numbers bigger than 7 or even");
					
		}
		}
	/**
	 * checks to see if any values in given array are equal to 7
	 * @param someArray
	 * @return true if it finds a seven
	 */
		
	public static boolean hasSeven (int [] someArray) {
		for (int x = 0; x < someArray.length; x++) {
			if (someArray [x] == 7)
				return true; 
	
	}
	//after checking the whole thing
	return false;
}
	/**
	 * check that the values of the given array are smaller than 7
	 * and are odd
	 * @param someArray
	 * @return true only if value are odd and less than 7
	 */
	public static boolean other (int [] someArray) {
		for (int x = 0; x < someArray.length; x++) {
			if (someArray [x] >= 7 || someArray [x] % 2 == 0)
				return false; 
		
	}
	//after checking the whole thing
	return true;
			
		}
	}
