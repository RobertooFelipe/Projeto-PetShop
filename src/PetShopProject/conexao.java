/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetShopProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author magod
 */
public class conexao {
     public static Connection con = null;
 
       public static void Conectar() {
       System.out.println("Conectando ao banco...");
       try {
       Class.forName("com.mysql.jdbc.Driver");
       con =  DriverManager.getConnection("jdbc:mysql://jrconsultoria.com/jrconsul_anch_g2","jrconsul_anch_g2","@1b2c3d4");
       System.out.println("Conectado.");
       } catch (ClassNotFoundException ex) {
    System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");
    //Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
    } catch(SQLException e) {
    System.out.println(e);
    throw new RuntimeException(e);
    }
   }
}
