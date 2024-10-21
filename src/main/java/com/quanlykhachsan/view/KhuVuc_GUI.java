package com.quanlykhachsan.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import javax.swing.JButton;

public class KhuVuc_GUI extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private TableModel modelKhuVuc;
	private Component tableKhuVuc;

	/**
	 * Create the panel.
	 */
	public KhuVuc_GUI() {
		setLayout(null);
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 10, 387, 515);
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(0, 10, 387, 42);
		panel_2.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin khu vực");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 367, 42);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Khu Vực:");
		lblNewLabel_1.setFont(new Font("Times New Roman", lblNewLabel_1.getFont().getStyle() | Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 62, 100, 30);
		panel_2.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setEditable(false);
		textField.setBounds(172, 60, 115, 35);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tên Khu Vực:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(10, 128, 100, 30);
		panel_2.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(172, 126, 115, 35);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(172, 203, 115, 60);
		panel_2.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mô Tả:");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", lblNewLabel_1_1_1.getFont().getStyle() | Font.BOLD, 12));
		lblNewLabel_1_1_1.setBounds(10, 226, 100, 30);
		panel_2.add(lblNewLabel_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 276, 387, 42);
		panel_2.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Chức năng");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setBounds(0, 0, 387, 42);
		panel_1.add(lblNewLabel_2);
		
		JButton btnThem = new JButton("Thêm(F7)");
		btnThem.setBounds(10, 328, 130, 40);
		panel_2.add(btnThem);
		
		JButton btnXoaTrang = new JButton("Xóa Trắng (F5)");
		btnXoaTrang.setToolTipText("");
		btnXoaTrang.setBounds(172, 328, 130, 40);
		panel_2.add(btnXoaTrang);
		
		JButton btnCapNhat = new JButton("Cập Nhật(F6)");
		btnCapNhat.setBounds(172, 407, 130, 40);
		panel_2.add(btnCapNhat);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(407, 10, 433, 515);
		add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 433, 515);
		panel_3.add(scrollPane);
		
		String headCollum[] = new String[] {"Tên Khu Vực","Mô Tả"};
		modelKhuVuc = new DefaultTableModel(headCollum,0);
		tableKhuVuc = new JTable(modelKhuVuc);
		scrollPane.setViewportView(tableKhuVuc);
	}
}
