/*
18/727/BSSE-S 	Aron Aman Barhe Gebre
18/924/BSCS-S 	Zakariye Mohamed Abdi
18/900/BSSE-S 	Yafiet Kahsay Tesfay
18/1073/BSSE-S 	Biachuy David Tito
18/681/BIT-S 	Mbalanga Alongoli Emmanuel
*/
package org.iuea.oop.views;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import com.toedter.calendar.JDateChooser;



public class LoginPage extends JFrame implements ActionListener{
    JFrame frame;
    Dimension d = new Dimension(350, 360);
    LoginView viewInfo;
    JFrame window2;
    JPanel adminContent;
    
    
    JPanel topPanel, sidePanel, centerPanel, footPanel, gridPanel;
	JButton stdsbtn, coursebtn, courseUbtn, lecturerbtn;
	JMenuBar menuBar;
	
	//////////////////////////////
	JMenu actionMenu, helpMenu;
	JMenuItem logout;
	JMenuItem addStd;
	JMenuItem about;
	JMenuItem help;
	
	JButton addbtn, editbtn, delbtn;
	//////////////////////////////

	JPanel btnsPanel, tablePanel;

	JLabel fnLabel,lnLabel,sexLabel, dobLabel,courseLabel,regLabel;
	JTextField fnField, lnField,courseField,regField;
	JDateChooser dobField;
	JComboBox sexField;
	JButton submitbtn, cancelbtn;
	String[] stdSex = {"Male", "Female"};
	
	
    public LoginPage(){
        
    	frame = new JFrame("IUEA Login");
        frame.setSize(d);
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel content = new JPanel(new GridBagLayout());
        content.setBackground(Color.DARK_GRAY);
//        content.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 5));
        viewInfo = new LoginView();
        viewInfo.loginbtn.addActionListener(this);
        viewInfo.cancelbtn.addActionListener(this);
        
        
        content.add(viewInfo);
        frame.setContentPane(content);
        
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    	
    }
    void createAdminPage() {

    	window2 = new JFrame("Admin's Page");
    	window2.setSize(700,450);
        window2.setLocationRelativeTo(null);
        
        adminContent = new JPanel(new BorderLayout());
        adminContent.setBackground(Color.RED);
        createAdminPanel();
        
        adminContent.validate();
        window2.setContentPane(adminContent);
//        window2.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window2.setVisible(true);
    }

    void createAdminPanel() {
    	
    	Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1);

		Border inner = BorderFactory.createEmptyBorder(15, 12, 15, 12);
		Border outer = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
		Border btnBorder = BorderFactory.createCompoundBorder(outer, inner);
		Border inner2 = BorderFactory.createEmptyBorder(4, 20, 4, 20);
		Border outer2 = BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK);
		Border menuBorder = BorderFactory.createCompoundBorder(outer2, inner2);
		
		topPanel = new JPanel();
		topPanel.setBorder(lineBorder);
		topPanel.setLayout(new FlowLayout(3,0,0));
		topPanel.setBackground(Color.ORANGE);
		
		menuBar = new JMenuBar();
		menuBar.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		
		actionMenu = new JMenu("Action");
		helpMenu = new JMenu("Help"); 
		actionMenu.setBorder(menuBorder);
		helpMenu.setBorder(menuBorder);
		logout = new JMenuItem("Logout");
		addStd = new JMenuItem("Add Student");
		about = new JMenuItem("About");
		help = new JMenuItem("Help");
		actionMenu.add(addStd);
		actionMenu.add(logout);
		helpMenu.add(help);
		helpMenu.add(about);
		
		addStd.addActionListener(this);
		logout.addActionListener(this);
		menuBar.add(actionMenu);
		menuBar.add(helpMenu);
		
		topPanel.add(menuBar);
		adminContent.add(topPanel, BorderLayout.NORTH);
		
		//////////////////////////////////////
		stdsbtn = new JButton("Students");
		coursebtn = new JButton("Course");
		courseUbtn = new JButton("Course Units");
		lecturerbtn = new JButton("Lecturers");

		stdsbtn.setFocusPainted(false);
		coursebtn.setFocusPainted(false);
		courseUbtn.setFocusPainted(false);
		lecturerbtn.setFocusPainted(false);
		//////////////////////////////////////
		
		sidePanel = new JPanel();
		sidePanel.setBorder(lineBorder);
		sidePanel.setLayout(new FlowLayout(4,0,0));
		sidePanel.setBackground(Color.CYAN);
		
		gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(4,1,0,0));
		gridPanel.setBackground(Color.BLUE);
//		gridPanel.setBorder(lineBorder);
		
		//////////////////////////////////
		stdsbtn.setBorder(btnBorder);
		coursebtn.setBorder(btnBorder);
		courseUbtn.setBorder(btnBorder);
		lecturerbtn.setBorder(btnBorder);

		stdsbtn.addActionListener(this);
		coursebtn.addActionListener(this);
		courseUbtn.addActionListener(this);
		lecturerbtn.addActionListener(this);
		//////////////////////////////////////
		
		gridPanel.add(stdsbtn);
		gridPanel.add(coursebtn);
		gridPanel.add(courseUbtn);
		gridPanel.add(lecturerbtn);
		
		sidePanel.add(gridPanel);
		adminContent.add(sidePanel, BorderLayout.WEST);
		
		centerPanel = new JPanel();
		centerPanel.setLayout(new BorderLayout(6,6));
