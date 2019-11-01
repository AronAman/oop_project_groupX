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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JDateChooser;

public class LoginPage extends JFrame implements ActionListener {
	JFrame frame, frame2;
	JPanel mainContainer,topPanel,sidePanel,gridPanel,bodyPanel,footPanel,formPanel,btnsPanel,tablePanel,stdPanel;
	Dimension frameSize = new Dimension(350, 360);
	LoginView lv;
	
	JButton stdsbtn, coursebtn, courseUbtn, lecturerbtn;
	JMenuBar menuBar;
	JMenu actionMenu, helpMenu;
	JMenuItem logout;
	JMenuItem addStd;
	JMenuItem about;
	JMenuItem help;
	
	JButton addbtn, editbtn, delbtn;
	//////////////////////////////

	JLabel fnLabel,lnLabel,sexLabel, dobLabel,courseLabel,regLabel;
	JLabel fnLabel2,lnLabel2,sexLabel2, courseLabel2,regLabel2;
	JTextField fnField, lnField,courseField,regField;
	
	JDateChooser dobField;
	JComboBox sexField;
	JButton submitbtn, cancelbtn;
	String[] stdSex = {"Male", "Female"};
	////////////////////////////////////////////////////////////////////////
	
	////////////////////////////////////////////////////////////////////////
	JTable table;
	DefaultTableModel dm;
	Integer a=1;
//	String [][] stdData = new String [10][10];
	
	JPanel updateForm;
	JTextField fnField2, lnField2,courseField2,regField2;
	
	JComboBox sexField2;
	JButton updatebtn, upcancelbtn;
	
	public LoginPage(){
		frame = new JFrame("IUEA Login");
		frame.setSize(frameSize);
		frame.setMinimumSize(frameSize);
		
		JPanel contentPane = new JPanel(new GridBagLayout());
		contentPane.setBackground(Color.RED);
		frame.setContentPane(contentPane);
		
		lv = new LoginView();
		frame.add(lv);
		lv.loginbtn.addActionListener(this);
		lv.cancelbtn.addActionListener(this);
		
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
//		createAdminPage();
		
	}
	
	void createAdminPage() {
		frame2 = new JFrame("Admin's Page");
    	frame2.setSize(700,450);
        mainContainer = new JPanel(new BorderLayout());
        createPanels();
        
        frame2.setContentPane(mainContainer);
        
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
	}
	
	void createPanels() {
		Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1);

		Border inner = BorderFactory.createEmptyBorder(15, 12, 15, 12);
		Border outer = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
		Border btnBorder = BorderFactory.createCompoundBorder(outer, inner);
		Border inner2 = BorderFactory.createEmptyBorder(4, 25, 4, 25);
		Border outer2 = BorderFactory.createMatteBorder(0, 0, 0, 1, Color.BLACK);
		
		Border menuBorder = BorderFactory.createCompoundBorder(outer2, inner2);
		
		Border btnInner = BorderFactory.createEmptyBorder(10, 12, 10, 12);
		Border btnOuter = BorderFactory.createLineBorder(Color.BLACK, 0, true);
		
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
//		sidePanel.setBackground(Color.CYAN);
		
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
		
		bodyPanel = new JPanel();
		bodyPanel.setLayout(new BorderLayout(5,5));
		
		bodyPanel.setBackground(Color.PINK);
		
		bodyPanel.setBorder(lineBorder);
		
		footPanel = new JPanel();
		footPanel.setBorder(lineBorder);
		footPanel.setLayout(new FlowLayout());
		footPanel.setBackground(Color.MAGENTA);
		
		JLabel footer = new JLabel("Copyright GroupX 2019");
		
		footPanel.add(footer);
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		/////////////////////////////////////////////////////////////////////////////////////////
		
		btnsPanel = new JPanel();
		btnsPanel.setLayout(new FlowLayout(1,70,10));
		
		tablePanel = new JPanel();
		tablePanel.setLayout(new FlowLayout());
		tablePanel.setBackground(null);
		
		table = new JTable() {
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		dm = (DefaultTableModel) table.getModel();
		String [] colNames = {"#", "First Name", "Last Name", "Sex", "Course", "Registration #"};
		dm.setColumnIdentifiers(colNames);
//		table.addMouseListener(this);
		
		table.getColumnModel().getColumn(0).setMaxWidth(30);
		table.getColumnModel().getColumn(5).setMinWidth(120);
		
		table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		table.setPreferredScrollableViewportSize(new Dimension(500,270));
		JScrollPane scrollPane = new JScrollPane(table);
		
		tablePanel.add(scrollPane);
		
		
		addbtn = new JButton("Add");
		editbtn = new JButton("Edit");
		delbtn = new JButton("Delete");
		
		addbtn.setBorder(BorderFactory.createCompoundBorder(btnOuter, btnInner));
		editbtn.setBorder(BorderFactory.createCompoundBorder(btnOuter, btnInner));
		delbtn.setBorder(BorderFactory.createCompoundBorder(btnOuter, btnInner));
		
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
		

		btnsPanel.setVisible(false);
		tablePanel.setVisible(false);
		bodyPanel.add(btnsPanel, BorderLayout.NORTH);
		bodyPanel.add(tablePanel, BorderLayout.CENTER);
			
		//////////////////////////////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		formPanel = new JPanel();
		formPanel.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		formPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));
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
		
		
		submitbtn.setFocusable(false);
		cancelbtn.setFocusable(false);

		
