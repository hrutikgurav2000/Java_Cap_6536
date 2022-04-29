package hrutik.icici.bank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;
import java.util.Scanner;

//import com.mysql.cj.protocol.Resultset;



public class UserInterface {
	static Connection con = null;
	static PreparedStatement stmt=null;
	static ResultSet rs=null;
	
	public static void main(String[] args) throws SQLException, IOException {
		Scanner sc = new Scanner(System.in);
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r);  

		int makeSelection;
		// TODO Auto-generated method stub
		try{
			
			System.out.println("___Welcome to ICICI Bank ATM___");
			System.out.println("Please enter your login id:");
			int loginId =  sc.nextInt();
			System.out.println("Please enter your password:");
			String loginPass = br.readLine().trim();
			try {
				con=UniversalConnection.createConnection();
				String s="select * from ICICI_Bank where loginId=? and loginPass =?";
				stmt=con.prepareStatement(s);
				stmt.setInt(1, loginId);
				stmt.setString(2, loginPass);
				rs = stmt.executeQuery(); 
				/*
				if((rs.next())) {
					System.out.print("loggin ID: " + rs.getInt("loginId"));
		            System.out.print(", Balance: " + rs.getString("loginPass"));
				}*/
				
				if((rs.next())) {
					try {
						System.out.println("Please select below options");
						System.out.println("1. To show balance");
						System.out.println("2. Withdraw Amount");
						System.out.println("3. Deposit Amount");
						System.out.println("4. Update Mobile Number");
						System.out.println("5. Last 5 Transactions.");
						System.out.println("6. Transaction for last 3 Months.");
						System.out.println("7. Exit");
						makeSelection = sc.nextInt();
						
						switch(makeSelection) {
							case 1: TransactionMethods.showBalance(loginId);
								break;
							case 2: TransactionMethods.withDraw(loginId);
								break;
							case 3: TransactionMethods.dePosit(loginId);
								break;
							case 4: TransactionMethods.changeMobileNumber(loginId);
								break;
							case 5: TransactionMethods.accountStatement(loginId);
								break;
							case 6:	TransactionMethods.lastThreeMonth(loginId);
								break;
							case 7: TransactionMethods.exitButton();
							break;
						}
					}catch(Exception e) {
						System.out.println("something went wrong, Please try again.");
						e.printStackTrace();
					}
				}else {
					System.out.println("Incorrect Username or password.");
				}
				
				
				
			}catch(Exception e) {
				System.out.println("Please enter Correct login Id and Password in Correct format.");
				
		}
			finally {
				rs.close();
				stmt.close();
				con.close();
			}
		
	
		}finally {
			sc.close();
			rs.close();
			stmt.close();
			con.close();
		}
	}	

}
