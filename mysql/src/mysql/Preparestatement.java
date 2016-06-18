package mysql;
import java.sql.Connection;
import java.sql.DriverManager;//class
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Preparestatement {

	public static void main(String[] args) {
	String driver="com.mysql.jdbc.Driver";
	String connec="jdbc:mysql://localhost/company";
	String username="root";
	String password="##############";
	try {
		Class.forName(driver);
		Connection connection=DriverManager.getConnection(connec,username ,password);
		PreparedStatement prepare=connection.prepareStatement("select * from company.employeeinfo where empid=?");
	
		prepare.setInt(1,new Integer(101));

		ResultSet result=prepare.executeQuery();
		while(result.next()){
			System.out.print("empid"+result.getInt("empid"));
			System.out.print("name"+result.getString("name"));
			System.out.print("name"+result.getString("lastname"));
			System.out.print("name"+result.getInt("age"));
			System.out.println(" ");
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	

	}

}
