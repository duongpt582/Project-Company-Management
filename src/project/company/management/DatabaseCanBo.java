
package project.company.management;

import java.sql.*;
import java.sql.SQLException;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class DatabaseCanBo {
    
    public static Connection con;

    
    public static void main(String[] args) {
        DatabaseCanBo db = new DatabaseCanBo();
        db.createConnect();
    }
    
    public void createConnect() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
                System.out.println("Database Connection Success");
                
                Statement statement = con.createStatement();
                ResultSet rs = statement.executeQuery("SELECT * FROM can_bo");

                while (rs.next()) {
                    String name = rs.getString("ho_ten");
                    System.out.println(name);
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseCanBo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     *  using Statement
     */
    public void insertData1() {
        try {
            String name = "Tu Ngoc Duc";
            Statement statement = con.createStatement();
            String dbInsert = "INSERT INTO `can_bo`( `ho_ten`, `ngay_sinh`, `dia_chi`, `chuc_vu`, `ma_can_bo`, `so_ngay_lam_viec`) VALUES ('" + name +"','2002-05-08','Ha Noi','xxxx','xxxxx','5')";
            statement.execute(dbInsert);
            System.out.println("Insertion Complete!");
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /**
     *  using Prepared Statements
     */
    public void insertData2() {
        try {
            String name = "Tu Ngoc Duc";
            PreparedStatement preparedStatement = con.prepareStatement("INSERT INTO `can_bo`(?)");
            preparedStatement.setString(1, name);
            preparedStatement.execute();
            preparedStatement.close();
            System.out.println("Insertion Complete!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
}
