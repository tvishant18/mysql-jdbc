package mysql;
import java.sql.Connection;
import java.sql.DriverManager;//class
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Preparestatement2 {

	public static void main(String[] args) {
	String driver="com.mysql.jdbc.Driver";
	String connec="jdbc:mysql://localhost/company";
	String username="root";
	String password="##############";
	try {
		Class.forName(driver);
		Connection connection=DriverManager.getConnection(connec,username ,password);
		PreparedStatement prepare=connection.prepareStatement("select * from company.employeeinfo where empid<? and age<?");
        prepare.setInt(1, 104);
        prepare.setInt(2, 20);
		ResultSet result=prepare.executeQuery();
		while(result.next()){
			System.out.print(+result.getInt("empid"));
			System.out.print("\t"+result.getString("name"));
			System.out.print("\t"+result.getString("lastname"));
			System.out.print("\t"+result.getInt("age"));
			System.out.println(" ");
		}
		
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	

	}

}
