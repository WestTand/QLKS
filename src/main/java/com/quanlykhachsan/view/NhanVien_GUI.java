package com.quanlykhachsan.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class NhanVien_GUI extends JPanel {

    private static final long serialVersionUID = 1L;

    private JTextField txtMaNhanVien, txtTenNhanVien, txtSoDienThoai, txtNgaySinh, txtEmail, txtDiaChi;
    private JComboBox<String> cboLoaiNhanVien;
    private JRadioButton radNam, radNu, radKhac;
    private ButtonGroup gioiTinhGroup;
    private JTable table;
    private DefaultTableModel tableModel;

    public NhanVien_GUI() {
        setLayout(null);

        // Tiêu đề chính
        JLabel lblTitle = new JLabel("Thông Tin Nhân Viên", JLabel.CENTER);
        lblTitle.setBounds(283, 89, 479, 28);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        add(lblTitle);
        
        // Panel nhập liệu sử dụng GroupLayout
        JPanel panelInput = new JPanel();
        panelInput.setBounds(126, 493, 826, 130);

        // Tạo các thành phần giao diện
        JLabel lblMaNhanVien = new JLabel("Mã nhân viên:");
        lblMaNhanVien.setBounds(0, 3, 87, 13);
        JLabel lblTenNhanVien = new JLabel("Tên nhân viên:");
        lblTenNhanVien.setBounds(0, 26, 87, 13);
        JLabel lblSoDienThoai = new JLabel("Số điện thoại:");
        lblSoDienThoai.setBounds(0, 49, 87, 13);
        JLabel lblGioiTinh = new JLabel("Giới tính:");
        lblGioiTinh.setBounds(0, 77, 87, 13);
        JLabel lblNgaySinh = new JLabel("Ngày sinh:");
        lblNgaySinh.setBounds(450, 3, 107, 13);
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(450, 26, 107, 13);
        JLabel lblLoaiNhanVien = new JLabel("Loại nhân viên:");
        lblLoaiNhanVien.setBounds(450, 49, 107, 13);
        JLabel lblDiaChi = new JLabel("Địa chỉ:");
        lblDiaChi.setBounds(450, 72, 107, 13);

        txtMaNhanVien = new JTextField();
        txtMaNhanVien.setBounds(115, 0, 200, 19);
        txtTenNhanVien = new JTextField();
        txtTenNhanVien.setBounds(115, 24, 200, 19);
        txtSoDienThoai = new JTextField();
        txtSoDienThoai.setBounds(115, 48, 200, 19);
        txtNgaySinh = new JTextField();
        txtNgaySinh.setBounds(591, 0, 200, 19);
        txtEmail = new JTextField();
        txtEmail.setBounds(591, 24, 200, 19);
        txtDiaChi = new JTextField();
        txtDiaChi.setBounds(591, 69, 200, 19);
        cboLoaiNhanVien = new JComboBox<>(new String[] {"Nhân viên","Quản Lý"});
        cboLoaiNhanVien.setBounds(591, 48, 200, 19);

        // Giới tính
        radNam = new JRadioButton("Nam");
        radNam.setBounds(6, 0, 55, 21);
        radNu = new JRadioButton("Nữ");
        radNu.setBounds(75, 0, 55, 21);
        radKhac = new JRadioButton("Khác");
        radKhac.setBounds(132, 0, 72, 21);
        gioiTinhGroup = new ButtonGroup();
        gioiTinhGroup.add(radNam);
        gioiTinhGroup.add(radNu);
        gioiTinhGroup.add(radKhac);

        JPanel genderPanel = new JPanel();  // Giảm khoảng cách giữa các radio
        genderPanel.setBounds(115, 77, 200, 25);
        genderPanel.setLayout(null);
        genderPanel.add(radNam);
        genderPanel.add(radNu);
        genderPanel.add(radKhac);
        genderPanel.setPreferredSize(new Dimension(150, 10));

        add(panelInput);
        panelInput.setLayout(null);
        panelInput.add(lblMaNhanVien);
        panelInput.add(lblTenNhanVien);
        panelInput.add(lblSoDienThoai);
        panelInput.add(lblGioiTinh);
        panelInput.add(lblNgaySinh);
        panelInput.add(lblEmail);
        panelInput.add(lblLoaiNhanVien);
        panelInput.add(lblDiaChi);
        panelInput.add(txtMaNhanVien);
        panelInput.add(txtTenNhanVien);
        panelInput.add(txtSoDienThoai);
        panelInput.add(genderPanel);
        panelInput.add(txtNgaySinh);
        panelInput.add(txtEmail);
        panelInput.add(cboLoaiNhanVien);
        panelInput.add(txtDiaChi);

        // Bảng hiển thị dữ liệu
        String[] columnNames = {"Mã nhân viên", "Tên nhân viên", "Số điện thoại", "Giới tính", "Ngày sinh", "Email", "Loại nhân viên", "Trạng thái"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(126, 147, 826, 336);
        add(scrollPane);  // Đặt bảng vào giữa

        // Panel chứa các nút
        JPanel panelButtons = new JPanel();
        panelButtons.setBounds(126, 649, 826, 43);
        JButton btnSua = new JButton("Sửa");
        btnSua.setBounds(336, 10, 63, 21);
        JButton btnXoaTrang = new JButton("Xóa Trắng");
        btnXoaTrang.setBounds(435, 10, 97, 21);
        panelButtons.setLayout(null);
        panelButtons.add(btnSua);
        panelButtons.add(btnXoaTrang);

        add(panelButtons);
        
                JButton btnThem = new JButton("Thêm");
                btnThem.setBounds(229, 10, 75, 21);
                panelButtons.add(btnThem);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Quản lý nhân viên");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.getContentPane().add(new NhanVien_GUI());
        frame.setVisible(true);
    }
}






