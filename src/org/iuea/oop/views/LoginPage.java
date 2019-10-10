/*
18/727/BSSE-S Aron Aman Barhe Gebre
18/924/BSCS-S Zakariye Mohamed Abdi
18/900/BSSE-S Yafiet Kahsay Tesfay
18/1073/BSSE-S Biachuy David Tito
18/681/BIT-S Mbalanga Alongoli Emmanuel
*/
package org.iuea.oop.views;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class LoginPage extends JFrame {
    JFrame frame;
    Dimension d = new Dimension(350, 360);
    LoginView viewInfo;
    JFrame window2;
    LandingPage lp;
    
    
    public LoginPage(){
        
    	frame = new JFrame("IUEA Login");
        frame.setSize(d);
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel content = new JPanel(new GridBagLayout());
        content.setBackground(Color.DARK_GRAY);
//        content.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 5));
        
        frame.setContentPane(content);
        frame.add(new LoginView(this));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    	
        
    	
        
    }
    
    public void adminPage() {
    	
    	window2 = new JFrame("Admin's Page");
    	window2.setSize(600,500);
        window2.setLocationRelativeTo(null);
        
        JPanel adminContent = new JPanel(new BorderLayout(8,6));
        lp = new LandingPage();
        adminContent.add(lp);
        
        window2.setContentPane(adminContent);
        window2.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.GREEN));
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        window2.addWindowListener(new WindowAdapter() {
//        	
//        	public void windowClosing(WindowEvent evt) {
//        		window2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        		frame.setVisible(true);
//        	}
//        });
        
        window2.setVisible(true);
        
    }

	/*
	 * Beginning of class LandingPage that is shown after a user logs in
	 * 
	 */
    
    
    class LandingPage extends JPanel {
    	JPanel topPanel, sidePanel, centerPanel, footPanel, logoutPanel, gridPanel;
    	JButton actionbtn, helpbtn;
    	JButton stdsbtn;
    	JButton coursebtn;
    	JButton courseUbtn;
    	JButton lecturerbtn;
    	
    	Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
    	public LandingPage() {
    		
    		setLayout(new BorderLayout(0,0));
    		this.setBackground(Color.YELLOW);
    		
    		topPanel = new JPanel();
    		topPanel.setBorder(lineBorder);
    		topPanel.setLayout(new FlowLayout(3,0,0));
    		topPanel.setBackground(Color.ORANGE);
    		
    		add(topPanel, BorderLayout.NORTH);
    		
    		//////////////////////////////////////
    		
    		actionbtn = new JButton("Action");
    		helpbtn = new JButton("Help");
    		stdsbtn = new JButton("Students");
    		coursebtn = new JButton("Course");
    		courseUbtn = new JButton("Course Units");
    		lecturerbtn = new JButton("Lecturers");

    		stdsbtn.setFocusPainted(false);
    		coursebtn.setFocusPainted(false);
    		courseUbtn.setFocusPainted(false);
    		lecturerbtn.setFocusPainted(false);
    		
    		//////////////////////////////////////
    		
    		topPanel.add(actionbtn);
    		topPanel.add(helpbtn);
    		
    		sidePanel = new JPanel();
    		sidePanel.setBorder(lineBorder);
    		sidePanel.setLayout(new FlowLayout(4,0,0));
    		sidePanel.setBackground(Color.CYAN);
    		
    		gridPanel = new JPanel();
    		gridPanel.setLayout(new GridLayout(4,1,0,0));
    		gridPanel.setBackground(Color.BLUE);
//    		gridPanel.setBorder(lineBorder);
    		
    		Border btnInner = BorderFactory.createEmptyBorder(15, 30, 15, 30);
    		Border btnOuter = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
    		Border btnBorder = BorderFactory.createCompoundBorder(btnOuter, btnInner);
    		
    		stdsbtn.setBorder(btnBorder);
    		coursebtn.setBorder(btnBorder);
    		courseUbtn.setBorder(btnBorder);
    		lecturerbtn.setBorder(btnBorder);
    		
    		gridPanel.add(stdsbtn);
    		gridPanel.add(coursebtn);
    		gridPanel.add(courseUbtn);
    		gridPanel.add(lecturerbtn);
    		
    		sidePanel.add(gridPanel);
    		add(sidePanel, BorderLayout.WEST);
    		
    		centerPanel = new JPanel();
    		centerPanel.setLayout(null);
    		centerPanel.setBackground(Color.PINK);
    		centerPanel.setBorder(lineBorder);
    		
    		add(centerPanel);
    		
    		footPanel = new JPanel();
    		footPanel.setBorder(lineBorder);
    		footPanel.setLayout(new FlowLayout());
    		footPanel.setBackground(Color.MAGENTA);
    		
    		JLabel footer = new JLabel("Copyright GroupX 2019");
    		
    		footPanel.add(footer);
    		add(footPanel, BorderLayout.SOUTH);
    		
    		///////////////////////////////
    		
    	}
    	
    }
    
    /*
     * End of LandingPage class
     * 
     */
    
    
    
    
    
    
}