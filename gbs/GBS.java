
package gbs;

import java.sql.*;

public class GBS {

    
    public static void main(String[] args) {
        try
        {
        
            
            
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root [root on Default schema]","root","root");
        
        
        con.close();
        }
        catch(Exception e)
        {
            
        }
    }

    static com.sun.jdi.connect.spi.Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
