// package package1;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {

            c = DriverManager.getConnection("jdbc:mysql:///hotel_management_System","root","#88Deepu");
            s = c.createStatement();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

}
