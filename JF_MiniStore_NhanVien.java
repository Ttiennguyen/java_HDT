import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JButton;

public class JF_MiniStore_NhanVien extends JFrame {

	private JPanel contentPane;
	private JTextField txt_MaNV;
	private JTextField txt_TenNV;
	private JTextField txt_SDT;
	private JTextField txt_DiaChi;
	private JTable table_ThemNV;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JF_MiniStore_NhanVien frame = new JF_MiniStore_NhanVien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JF_MiniStore_NhanVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_NhanVien = new JLabel("Nhân Viên");
		lbl_NhanVien.setBounds(180, 6, 70, 16);
		contentPane.add(lbl_NhanVien);
		
		JLabel lbl_MaNV = new JLabel("Mã NV");
		lbl_MaNV.setBounds(6, 33, 61, 16);
		contentPane.add(lbl_MaNV);
		
		txt_MaNV = new JTextField();
		txt_MaNV.setBounds(79, 28, 245, 26);
		contentPane.add(txt_MaNV);
		txt_MaNV.setColumns(10);
		
		JLabel lbl_TenNV = new JLabel("Tên NV");
		lbl_TenNV.setBounds(6, 61, 61, 16);
		contentPane.add(lbl_TenNV);
		
		txt_TenNV = new JTextField();
		txt_TenNV.setBounds(79, 56, 245, 26);
		contentPane.add(txt_TenNV);
		txt_TenNV.setColumns(10);
		
		JLabel lbl_GioiTinh = new JLabel("Giới tính ");
		lbl_GioiTinh.setBounds(6, 89, 61, 16);
		contentPane.add(lbl_GioiTinh);
		
		JRadioButton Check_Nam = new JRadioButton("nam ");
		Check_Nam.setBounds(79, 85, 70, 20);
		contentPane.add(Check_Nam);
		
		JRadioButton Check_Nu = new JRadioButton("nữ");
		Check_Nu.setBounds(140, 85, 89, 23);
		contentPane.add(Check_Nu);
		
		JLabel lbl_SDT = new JLabel("SĐT");
		lbl_SDT.setBounds(6, 117, 61, 16);
		contentPane.add(lbl_SDT);
		
		txt_SDT = new JTextField();
		txt_SDT.setBounds(79, 112, 245, 26);
		contentPane.add(txt_SDT);
		txt_SDT.setColumns(10);
		
		JLabel lbl_DiaChi = new JLabel("Địa chỉ");
		lbl_DiaChi.setBounds(6, 145, 61, 16);
		contentPane.add(lbl_DiaChi);
		
		txt_DiaChi = new JTextField();
		txt_DiaChi.setBounds(79, 140, 245, 26);
		contentPane.add(txt_DiaChi);
		txt_DiaChi.setColumns(10);
		
		table_ThemNV = new JTable();
		table_ThemNV.setBounds(6, 173, 438, 93);
		contentPane.add(table_ThemNV);
		
		JButton btn_Them = new JButton("thêm");
		btn_Them.setBounds(327, 28, 117, 29);
		contentPane.add(btn_Them);
		
		JButton btn_Sua = new JButton("sửa");
		btn_Sua.setBounds(327, 56, 117, 29);
		contentPane.add(btn_Sua);
		
		JButton btn_XoaNV = new JButton("xoá");
		btn_XoaNV.setBounds(327, 112, 117, 29);
		contentPane.add(btn_XoaNV);
		
		JButton btn_Return = new JButton("đóng");
		btn_Return.setBounds(327, 140, 117, 29);
		contentPane.add(btn_Return);
	}
}
