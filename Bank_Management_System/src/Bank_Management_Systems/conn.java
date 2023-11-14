package Bank_Management_Systems;

import java.sql.*;

public class conn {
    /*1.Register the driver
    * 2.Create connection
    * 3.Create statement
    * 4.Execute query
    * 5.Clone connection
    * */

    Connection c;
    Statement s;

    public conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","pass123");
            s = c.createStatement();
        }catch (Exception exp){
            System.out.println();
        }
    }
}
