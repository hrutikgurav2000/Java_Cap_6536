package mysql.hrutik;
// Program on sql CRUD operations

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserInputOutput {
	static Scanner sc = new Scanner(System.in);
	static Connection con = null;
	static Statement stmt = null;
	
	public static void addRecord() throws SQLException {
		System.out.println("Enter Student name:");
		String sname = sc.nextLine();
		System.out.println("Enter Student id:");
		int sid = sc.nextInt();
		try {	
			con=MysqlGLobalConnection.createConnection();
			//System.out.println("Connected");
			stmt=con.createStatement();
			String checkrecord = "select sid from student_table where sid=" + sid; // checking if user already exists
			ResultSet rs = stmt.executeQuery(checkrecord); /*
			A ResultSet object maintains a cursor that points to the current row in the result set. The term "result set" refers to the row and column data contained in a ResultSet object
			*/
			
			if(!rs.next()) {
				String s ="Insert into student_table values("+sid+",'"+sname+"')";
				/*
				stmt.execute(s);
				*/
				int i = stmt.executeUpdate(s);
				if(i>0) {
					System.out.println("Inserted success");
				}else {
					System.out.println("Insert fail");
				}
			}else {
				System.out.println("record already exist with "+sid+" as id, Please give different sid.");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			//stmt.close();
			con.close();
			System.out.println("Closing");
		}
	}
	
	public static void UpdateRecord() throws SQLException {
		System.out.println("Enter Student id where user wants to update name:");
		int sid = sc.nextInt();
		System.out.println("Enter name:");
		String sname = sc.next().trim();
		try {
			
			con=MysqlGLobalConnection.createConnection();
			stmt=con.createStatement();
			String checkrecord = "select * from student_table where sid=" + sid; // checking if user already exists
			ResultSet rs = stmt.executeQuery(checkrecord); 
			if(rs.next()) {
				String s = "update student_table set sname = '"+sname+"' where sid =" + sid ;
				/*
				stmt.execute(s);
				*/
				int i = stmt.executeUpdate(s);
				if(i>0) {
					System.out.println("Update success");
				}else {
					System.out.println("Update fail");
				}
			}else {
				System.out.println("record is not present");
			}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			stmt.close();
			con.close();
			System.out.println("Closing");
		}
	}
	
	public static void deleteRecord() throws SQLException {
		System.out.println("Enter Student id which to be deleted from system.");
		int sid = sc.nextInt();
		
		try {
			
			con=MysqlGLobalConnection.createConnection();
			stmt=con.createStatement();
			
			String checkrecord = "select * from student_table where sid=" + sid; // checking if user already exists
			ResultSet rs = stmt.executeQuery(checkrecord); 
			if(rs.next()) {
				String sql = "DELETE FROM student_table " + "WHERE sid =" + sid;
				int i = stmt.executeUpdate(sql);
				if(i>0) {
					System.out.println("Delete success");
				}else {
					System.out.println("Delete fail");
				}
			}
			else {
				System.out.println("record is not present");
			}	
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			stmt.close();
			con.close();
			System.out.println("Closing");
		}
	}
	public static void selectRecord() throws SQLException {
		System.out.println("Enter Student id which to be fetched from system.");
		int sid = sc.nextInt();
		
		try {
			
			con=MysqlGLobalConnection.createConnection();
			stmt=con.createStatement();
			
			String checkrecord = "select * from student_table where sid=" + sid;
			ResultSet rs = stmt.executeQuery(checkrecord); 
			while(rs.next()) {
				System.out.print("Student ID: " + rs.getInt("sid"));
	            System.out.print(", Student name: " + rs.getString("sname"));
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			stmt.close();
			con.close();
			//System.out.println("Closing");
		}
	}
	
	public static void selectAllRecord() throws SQLException {
		try {	
			con=MysqlGLobalConnection.createConnection();
			//System.out.println("Connected");
			stmt=con.createStatement();
			String checkrecord = "select * from student_table";
			ResultSet rs = stmt.executeQuery(checkrecord); 
			System.out.println("ID" + "		Name");
			while(rs.next()) {
				System.out.print(rs.getInt("sid")+ "		"+rs.getString("sname"));
	            
	            System.out.println("");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			stmt.close();
			con.close();
		}
	}
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		//UserInputOutput.addRecord();
		//UserInputOutput.UpdateRecord();
		//UserInputOutput.deleteRecord();
		//UserInputOutput.selectRecord();
	}

}
