package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
//import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
//import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import control.ImcController;

public class MainViewer {

	private JFrame appFrame;
	private JTextField pesoTextField;
	private JTextField AlturaTextField;
	private JTextPane resultPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.appFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		appFrame = new JFrame();
		appFrame.getContentPane().setForeground(new Color(0, 0, 0));
		appFrame.setTitle("C\u00E1lculo IMC");
		appFrame.setBounds(100, 100, 300, 400);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C\u00E1lcule seu IMC!");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Sitka Small", Font.PLAIN, 25));
		lblNewLabel.setBounds(31, 24, 221, 63);
		appFrame.getContentPane().add(lblNewLabel);
		
		JLabel alturaLabel = new JLabel("Altura");
		alturaLabel.setBounds(31, 188, 46, 14);
		appFrame.getContentPane().add(alturaLabel);
		
		pesoTextField = new JTextField();
		pesoTextField.setHorizontalAlignment(SwingConstants.CENTER);
		pesoTextField.setText("0.0");
		pesoTextField.setBounds(119, 103, 133, 50);
		appFrame.getContentPane().add(pesoTextField);
		pesoTextField.setColumns(10);
		
		JLabel label = new JLabel("Peso");
		label.setBounds(31, 121, 46, 14);
		appFrame.getContentPane().add(label);
		
		AlturaTextField = new JTextField();
		AlturaTextField.setHorizontalAlignment(SwingConstants.CENTER);
		AlturaTextField.setText("0.0");
		AlturaTextField.setColumns(10);
		AlturaTextField.setBounds(119, 164, 133, 50);
		appFrame.getContentPane().add(AlturaTextField);
		
		JButton calcularButton = new JButton("Calcular");
		calcularButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		calcularButton.setForeground(Color.BLACK);
		calcularButton.setBackground(new Color(255, 255, 255));
		calcularButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		calcularButton.setBounds(31, 225, 221, 50);
		calcularButton.addActionListener(new ImcController(this));
		appFrame.getContentPane().add(calcularButton);
		
	    resultPane = new JTextPane();
		resultPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		resultPane.setText("result");
		resultPane.setBounds(31, 286, 221, 50);
		appFrame.getContentPane().add(resultPane);
	}

	public JFrame getAppFrame() {
		return appFrame;
	}

	public void setAppFrame(JFrame appFrame) {
		this.appFrame = appFrame;
	}

	public JTextField getPesoTextField() {
		return pesoTextField;
	}

	public void setPesoTextField(JTextField pesoTextField) {
		this.pesoTextField = pesoTextField;
	}

	public JTextField getAlturaTextField() {
		return AlturaTextField;
	}

	public void setAlturaTextField(JTextField alturaTextField) {
		AlturaTextField = alturaTextField;
	}

	public JTextPane getResultPane() {
		return resultPane;
	}

	public void setResultPane(JTextPane resultPane) {
		this.resultPane = resultPane;
	}
	
	
}
