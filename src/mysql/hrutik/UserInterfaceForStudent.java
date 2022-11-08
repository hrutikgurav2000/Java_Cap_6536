package mysql.hrutik;

import java.sql.SQLException;
import java.util.Scanner;

public class UserInterfaceForStudent {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("___Welcome___");
		int i=0; 
		try {
			while(!(i<0 || i> 5)) {
				System.out.println("Please select one option from below");
				System.out.println("1. To add user in database.");
				System.out.println("2. To delete user in database.");
				System.out.println("3. To select user record from database.");
				System.out.println("4. To update user in database.");
				System.out.println("5. To show all users");
				System.out.println("6. To exit");
				i = sc.nextInt();
				
				switch(i){
				case 1: UserInputOutput.addRecord();
					break;
				case 2: UserInputOutput.deleteRecord();
					break;
				case 3: UserInputOutput.selectRecord();
					break;
				case 4: UserInputOutput.UpdateRecord();
					break;
				case 5: UserInputOutput.selectAllRecord();
					break;
				}
				System.out.println("");
			}
		}
		catch(Exception e) {
			System.out.println("Please make correct selection");
		}
		sc.close();
	}

}
