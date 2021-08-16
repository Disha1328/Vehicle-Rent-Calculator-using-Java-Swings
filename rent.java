//S DISHA ADIGA 1CR19IS123
// CAR/BIKE RENTAL APP
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rent {

	private JFrame frame;
	private JTextField textField_name;
	private JTextField textField_addr;
	private JTextField textField_bikeno;
	private JTextField textField_licnum;
	private JTextField textField_rate;
	private JTextField textField_dist;
	private JTextField textField_amt;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rent window = new rent();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public rent() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 449);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 674, 399);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel name = new JLabel("Name");
		name.setFont(new Font("Tahoma", Font.BOLD, 12));
		name.setBounds(10, 47, 98, 24);
		panel.add(name);
		
		textField_name = new JTextField();
		textField_name.setBounds(147, 50, 191, 20);
		panel.add(textField_name);
		textField_name.setColumns(10);
		
		JLabel address = new JLabel("Address");
		address.setFont(new Font("Tahoma", Font.BOLD, 12));
		address.setBounds(10, 99, 98, 24);
		panel.add(address);
		
		textField_addr = new JTextField();
		textField_addr.setColumns(10);
		textField_addr.setBounds(147, 91, 191, 43);
		panel.add(textField_addr);
		
		JLabel bikenum = new JLabel("Bike Number");
		bikenum.setFont(new Font("Tahoma", Font.BOLD, 12));
		bikenum.setBounds(382, 47, 98, 24);
		panel.add(bikenum);
		
		textField_bikeno = new JTextField();
		textField_bikeno.setColumns(10);
		textField_bikeno.setBounds(509, 50, 155, 20);
		panel.add(textField_bikeno);
		
		JLabel license = new JLabel("License Number");
		license.setFont(new Font("Tahoma", Font.BOLD, 12));
		license.setBounds(382, 99, 98, 24);
		panel.add(license);
		
		textField_licnum = new JTextField();
		textField_licnum.setColumns(10);
		textField_licnum.setBounds(509, 102, 155, 20);
		panel.add(textField_licnum);
		
		JLabel ratekm = new JLabel("Rate/km");
		ratekm.setFont(new Font("Tahoma", Font.BOLD, 12));
		ratekm.setBounds(382, 165, 98, 24);
		panel.add(ratekm);
		
		textField_rate = new JTextField();
		textField_rate.setColumns(10);
		textField_rate.setBounds(509, 168, 155, 20);
		panel.add(textField_rate);
		
		JLabel dist = new JLabel("Distance travelled");
		dist.setFont(new Font("Tahoma", Font.BOLD, 12));
		dist.setBounds(10, 165, 127, 24);
		panel.add(dist);
		
		textField_dist = new JTextField();
		textField_dist.setColumns(10);
		textField_dist.setBounds(147, 168, 191, 20);
		panel.add(textField_dist);
		
		JLabel lblVehicleRentalApp = new JLabel("VEHICLE RENTAL APP");
		lblVehicleRentalApp.setForeground(Color.BLUE);
		lblVehicleRentalApp.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblVehicleRentalApp.setBounds(213, 11, 283, 24);
		panel.add(lblVehicleRentalApp);
		
		JButton btnNewButton_calc = new JButton("Calculate Amount");
		btnNewButton_calc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double dist= Double.parseDouble(textField_dist.getText());
				double rate= Double.parseDouble(textField_rate.getText());
				double amount= dist*rate;
				textField_amt.setText(String.valueOf(amount));
			}
			
		});
		btnNewButton_calc.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_calc.setForeground(new Color(0, 0, 0));
		btnNewButton_calc.setBounds(248, 230, 181, 43);
		panel.add(btnNewButton_calc);
		
		JLabel lblAmountToBe = new JLabel("Amount to be paid");
		lblAmountToBe.setForeground(Color.RED);
		lblAmountToBe.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAmountToBe.setBounds(106, 309, 147, 24);
		panel.add(lblAmountToBe);
		
		textField_amt = new JTextField();
		textField_amt.setColumns(10);
		textField_amt.setBounds(248, 312, 191, 20);
		panel.add(textField_amt);
	}

}

