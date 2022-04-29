package hrutik.icici.bank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Formatter;
//import java.util.Scanner;
import java.util.Scanner;
import java.util.regex.*;

//import com.mysql.cj.protocol.Resultset;  


public class TransactionMethods {
	static Connection con = null;
	static Statement stmt = null;
	static PreparedStatement pre_stmt=null;
	static PreparedStatement pre_stmt_update_bal=null; 
	static InputStreamReader r=new InputStreamReader(System.in);  
	static BufferedReader br=new BufferedReader(r);  
	

	
	public static void showBalance(int loginId) throws SQLException {
		try {
			
			con=UniversalConnection.createConnection();
			stmt=con.createStatement();
			String checkrecord = "select * from ICICI_Bank where loginId=" + loginId;
			ResultSet rs = stmt.executeQuery(checkrecord); 
			if(rs.next()) {
				System.out.println("Your Account Balance is Rs :"+rs.getInt(3)+".00");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			stmt.close();
			con.close();
			//System.out.println("Closing");
			exitButton();
		}
	}
	
	
	public static void withDraw(int loginId) throws SQLException {
		try {
			int userBal=0;
			String tranType = "Debit";
			con=UniversalConnection.createConnection();
			String getbal = "Select * from ICICI_Bank where loginId = ?";
			pre_stmt = con.prepareStatement(getbal);
			pre_stmt.setInt(1, loginId);
			ResultSet rs = pre_stmt.executeQuery();
			
			
			
			if(rs.next()) {
				
				userBal= rs.getInt(3);
				//System.out.println(userBal);;
				
				if(userBal > 1000) {
					System.out.println("Enter the amount to be withdraw:");
					int withDrawAmount = Integer.parseInt(br.readLine());
					//System.out.println(withDrawAmount);
					
					if(withDrawAmount < userBal) {
						
						userBal = userBal - withDrawAmount;
						String updateQuery = "update ICICI_Bank set userBalance=? where loginId=?";
						pre_stmt_update_bal = con.prepareStatement(updateQuery);
						
						pre_stmt_update_bal.setInt(1, userBal);
						pre_stmt_update_bal.setInt(2, loginId);
						//pre_stmt = con.prepareStatement(updateQuery);
						int rowAffected = pre_stmt_update_bal.executeUpdate();
						if(rowAffected>0) {
							System.out.println("Withdraw Successful");
							System.out.println("Your account balance is Rs :"+userBal+".00");
							String addTransaction = "insert into ICICI_transaction(transactAmount,tranType,loginID,dateTimeStamp) values(?,?,?,CURRENT_TIMESTAMP)";
							pre_stmt_update_bal = con.prepareStatement(addTransaction);
							
							pre_stmt_update_bal.setInt(1, withDrawAmount);
							pre_stmt_update_bal.setString(2, tranType);
							pre_stmt_update_bal.setInt(3, loginId);
							pre_stmt_update_bal.execute();
						}else {
							System.out.println("Withdrawal failed, Please try again.");
						}
						pre_stmt_update_bal.close();
					}else {
						System.out.println("Insufficient Balance");
					}
					
				}else {
					System.out.println("Insufficient Balance");
				}
				
			}
			//pre_stmt.close();
			
		}catch(Exception e) {
			//System.out.println(e.getMessage());
		}finally {
			pre_stmt.close();
			//pre_stmt_update_bal.close();
			con.close();
			exitButton();
		}
	}
	
	public static void dePosit(int loginId) throws SQLException {
		try {
			int userBal=0;
			String tranType = "Credit";
			con=UniversalConnection.createConnection();
			String getbal = "Select * from ICICI_Bank where loginId = ?";
			pre_stmt = con.prepareStatement(getbal);
			pre_stmt.setInt(1, loginId);
			ResultSet rs = pre_stmt.executeQuery();
			
			
			
			if(rs.next()) {
				
				userBal= rs.getInt(3);
				//System.out.println(userBal);;
				
				if(userBal > 1000) {
					System.out.println("Enter the amount to be deposit:");
					int depositAmount = Integer.parseInt(br.readLine());
					//System.out.println(withDrawAmount);
					
					
						
						userBal = userBal + depositAmount;
						String updateQuery = "update ICICI_Bank set userBalance=? where loginId=?";
						pre_stmt_update_bal = con.prepareStatement(updateQuery);
						
						pre_stmt_update_bal.setInt(1, userBal);
						pre_stmt_update_bal.setInt(2, loginId);
						//pre_stmt = con.prepareStatement(updateQuery);
						int rowAffected = pre_stmt_update_bal.executeUpdate();
						if(rowAffected>0) {
							System.out.println("Deposit Successful");
							System.out.println("Your account balance is Rs.:"+userBal+".00");
							String addTransaction = "insert into ICICI_transaction(transactAmount,tranType,loginID,dateTimeStamp) values(?,?,?,CURRENT_TIMESTAMP)";
							pre_stmt_update_bal = con.prepareStatement(addTransaction);
							
							pre_stmt_update_bal.setInt(1, depositAmount);
							pre_stmt_update_bal.setString(2, tranType);
							pre_stmt_update_bal.setInt(3, loginId);
							pre_stmt_update_bal.execute();
							
						}else {
							System.out.println("Deposit failed, Please try again.");
						}
						pre_stmt_update_bal.close();
					}
				
				
			}
			//pre_stmt.close();
			
		}catch(Exception e) {
			//System.out.println(e.getMessage());
		}finally {
			pre_stmt.close();
			//pre_stmt_update_bal.close();
			con.close();
			exitButton();
		}
	}
	
	
	public static void changeMobileNumber(int loginId) throws SQLException {
		Scanner sc = new Scanner(System.in);
		try {
			Pattern ptrn = Pattern.compile("(0/91)?[7-9][0-9]{9}");  
			  
			System.out.println("Please enter your mobile number:");
			//long mobileNo = Long.parseLong(br.readLine());
			long mobileNo = sc.nextLong();
			String SmobileNo = Long.toString(mobileNo);
			System.out.println("Please confirm your mobile number:");
			//long checkMobileNo = Long.parseLong(br.readLine());
			long checkMobileNo = sc.nextLong();
			//String checkMobileNo = br.readLine().trim();
			Matcher match = ptrn.matcher(SmobileNo);
			
			if(match.find() && match.group().equals(SmobileNo)) { // check number of digit
				
				if(mobileNo == checkMobileNo  ) {
					con=UniversalConnection.createConnection();
					String getUser = "Select * from ICICI_Bank where loginId = ?";
					pre_stmt = con.prepareStatement(getUser);
					pre_stmt.setInt(1, loginId);
					ResultSet rs = pre_stmt.executeQuery();
					
					
					if(rs.next()) {
						String updateQuery = "update ICICI_Bank set mobileNumber=? where loginId=?";
						pre_stmt_update_bal = con.prepareStatement(updateQuery);
						
						pre_stmt_update_bal.setString(1, SmobileNo);
						pre_stmt_update_bal.setInt(2, loginId);
						int rowAffected = pre_stmt_update_bal.executeUpdate();
						if(rowAffected>0) {
							System.out.println("Mobile number changes successfully");
							
						}else {
							System.out.println("something went wrong, Please try again.");
						}
						pre_stmt_update_bal.close();
					}
					sc.close();
					rs.close();
					pre_stmt.close();
					//con.close();
					
				}else {
	
					System.out.println("Mobile number do not match, please try again");	
				}
			}else {
				System.out.println("Please Enter 10 digit  mobile number");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//pre_stmt_update_bal.close();
			//con.close();
			exitButton();
		}
	}
	
	public static void accountStatement(int loginId) throws SQLException {
		try {
			
			con=UniversalConnection.createConnection();
			String s="select * from ICICI_transaction where loginID=? order by dateTimeStamp limit 5";
			pre_stmt=con.prepareStatement(s);
			pre_stmt.setInt(1, loginId);
			
			ResultSet rs = pre_stmt.executeQuery();
			 //System.out.println("id\t\tname\t\temail");
			//System.out.println("transactAmount\t\ttranType\t\tloginId\t\tdateTimeStamp");
			//Formatter fmt = new Formatter();  
			System.out.printf("%15s %15s %15s %15s\n", "transactAmount", "tranType", "loginId","dateTimeStamp");  
			//System.out.println("\n");
			while((rs.next())) {
				int transactAmount = rs.getInt("transactAmount");
				String tranType = rs.getString("tranType");
				int lId =  rs.getInt("loginId") ;
				Date date = rs.getDate("dateTimeStamp");
				System.out.format("%15s %15s %15s %15s\n",transactAmount, tranType , lId , date);
				System.out.println("");
				
				//System.out.println("Inside rs.next");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//pre_stmt_update_bal.close();
			//con.close();
			exitButton();
		}
	} 
	
	public static void lastThreeMonth(int loginId) throws SQLException {
		try {
			con=UniversalConnection.createConnection();
			String s="SELECT * FROM   ICICI_transaction WHERE  loginId = ? and dateTimeStamp > (NOW() - INTERVAL 3 MONTH) limit 10";
			pre_stmt=con.prepareStatement(s);
			pre_stmt.setInt(1, loginId);
			
			ResultSet rs = pre_stmt.executeQuery();
			System.out.printf("%15s %15s %15s %15s\n", "transactAmount", "tranType", "loginId","dateTimeStamp");  
			//System.out.println("\n");
			while((rs.next())) {
				int transactAmount = rs.getInt("transactAmount");
				String tranType = rs.getString("tranType");
				int lId =  rs.getInt("loginId") ;
				Date date = rs.getDate("dateTimeStamp");
				System.out.format("%15s %15s %15s %15s\n",transactAmount, tranType , lId , date);
				System.out.println("");
				
				//System.out.println("Inside rs.next");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			//pre_stmt_update_bal.close();
			//con.close();
			exitButton();
		}
	}
	
	
	public static void exitButton() {
		System.out.println("Thank you for Banking with us. Have a Nice Day!!");
		System.exit(0);
	}
	
}
