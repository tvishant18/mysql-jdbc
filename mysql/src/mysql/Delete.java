package mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Delete {

	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String coonectionstr="jdbc:mysql://localhost/company";
		String Username="root";
		String Password="##############";
		 try {
			Class.forName(driver);
			Connection connection=DriverManager.getConnection(coonectionstr, Username, Password);
		    Statement statement= connection.createStatement();
		    StringBuffer query=new StringBuffer("delete from company.employeeinfo  where empid=106");
		 System.out.println(query.toString());
		 int execute=statement.executeUpdate(query.toString());
		 if (execute>0){
			 System.out.println("table entry is deleted");
		 }
		 } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
