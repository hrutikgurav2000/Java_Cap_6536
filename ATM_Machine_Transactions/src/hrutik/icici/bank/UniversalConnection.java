package hrutik.icici.bank;

import java.sql.Connection;
import java.sql.DriverManager;

public class UniversalConnection {

	
		// TODO Auto-generated method stub
		private static final String db_driver = "com.mysql.cj.jdbc.Driver";
		private static final String URL = "jdbc:mysql://localhost:3306/my_sql_database";
		private static final String un = "root";
		private static final String pa = "root";
		public static Connection createConnection() {
			Connection con = null;
			try {
				Class.forName(db_driver);
				con = DriverManager.getConnection(URL,un,pa);
				if(con != null) {
					//System.out.println("Connected");
				}else {
					//System.out.println("Connection FAiled");
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
			return con;
	}

}
