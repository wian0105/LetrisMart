/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.koneksi;

import java.sql.*;

/**
 *
 * @author USER
 */
public class koneksi {
    private static Connection con;
    public static Connection getcon(){
        if(con == null){
            try {
                String url = "jdbc:mysql://localhost/db_letris_mart";
                String username = "root";
                String password = "";
                DriverManager.getConnection(url,username, password);
                con = DriverManager.getConnection(url,username,password);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return con;
    }
}
