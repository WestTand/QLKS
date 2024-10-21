package com.quanlykhachsan.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

import java.awt.Font;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class Voucher_GUI extends JPanel {
	private JTextField txtMaKM;
	private JDateChooser dateHetHan;
	private JDateChooser dateBatDau;
	private DefaultTableModel modalVoucher;
	private JTable tableVoucher;
	private JTextField textField;
	private JTextField textField_1;
	private JSpinner timeSpinnerKT;
	private JSpinner timeSpinnerBD;
	public Voucher_GUI() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 10, 375, 505);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Khuyến Mãi:");
		lblNewLabel_1.setBounds(10, 56, 73, 26);
		panel_1.add(lblNewLabel_1);
		
		txtMaKM = new JTextField();
		txtMaKM.setBounds(93, 52, 169, 37);
		txtMaKM.setEnabled(false);
		txtMaKM.setEditable(false);
		panel_1.add(txtMaKM);
		txtMaKM.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tên Khuyến Mãi:");
		lblNewLabel_2.setBounds(10, 107, 77, 27);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phần Trăm");
		lblNewLabel_3.setBounds(10, 174, 73, 27);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ngày Bắt Đầu:");
		lblNewLabel_4.setBounds(10, 314, 66, 27);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Ngày Kết Thúc:");
		lblNewLabel_4_1.setBounds(10, 247, 70, 27);
		panel_1.add(lblNewLabel_4_1);
		
		dateHetHan = new JDateChooser();
		dateHetHan.setBounds(93, 237, 120, 37);
		dateHetHan.setDateFormatString("dd-MM-yyyy");
		dateHetHan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		dateBatDau = new JDateChooser();
		dateBatDau.setBounds(93, 304, 120, 37);
		dateBatDau.setDateFormatString("dd-MM-yyyy");
		dateBatDau.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		panel_1.add(dateHetHan);
		panel_1.add(dateBatDau);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(3, 0, 372, 46);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin Khuyến Mãi");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setBounds(0, 0, 371, 46);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(93, 111, 172, 35);
		panel_1.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(90, 170, 172, 35);
		panel_1.add(textField_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(3, 351, 372, 46);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblChcNng = new JLabel("Chức năng");
		lblChcNng.setHorizontalAlignment(SwingConstants.CENTER);
		lblChcNng.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblChcNng.setBounds(0, 0, 370, 46);
		panel_3.add(lblChcNng);
		
		JButton btnThem = new JButton("Thêm(F7)");
		btnThem.setBounds(13, 407, 100, 37);
		panel_1.add(btnThem);
		
		JButton btnXoaTrang = new JButton("Xóa Trắng(F6)");
		btnXoaTrang.setBounds(10, 458, 100, 37);
		panel_1.add(btnXoaTrang);
		
		JButton btnCapNhat = new JButton("Cập Nhật (F6)");
		btnCapNhat.setBounds(164, 407, 100, 37);
		panel_1.add(btnCapNhat);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(162, 458, 100, 37);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(395, 10, 445, 505);
		add(panel_2);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 442, 505);
		panel_2.add(scrollPane);
		
		String header[]= new String[] {"Mã Khuyến Mãi","Tên Khuyến Mãi","Ngày Bắt Đầu","Ngày Kết Thúc"};
		modalVoucher = new DefaultTableModel(header,0);
		tableVoucher = new JTable(modalVoucher);
		scrollPane.setViewportView(tableVoucher);
		
		timeSpinnerKT = new JSpinner();
		timeSpinnerKT.setFont(new Font("Tahoma", Font.PLAIN, 17));
		timeSpinnerKT.setBounds(223, 239, 120, 37);
		timeSpinnerKT.setModel(new SpinnerDateModel(new Date(1704042000490L), null, null, Calendar.HOUR_OF_DAY));
		JSpinner.DateEditor timeEditor1 = new JSpinner.DateEditor(timeSpinnerKT, "HH:mm:ss");
		timeSpinnerKT.setEditor(timeEditor1);
		panel_1.add(timeSpinnerKT);
		
		timeSpinnerBD = new JSpinner();
		timeSpinnerBD.setFont(new Font("Tahoma", Font.PLAIN, 17));
		timeSpinnerBD.setBounds(223, 306, 120, 37);	
		timeSpinnerBD.setModel(new SpinnerDateModel(new Date(1704128400000L), null, null, Calendar.HOUR_OF_DAY));
		JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(timeSpinnerBD, "HH:mm:ss");
		timeSpinnerBD.setEditor(timeEditor);
		panel_1.add(timeSpinnerBD);
	}
}
