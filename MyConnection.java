package mypack;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/miniproject?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "Ganesh@1351"
            );
        }
        catch (Exception ex) {
            System.out.println("Connection Error: " + ex);
        }

        return con;
    }
}
