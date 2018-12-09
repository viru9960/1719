package DB;

import java.sql.*;
import org.mariadb.jdbc.Driver;

public class MainAPP {
    static final String DB_LINK = "jdbc:mariadb://localhost/labwork";
    public static void main (String[] args) throws Exception{
    	Connection con = null;
    	try {
    		new Driver();
    		con = DriverManager.getConnection(DB_LINK, "root", "virus");
            Statement smt = con.createStatement();
            String SampleQuery = "Select * from student";
            ResultSet results = smt.executeQuery(SampleQuery);
            while(results.next()) {
            System.out.println("--->" +  results.getNString("NAME")
               + " |  " + results.getString(2));
            }
            
    	}catch(Exception e) {
    		e.printStackTrace();
    	}finally {
            con.close();
    	}
    }
    }

