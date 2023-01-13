/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.controller;

import com.view.Login_View;
import java.sql.SQLException;

/**
 *
 * @author USER
 */
public interface controller_Login {
    public void login(Login_View Lv) throws SQLException;
    public void create(Login_View Lv) throws SQLException;
}
