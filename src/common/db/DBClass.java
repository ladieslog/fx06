package common.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBClass {
	public static Connection conn;
	public DBClass() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle1185");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
