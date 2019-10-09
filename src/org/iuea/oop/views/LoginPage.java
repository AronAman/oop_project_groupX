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
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LoginPage extends JFrame {
    JFrame frame;
    Dimension d = new Dimension(350, 360);
    LoginView viewInfo;
    
    public LoginPage(){
        
    	frame = new JFrame("IUEA Login");
        frame.setSize(d);
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel content = new JPanel(new GridBagLayout());
        content.setBackground(Color.DARK_GRAY);
//        content.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 5));
        
        frame.setContentPane(content);
        frame.add(new LoginView());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        
    }
}