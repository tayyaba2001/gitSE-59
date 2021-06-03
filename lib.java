/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Student
 */


import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class lib {

 // creating the connection
public static Connection  ConnecrDb(){
try                        //surrounding the method with try{}catch(){}
        {
    //Class.forName();
       Connection   con1 = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-MOVGJE4:1522:orcl","system","Oracle_1");//method use to establish connection, 1521 is the default port , sys as sysdba is the username and Penta123 is the password of your database  
return con1;        
}
        catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);}
return null;

    }
    

}

