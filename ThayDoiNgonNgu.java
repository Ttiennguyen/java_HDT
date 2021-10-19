package ministore;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ThayDoiNgonNgu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThayDoiNgonNgu frame = new ThayDoiNgonNgu();
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
	public ThayDoiNgonNgu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tiếng Việt");
		chckbxNewCheckBox.setBounds(53, 77, 128, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tiếng Anh");
		chckbxNewCheckBox_1.setBounds(270, 77, 128, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JButton btnNewButton = new JButton("Lưu");
		btnNewButton.setBounds(53, 134, 117, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quay lại");
		btnNewButton_1.setBounds(270, 134, 117, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Chuyển đổi ngôn ngữ");
		lblNewLabel.setBounds(150, 28, 162, 16);
		contentPane.add(lblNewLabel);
	}
}
