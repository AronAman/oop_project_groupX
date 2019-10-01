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
import javax.swing.JFrame;

public class LoginPage extends JFrame {
    JFrame frame;
    Dimension d = new Dimension(400, 435);
    LoginView viewInfo;
    
    public LoginPage(){
        frame = new JFrame("IUEA Login");
        frame.setSize(d);
        frame.setLocation(500, 200);
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        viewInfo = new LoginView();
        frame.getContentPane().add(viewInfo);
        viewInfo.setBackground(Color.GRAY);
        
        frame.setVisible(true);
        
        
        
    }
}