//		Border btnBorder = BorderFactory.createCompoundBorder(outer, inner);
		
		submitbtn.setBorder(BorderFactory.createCompoundBorder(btnOuter, btnInner));
		submitbtn.setForeground(Color.WHITE);
		submitbtn.setBackground(Color.GREEN);
		
		cancelbtn.setBorder(BorderFactory.createCompoundBorder(btnOuter, btnInner));
		cancelbtn.setForeground(Color.WHITE);
		cancelbtn.setBackground(Color.RED);
		
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

		bodyPanel.add(formPanel, BorderLayout.WEST);
		
		formPanel.setVisible(false);

		//////////////////////////////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		updateForm = new JPanel();
		updateForm.setLayout(new GridBagLayout());
		GridBagConstraints gb = new GridBagConstraints();
		formPanel.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));
		fnLabel2 = new JLabel("First Name:");
		lnLabel2 = new JLabel("Last Name:");
		courseLabel2 = new JLabel("Course:");
		regLabel2 = new JLabel("Registration:");
		sexLabel2 = new JLabel("Sex:");
		
		fnField2 = new JTextField(15);
		lnField2 = new JTextField(15);
		courseField2 = new JTextField(15);
		regField2 = new JTextField(15);
//		regField.setText();
		sexField2 = new JComboBox(stdSex);
		updatebtn = new JButton("Update");

		updatebtn.setFocusable(false);
