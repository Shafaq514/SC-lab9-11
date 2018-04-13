package main;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;


public class CarRentalHomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarRentalHomePage frame = new CarRentalHomePage();
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
	public CarRentalHomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 757, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCarRentalSystem = new JLabel("Car Rental System");
		lblCarRentalSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarRentalSystem.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCarRentalSystem.setBounds(207, 24, 336, 45);
		contentPane.add(lblCarRentalSystem);
		
		JButton btnAddCar = new JButton("Add Car");
		btnAddCar.setBounds(276, 69, 197, 51);
		contentPane.add(btnAddCar);
		
		JButton btnCustomerReport = new JButton("Customer Report");
		btnCustomerReport.setBounds(276, 131, 197, 51);
		contentPane.add(btnCustomerReport);
		
		JButton btnBookingReport = new JButton("Booking Report");
		btnBookingReport.setBounds(276, 193, 197, 51);
		contentPane.add(btnBookingReport);
		
		JButton btnFinancialReport = new JButton("Financial Report");
		btnFinancialReport.setBounds(276, 255, 197, 57);
		contentPane.add(btnFinancialReport);
		
		JButton btnNewButton = new JButton("Update Car Information");
		btnNewButton.setBounds(276, 323, 201, 57);
		contentPane.add(btnNewButton);
	}
}
