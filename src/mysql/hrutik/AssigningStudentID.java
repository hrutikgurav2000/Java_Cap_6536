package mysql.hrutik;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * Program on taking name from user and assigning sid from backend
 */
public class AssigningStudentID {
	static Connection con = null;
	static Statement stmt = null;
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name to add:");
		String sname = sc.nextLine().trim();
		
		try {
			con=MysqlGLobalConnection.createConnection();
			
			stmt=con.createStatement();
			String checkrecord = "select * from student_table order by sid desc limit 1"; // checking if user already exists
			ResultSet rs = stmt.executeQuery(checkrecord);
			if(rs.next()) {
				int sid1 = rs.getInt("sid") + 1;
				String exe ="Insert into student_table values("+sid1+",'"+sname+"')";
				int i = stmt.executeUpdate(exe);
				if(i>0) {
					System.out.println("Inserted success");
				}else {
					System.out.println("Insert fail");
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			stmt.close();
			con.close();
		}
	}	

}
