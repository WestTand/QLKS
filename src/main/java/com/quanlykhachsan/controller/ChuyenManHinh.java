/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.quanlykhachsan.controller;

import com.quanlykhachsan.bean.DanhMucBean;
import com.quanlykhachsan.view.DatPhong_GUI;
import com.quanlykhachsan.view.DichVu_GUI;
import com.quanlykhachsan.view.LoaiPhong_GUI;
import com.quanlykhachsan.view.NhanVien_GUI;
import com.quanlykhachsan.view.ThietBi_GUI;
import com.quanlykhachsan.view.ThongKe_GUI;
import com.quanlykhachsan.view.TrangChu_GUI;
import com.quanlykhachsan.view.TrangChu_JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author nguye
 */
public class ChuyenManHinh { 
        private List<DanhMucBean> listItem = null;
        private JPanel jpRoot;
        private String kindSelected = "";
        public ChuyenManHinh(JPanel jpRoot) {
            this.jpRoot = jpRoot;
            
        }
        public void setView( JLabel jlbItem){
            kindSelected = "TrangChu";
            jlbItem.setForeground(Color.red);
            jpRoot.removeAll();
            jpRoot.setLayout(new BorderLayout());
            jpRoot.add(new DichVu_GUI());
            jpRoot.validate();
            jpRoot.repaint();
        }
        public void setEvent(List<DanhMucBean> listIteam){
            this.listItem  = listIteam;
             for (DanhMucBean item : listIteam) {
                item.getJlb().addMouseListener(new labelEvent(item.getKind() , item.getJlb()));
            }
             
        }
        class labelEvent implements MouseListener{
            private JPanel node;
            private String kind;
            private JLabel jlbItem;
            
            public labelEvent(String kind, JLabel jlbItem){
                this.kind = kind;
                this.jlbItem  = jlbItem;
                
            }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChu_JPanel();
                    break;
                case "ThongKe":
                    node  = new ThongKe_GUI();
                    break;
                default:
                    break;
            }
             jpRoot.removeAll();
            jpRoot.setLayout(new BorderLayout());
            jpRoot.add(node);
            jpRoot.validate();
            jpRoot.repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jlbItem.setForeground(Color.red);
           
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        @Override
        public void mouseEntered(MouseEvent e) {
             jlbItem.setForeground(Color.red);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if(!kindSelected.equalsIgnoreCase(kind)){
                jlbItem.setForeground(new Color(20,70,97));
            }
            
        }
            
        }
        private void setChangeColor(String kind){
            for (DanhMucBean item : listItem) {
                if(item.getKind().equalsIgnoreCase(kind)){
                    item.getJlb().setForeground(Color.red);
                }else
                     item.getJlb().setForeground(new Color(20,70,97));
                    
            }
        }
}
