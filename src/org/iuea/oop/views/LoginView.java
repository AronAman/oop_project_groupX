/*
18/727/BSSE-S Aron Aman Barhe Gebre
18/924/BSCS-S Zakariye Mohamed Abdi
18/900/BSSE-S Yafiet Kahsay Tesfay
18/1073/BSSE-S Biachuy David Tito
18/681/BIT-S Mbalanga Alongoli Emmanuel
*/
package org.iuea.oop.views;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class LoginView extends JPanel {
	
	private JLabel logo, userLabel, passLabel;
	private JTextField userField;
	private JPasswordField passField;
	JButton loginbtn, cancelbtn;
	Dimension panelSize = new Dimension(320, 300);
	
    
	
	public LoginView() {
		setLayout(new GridBagLayout());
//    	setBorder(BorderFactory.createEmptyBorder(10,30,10,30));
    	this.setPreferredSize(panelSize);
    	
    	this.setBackground(Color.LIGHT_GRAY);
    	logo = new JLabel("IUEA Login");
    	userLabel = new JLabel("Username");
    	passLabel = new JLabel("Password");
    	setUserField(new JTextField(15));
    	getUserField().setText("admin");
    	
    	setPassField(new JPasswordField(15));
    	loginbtn = new JButton("Login");
    	cancelbtn = new JButton("Cancel");
    	
    	
    	/////// Customizations //////////////
    	
    	Font logoFont = new Font("DejaVu Serif",3 , 36);
    	Border innerBorderField = (BorderFactory.createEmptyBorder(5,6,5,6));
    	Border innerBorderBtn = BorderFactory.createEmptyBorder(7,78,7,78);
    	Border innerBorderBtn2 = BorderFactory.createEmptyBorder(7,75,7,75);
    	Border outerBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
    	Border fieldBorder = BorderFactory.createCompoundBorder(outerBorder, innerBorderField);
    	Border btnBorder = BorderFactory.createCompoundBorder(outerBorder, innerBorderBtn);
    	Border btnBorder2 = BorderFactory.createCompoundBorder(outerBorder, innerBorderBtn2);
    	
    	logo.setFont(logoFont);
    	
    	userLabel.setBorder(innerBorderField);
    	
    	getUserField().setBorder(fieldBorder);
    	getPassField().setBorder(fieldBorder);
    	
    	loginbtn.setBorder(btnBorder);
    	cancelbtn.setBorder(btnBorder2);
    	
    	// layout of the components
    	
    	GridBagConstraints gbc = new GridBagConstraints();
    	Insets space = new Insets(5,5,5,5);
    	Insets zero = new Insets(0,0,0,0);
    	
    	gbc.gridx=0;
    	gbc.gridy=0;
    	gbc.weighty=0.5;
    	gbc.fill=GridBagConstraints.NONE;
    	add(logo, gbc);
    	
    	gbc.weighty=0.5;
    	gbc.gridy++;
    	add(userLabel, gbc);
    	
    	gbc.gridy++;
    	add(getUserField(), gbc);

    	gbc.gridy++;
    	add(passLabel, gbc);

    	gbc.gridy++;
    	add(getPassField(), gbc);

    	gbc.gridy++;
    	add(loginbtn, gbc);

    	gbc.gridy++;
    	add(cancelbtn, gbc);
    	
    }



	public JPasswordField getPassField() {
		return passField;
	}



	public void setPassField(JPasswordField passField) {
		this.passField = passField;
	}



	public JTextField getUserField() {
		return userField;
	}



	public void setUserField(JTextField userField) {
		this.userField = userField;
	}
	

	
}
