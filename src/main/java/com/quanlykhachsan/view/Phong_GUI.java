package com.quanlykhachsan.view;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class Phong_GUI extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private DefaultTableModel modelPhong;
	private JTable tablePhong;

	/**
	 * Create the panel.
	 */
	public Phong_GUI() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(446, 10, 393, 534);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(0, 0, 393, 32);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông Tin Phòng");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 393, 32);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(10, 39, 373, 261);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(10, 10, 70, 25);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(10, 66, 70, 25);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(10, 119, 70, 25);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(10, 169, 70, 25);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("New label");
		lblNewLabel_2_2.setBounds(10, 214, 70, 25);
		panel_3.add(lblNewLabel_2_2);
		
		textField = new JTextField();
		textField.setBounds(90, 9, 181, 27);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(90, 69, 181, 27);
		panel_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(90, 122, 181, 27);
		panel_3.add(textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(90, 171, 181, 27);
		panel_3.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(90, 216, 181, 27);
		panel_3.add(comboBox_1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(0, 310, 393, 32);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Chức năng");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 0, 393, 32);
		panel_4.add(lblNewLabel_4);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(10, 362, 118, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(10, 435, 118, 35);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.setBounds(199, 435, 118, 35);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.setBounds(199, 362, 118, 35);
		panel.add(btnNewButton_1_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 10, 426, 551);
		add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 5, 416, 536);
		panel_1.add(scrollPane);
		
		String headCollum[] = new String[] {"Số Phòng","Tầng","Trạng Thái Phòng"};
		modelPhong = new DefaultTableModel(headCollum,0);
		tablePhong = new JTable(modelPhong);
		scrollPane.setViewportView(tablePhong);
	}
}
