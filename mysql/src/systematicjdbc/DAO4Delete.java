package systematicjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAO4Delete {
	public void getdata(){
		PreparedStatement prepare=null;
		Connection connection=null;
		try {
			Class.forName(Constants1.DRIVER_NAME);
			connection=DriverManager.getConnection(Constants1.CONNECTION_STRING, Constants1.DB_USEERNAME, Constants1.DB_PASSWORD);
		    //StringBuffer sql=new StringBuffer("insert into company.Employeeinfo(empid,name,lastname,age,sex)values(106,'VISHANT','THakur',20,'male')");
		    //prepare=connection.prepareStatement(sql.toString());
		    //int execute=prepare.executeUpdate(sql.toString());
	    	prepare=connection.prepareStatement("delete from company.Employeeinfo where empid=?");
		    
		    prepare.setInt(1,108);
		    int execute=prepare.executeUpdate();
		    
	    	if(execute>0){
		    	System.out.println("record is deleted");
		    }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			if(prepare !=null){
				try {
					prepare.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(connection !=null){
					try {
						connection.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
			}
		}

	}

}
