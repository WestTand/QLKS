/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quanlykhachsan.main;




import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.quanlykhachsan.view.ThongKe_GUI;
import com.quanlykhachsan.view.TrangChu_GUI;


import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

/**
 *
 * @author nguye
 */
public class Main {
       public static void main(String[] args) {
    	   try {
            // Cài đặt giao diện sáng (Light) của FlatLaf
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
           JFrame test = new TrangChu_GUI();
           test.setVisible(true);
           test.setExtendedState(test.MAXIMIZED_BOTH);
           
    }
         
         
         
}   
