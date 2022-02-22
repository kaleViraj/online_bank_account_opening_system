

import java.sql.*;

/**
 *
 * @author Tom Marvolo Riddle
 */
public class connection {
   
     connection ()
     {
        
        try
        {
            String url = "jdbc:mysql://localhost:3306/viraj_07?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String uname =  "root";
            String pass = "";
//            String Query = "INSERT INTO `mm_drugs` (`Name`, `Type`, `Price`, `Expiry day's`, `Company`, `Shelf No.`, `Quantity`) VALUES ('dagaji', 'dagaji', '40', '40', 'dagaji', '20', '30')";
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Trying to connect ....");
            Connection con = DriverManager.getConnection(url , uname , pass);   
            System.out.println("Connection Established Successfull and the DATABASE NAME IS:"+ con.getMetaData().getURL());
            Statement st = con.createStatement();
//            st.execute(Query);
            
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace(System.out);
        }
        
        
    }
      public static void main(String args[])
    {
        new connection ();
}
}




//