
package project.company.management;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.*;

public class Database {
    
    public static void main(String[] args) {
        Database db = new Database();
        db.createConnect();
    }
    
    public void createConnect() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sinhvien", "root", "");
                System.out.println("Database Connection Success");
                
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM student");

                while (rs.next()) {
                    String name = rs.getString("hoten");
                    System.out.println(name);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
