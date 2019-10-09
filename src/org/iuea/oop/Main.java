/*
18/727/BSSE-S Aron Aman Barhe Gebre
18/924/BSCS-S Zakariye Mohamed Abdi
18/900/BSSE-S Yafiet Kahsay Tesfay
18/1073/BSSE-S Biachuy David Tito
18/681/BIT-S Mbalanga Alongoli Emmanuel
*/
package org.iuea.oop;

import javax.swing.SwingUtilities;

import org.iuea.oop.views.LoginPage;

public class Main {
    
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				LoginPage win = new LoginPage();
		        
			}
        });
        
    }
}

