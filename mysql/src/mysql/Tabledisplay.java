package mysql;
import java.sql.Connection;     //interface
import java.sql.DriverManager;  // interface
import java.sql.ResultSet;
import java.sql.SQLException;   // interface
import java.sql.Statement;      // class 
public class Tabledisplay {

	public static void main(String[] args) {
		String drivername="com.mysql.jdbc.Driver";
		String connectionstring="jdbc:mysql://localhost/company";
		String Username="root";
		String Password="##############";
		
		try {
			Class.forName(drivername);	
			Connection connection=DriverManager.getConnection(connectionstring, Username, Password);
		    Statement statement=connection.createStatement();
		    ResultSet result=statement.executeQuery("select * from company.employeeinfo");
			while(result.next()){
				System.out.print(result.getInt(1)+"\t");
				System.out.print(result.getString(2)+"\t");
				System.out.print(result.getString(3)+"\t");
				System.out.println(result.getInt(4));
			}
			
		}  catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
