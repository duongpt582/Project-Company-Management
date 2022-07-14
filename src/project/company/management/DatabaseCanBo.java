
package project.company.management;

import java.sql.*;
import java.sql.SQLException;
import java.util.jar.Attributes;
import java.util.logging.*;

import javax.swing.table.DefaultTableModel;

import javax.swing.Action;
import javax.swing.JOptionPane;


public class DatabaseCanBo {
    
    public static Connection con;

    private Statement statement;
    DefaultTableModel model;

    Statement statement;


    
    public static void main(String[] args) throws SQLException {
        DatabaseCanBo db = new DatabaseCanBo();
        db.createConnect();

        db.insertData1();

//        db.insertData1("2020", "duong", "nam","hanoi", "nhan vien", "0", "0");

    }
    
    
    public void createConnect() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            try {
                
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_company", "root", "");
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
//    String Id,String name, String gender , String address , String chuc_Vu , int day, double salary
    public void insertData1(String Id,String name, String gender , String address , String chuc_Vu , String day, String salary) {
        try {

            String name = "Tu Ngoc Duc";
            String dateString;
            statement = con.createStatement();
            String dbInsert = "INSERT INTO `can_bo`( `ho_ten`, `ngay_sinh`, `dia_chi`, `chuc_vu`, `ma_can_bo`, `so_ngay_lam_viec`) VALUES ('" + name +"','2002-05-08','Ha Noi','xxxx','xxxxx','5')";

//            String name = "Tu Ngoc Duc";
             statement = con.createStatement();
            
                 String dbInsert = "INSERT INTO `can_bo`(`ID`, `ho_ten`, `ngay_sinh`, `Gioi_tinh`, `dia_chi`, `chuc_vu`, `so_ngay_lam_viec`, `Luong`)"
                    + "VALUES ('" + Id + "','" + name +"','" + gender +"','" + address +"','" + chuc_Vu +"','"+ day +"','" + salary +"')";
//String dbInsert = "INSERT INTO `can_bo`(`ID`, `ho_ten`, `ngay_sinh`, `Gioi_tinh`, `dia_chi`, `chuc_vu`, `so_ngay_lam_viec`, `Luong`) 
//VALUES ('2002', 'duong','10','nam','HN','Db',19,19)";

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
