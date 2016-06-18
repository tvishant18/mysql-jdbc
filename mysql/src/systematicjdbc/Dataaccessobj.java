package systematicjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class Dataaccessobj {
public List<Employeeinfo> getdata(){
	ResultSet result=null;
	PreparedStatement prepare=null;
	Connection connection=null;
	List<Employeeinfo> emplist=null;
	try {
		Class.forName(Constants1.DRIVER_NAME);
		connection=DriverManager.getConnection(Constants1.CONNECTION_STRING, Constants1.DB_USEERNAME, Constants1.DB_PASSWORD);
        prepare=connection.prepareStatement("select * from company.employeeinfo");
        result=prepare.executeQuery();	    
	    emplist=new ArrayList<Employeeinfo>();
	    while(result.next()){
	    	Employeeinfo emp=new Employeeinfo(result.getInt("empid"),result.getString("name"),result.getString("lastname"),result.getInt("age"),result.getString("sex"));
	        emplist.add(emp);
	    }
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}finally{
	if(result !=null){
	 try {
		result.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	if(prepare !=null){
		try {
			prepare.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	if(connection !=null){
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
return emplist;
}

}