//		centerPanel.setBackground(Color.PINK);
		centerPanel.setBorder(lineBorder);
		centerPanel.setOpaque(true);
		adminContent.add(centerPanel, BorderLayout.CENTER);
		
		footPanel = new JPanel();
		footPanel.setBorder(lineBorder);
		footPanel.setLayout(new FlowLayout());
		footPanel.setBackground(Color.MAGENTA);
		
		JLabel footer = new JLabel("Copyright GroupX 2019");
		
		footPanel.add(footer);
		adminContent.add(footPanel, BorderLayout.SOUTH);
    }
    
    void studentView() {
    	btnsPanel = new JPanel();
		btnsPanel.setLayout(new FlowLayout(1,70,10));
		addbtn = new JButton("Add");
		editbtn = new JButton("Edit");
		delbtn = new JButton("Delete");
		
		addbtn.setFocusPainted(false);
		editbtn.setFocusPainted(false);
		delbtn.setFocusPainted(false);
		addbtn.setBackground(Color.GREEN);
		editbtn.setBackground(Color.BLUE);
		delbtn.setBackground(Color.RED);
		addbtn.setForeground(Color.WHITE);
		editbtn.setForeground(Color.WHITE);
		delbtn.setForeground(Color.WHITE);
		
		addbtn.addActionListener(this);
		editbtn.addActionListener(this);
		delbtn.addActionListener(this);
		btnsPanel.add(addbtn);
		btnsPanel.add(editbtn);
		btnsPanel.add(delbtn);
		
		centerPanel.add(btnsPanel, BorderLayout.NORTH);
		
		tablePanel = new JPanel();
//		tablePanel.setLayout();
		tablePanel.setBackground(Color.LIGHT_GRAY);
		
		centerPanel.add(tablePanel, BorderLayout.CENTER);
    }
    
    void createForm() {
    	JPanel formPanel = new JPanel();
		formPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();

		fnLabel = new JLabel("First Name:");
		lnLabel = new JLabel("Last Name:");
		courseLabel = new JLabel("Course:");
		regLabel = new JLabel("Registration:");
		sexLabel = new JLabel("Sex:");
		dobLabel = new JLabel("Date of Birth:");
		fnField = new JTextField(15);
		lnField = new JTextField(15);
		courseField = new JTextField(15);
		regField = new JTextField(15);
//		regField.setText();
		sexField = new JComboBox(stdSex);
		dobField = new JDateChooser();
		dobField.setSize(new Dimension(15,5));
		dobField.setDateFormatString("dd/MM/yyyy");
		dobField.setDate(new Date("1/1/2000"));
		submitbtn = new JButton("Submit");
		cancelbtn = new JButton("Cancel");

		submitbtn.addActionListener(this);
		cancelbtn.addActionListener(this);
		
		Insets space = new Insets(10,10,10,10);
		gbc.insets=space;
		gbc.gridx=1;
		gbc.gridy=1;
		formPanel.add(fnLabel, gbc);
		
		gbc.gridx=2;
		gbc.gridy=1;
		formPanel.add(fnField, gbc);
		
		gbc.gridx=1;
		gbc.gridy=2;
		formPanel.add(lnLabel, gbc);
		
		gbc.gridx=2;
		gbc.gridy=2;
		formPanel.add(lnField, gbc);
		
		gbc.gridx=1;
		gbc.gridy=3;
		formPanel.add(sexLabel, gbc);

		gbc.fill=GridBagConstraints.HORIZONTAL;    		
		gbc.gridx=2;
		gbc.gridy=3;
		formPanel.add(sexField, gbc);

		gbc.gridx=1;
		gbc.gridy=4;
		formPanel.add(dobLabel, gbc);
		
		gbc.gridx=2;
		gbc.gridy=4;
		formPanel.add(dobField, gbc);

		gbc.fill=GridBagConstraints.NONE;
		gbc.gridx=1;
		gbc.gridy=5;
		formPanel.add(courseLabel, gbc);
		
		gbc.gridx=2;
		gbc.gridy=5;
		formPanel.add(courseField, gbc);
		
		gbc.gridx=1;
		gbc.gridy=6;
		formPanel.add(regLabel, gbc);
		
		gbc.gridx=2;
		gbc.gridy=6;
		formPanel.add(regField, gbc);
		
		gbc.gridx=1;
		gbc.gridy=7;
		formPanel.add(submitbtn, gbc);
		
		gbc.gridx=2;
		gbc.gridy=7;
		formPanel.add(cancelbtn, gbc);
		
		centerPanel.add(formPanel);
    }
    
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == viewInfo.loginbtn) {
			String user = viewInfo.getUserField().getText();
			String password = viewInfo.getPassField().getText();
			if(user.equalsIgnoreCase("admin") && password.equals("admin")){
	            JOptionPane.showMessageDialog(this, "user logged in succesfully", "Welcome", JOptionPane.PLAIN_MESSAGE);
	            frame.setVisible(false);
	            createAdminPage();
	            
	        }else {
	            JOptionPane.showMessageDialog(this, "user name and password does not match what is expected.", "Error", JOptionPane.ERROR_MESSAGE);
	            
	        }
		}else if(e.getSource()==viewInfo.cancelbtn) {
			System.exit(0);
			
		}else if(e.getSource()==logout) {
			window2.dispose();
			frame.setVisible(true);
			
		}else if(e.getSource() == stdsbtn) {
			System.out.println("Student button");
			centerPanel.removeAll();
			studentView();
			centerPanel.updateUI();
			
		}else if(e.getSource() == addbtn || e.getSource() == addStd) {
			centerPanel.removeAll();
			createForm();
			centerPanel.updateUI();
			
		}else if(e.getSource() == submitbtn) {
			
			
		}else if(e.getSource() == cancelbtn) {
			
			
		}else if(e.getSource() == editbtn) {
			
			
		}else if(e.getSource() == delbtn) {
			
			
		}
	}
       
}