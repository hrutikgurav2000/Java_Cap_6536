import java.util.Scanner;
/*You need a program to convert days to seconds.
The given code takes the amount of days as input. Complete the code to convert it to seconds and output the result.
*/
import java.util.*;
public class TimeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Enter number of days to convert to seconds: ");
		int days = scanner.nextInt();
		days = days *24 * 60 * 60;
		System.out.print(days);
		scanner.close();
	}

}
