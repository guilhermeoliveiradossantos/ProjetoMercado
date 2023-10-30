/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetomercado.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author gsantos
 */
public class Conexao {
   private static final String URL = "jdbc:mysql://localhost:3308/mercado";
   private static final String USER = "root";
   private static final String PASSWORD = "";
   
   public static Connection createConnectionMysql() throws Exception{
       Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
       return connection;
   }
   
    public static void main(String[] args) throws Exception {
        Connection connection = createConnectionMysql();
        
        if(connection != null){
            JOptionPane.showMessageDialog(null, "conexao obtida com susseso");
            connection.close();
        }
        
        
    }
}