//		Border btnBorder = BorderFactory.createCompoundBorder(outer, inner);
		
		updatebtn.setBorder(BorderFactory.createCompoundBorder(btnOuter, btnInner));
		updatebtn.setForeground(Color.WHITE);
		updatebtn.setBackground(Color.GREEN);
		
		upcancelbtn = new JButton("Cancel");
		upcancelbtn.setBorder(BorderFactory.createCompoundBorder(btnOuter, btnInner));
		upcancelbtn.setForeground(Color.WHITE);
		upcancelbtn.setBackground(Color.RED);
		
		updatebtn.addActionListener(this);
		
		gb.insets=space;
		gb.gridx=1;
		gb.gridy=1;
		updateForm.add(fnLabel2, gb);
		
		gb.gridx=2;
		gb.gridy=1;
		updateForm.add(fnField2, gb);
		
		gb.gridx=1;
		gb.gridy=2;
		updateForm.add(lnLabel2, gb);
		
		gb.gridx=2;
		gb.gridy=2;
		updateForm.add(lnField2, gb);
		
		gb.gridx=1;
		gb.gridy=3;
		updateForm.add(sexLabel2, gb);

		gb.fill=GridBagConstraints.HORIZONTAL;    		
		gb.gridx=2;
		gb.gridy=3;
		updateForm.add(sexField2, gb);

		gb.fill=GridBagConstraints.NONE;
		gb.gridx=1;
		gb.gridy=4;
		updateForm.add(courseLabel2, gb);
		
		gb.gridx=2;
		gb.gridy=4;
		updateForm.add(courseField2, gb);
		
		gb.gridx=1;
		gb.gridy=5;
		updateForm.add(regLabel2, gb);
		
		gb.gridx=2;
		gb.gridy=5;
		updateForm.add(regField2, gb);
		
		gb.gridx=1;
		gb.gridy=6;
		updateForm.add(updatebtn, gb);
		
		gb.gridx=2;
		gb.gridy=6;
		updateForm.add(upcancelbtn, gb);
		
		updateForm.setVisible(false);
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		//////////////////////////////////////////////////////////////////////////////////////////
		
		mainContainer.add(topPanel, BorderLayout.NORTH);
		mainContainer.add(sidePanel, BorderLayout.WEST);
		mainContainer.add(bodyPanel, BorderLayout.CENTER);
		mainContainer.add(footPanel, BorderLayout.SOUTH);
		
	}

	
	void addData(String i, String fname, String lname, String sex, String course, String reg) {
    	
    	String [] rowData = {i,fname,lname,sex,course,reg};
    	dm.addRow(rowData);
    }
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == lv.loginbtn) {
			System.out.println("login");
			String user = lv.getUserField().getText();
			String password = lv.getPassField().getText();
			if(user.equalsIgnoreCase("admin") && password.equals("admin")){
	            JOptionPane.showMessageDialog(this, "user logged in succesfully", "Welcome", JOptionPane.PLAIN_MESSAGE);
	            frame.setVisible(false);
	            createAdminPage();
	            
	        }else {
	            JOptionPane.showMessageDialog(this, "user name and password does not match what is expected.", "Error", JOptionPane.ERROR_MESSAGE);
	            
	        }
		}else if(e.getSource()==lv.cancelbtn) {
			System.out.println("cancel");
			System.exit(0);
			
		}else if(e.getSource()==stdsbtn) {
			stdsbtn.setBackground(Color.CYAN);
			stdsbtn.setForeground(Color.WHITE);
			bodyPanel.add(tablePanel, BorderLayout.CENTER);
			
			formPanel.setVisible(false);
			tablePanel.setVisible(true);
			btnsPanel.setVisible(true);
			updateForm.setVisible(false);
			
//			mainContainer.revalidate();
			
		}else if(e.getSource()==addbtn || e.getSource()==addStd) {
			bodyPanel.add(formPanel, BorderLayout.CENTER);
			tablePanel.setVisible(false);
			btnsPanel.setVisible(false);
			updateForm.setVisible(false);
			formPanel.setVisible(true);
			
			
//			mainContainer.revalidate();
			
		}else if(e.getSource()==logout) {
			frame2.dispose();
			frame.setVisible(true);
			lv.getPassField().setText("");
			
		}else if(e.getSource()==submitbtn) {
			
			System.out.println("Submit Button");
			String fname = fnField.getText();
	    	String lname = lnField.getText();
	    	String 	sex = (String) sexField.getSelectedItem();
	    	String course = courseField.getText();
	    	String reg = regField.getText();
	    	
	    	
			addData(a.toString(),fname,lname,sex,course,reg);
			
			fnField.setText("");
	    	lnField.setText("");
	    	courseField.setText("");
	    	regField.setText("");
	    	a++;
	    	
bodyPanel.add(tablePanel, BorderLayout.CENTER);
			
			formPanel.setVisible(false);
			tablePanel.setVisible(true);
			btnsPanel.setVisible(true);
			updateForm.setVisible(false);
	    	
		}else if(e.getSource() == cancelbtn || e.getSource() == upcancelbtn) {
			
			fnField.setText("");
	    	lnField.setText("");
	    	courseField.setText("");
	    	regField.setText("");
	    	
	    	formPanel.setVisible(false);
			tablePanel.setVisible(true);
			btnsPanel.setVisible(true);
			
		}else if(e.getSource() == editbtn) {
			System.out.println(table.getSelectedRow());
//			tablePanel.setVisible(false);
//			btnsPanel.setVisible(false);
//			formPanel.setVisible(true);
			if(table.getSelectedRow()<0) {
				String error = "Select a row to edit";
				JOptionPane.showMessageDialog(this, error, "Edit", JOptionPane.PLAIN_MESSAGE);
			}
			else {
			bodyPanel.add(updateForm, BorderLayout.CENTER);
			formPanel.setVisible(false);
			tablePanel.setVisible(false);
			btnsPanel.setVisible(false);
			updateForm.setVisible(true);

			fnField2.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
			lnField2.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
			sexField2.setSelectedItem(table.getValueAt(table.getSelectedRow(), 3));
			courseField2.setText(table.getValueAt(table.getSelectedRow(), 4).toString());
			regField2.setText(table.getValueAt(table.getSelectedRow(), 5).toString());
			
			
			} 
		}else if(e.getSource() == delbtn) {
			if(table.getSelectedRow()<0) {
				String error = "Select a row to delete";
				JOptionPane.showMessageDialog(this, error, "Edit", JOptionPane.PLAIN_MESSAGE);
			}else{
				dm.removeRow(table.getSelectedRow());
			}
			
		}else if(e.getSource()==updatebtn) {

			dm.setValueAt(fnField2.getText(), table.getSelectedRow(), 1);
			dm.setValueAt(lnField2.getText(), table.getSelectedRow(), 2);
			dm.setValueAt(sexField2.getSelectedItem(), table.getSelectedRow(), 3);
			dm.setValueAt(courseField2.getText(), table.getSelectedRow(), 4);
			dm.setValueAt(regField2.getText(), table.getSelectedRow(), 5);
			
			bodyPanel.add(tablePanel, BorderLayout.CENTER);
			
			formPanel.setVisible(false);
			tablePanel.setVisible(true);
			btnsPanel.setVisible(true);
			updateForm.setVisible(false);
			
		}
	}

       
}