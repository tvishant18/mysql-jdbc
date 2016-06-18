package mysql;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class Insertion {

	public static void main(String[] args) {
     String drivername="com.mysql.jdbc.Driver"; // include driver jar file
     String connectionstring="jdbc:mysql://localhost/company";
     String Username="root";
	 String Password="##############";
		
     try {
		Class.forName(drivername); //allocated memory for driver 
	    Connection connection=DriverManager.getConnection(connectionstring, Username, Password);
	    Statement statement=connection.createStatement();
	    StringBuffer query= new StringBuffer("insert into company.employeeinfo(empid,name,lastname,age,sex)values");
	    query.append("(");
	    query.append("107,");
	    query.append("'SHIVAM',");
	    query.append("'MITTAL',");
	    query.append("20,");
	    query.append("'male'");
	    query.append(")");
        System.out.println(query.toString());
	    int execute= statement.executeUpdate(query.toString());
        if(execute>0){
        	System.out.println("new entry is added");
        }
     }catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
