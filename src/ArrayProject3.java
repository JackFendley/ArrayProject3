import java.util.Scanner;

/**
 * 
 */

/**
 * @author j.fendley
 *
 */
public class ArrayProject3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		int[] userNum = new int [5];
		int largestNum = 0;
		
		System.out.println("Please enter 5 whole numbers integer values: ");
		
		for(int i = 0; i < userNum.length; i++){
			System.out.print("Please enter a number: ");
			userNum[i] = userInput.nextInt();
		}
		
		largestNum = userNum[0];
		
		for(int i = 0; i < userNum.length; i++){
			
			if(userNum[i] > largestNum){
				largestNum = userNum[i];
			}
			
		}
		
		System.out.print("The largest number you entered is " + largestNum);
		
		userInput.close();
	}

}
