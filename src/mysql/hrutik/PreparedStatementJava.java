package mysql.hrutik;

import java.sql.Connection;
import java.sql.SQLException;

import java.util.Scanner;
import java.sql.PreparedStatement;

public class PreparedStatementJava {
	static Connection con = null;
	//static Statement stmt = 
	static PreparedStatement stmt=null;
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name to add:");
		String sname = sc.nextLine().trim();
		
		System.out.println("Enter student id:");
		int sid = sc.nextInt();
		try {
			con=MysqlGLobalConnection.createConnection();
			String s="insert into student_table values(?,?)";
			stmt=con.prepareStatement(s);
			stmt.setInt(1,sid);//1 specifies the first parameter in the query  
			stmt.setString(2, sname);  
			int i = stmt.executeUpdate();
			if(i>0)
				System.out.println("Data inserted successfully");
			else
				System.out.println("Not inserted");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			stmt.close();
			con.close();
		}
		
	}
	

}
