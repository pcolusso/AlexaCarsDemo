/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexacars;

import java.awt.Dimension;
import javax.swing.WindowConstants;

/**
 *
 * @author paulcolusso
 */
public class AlexaCars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlexaCarRentalsGUI app = new AlexaCarRentalsGUI();
        app.setPreferredSize(new Dimension(400, 200));
        app.pack();
        app.setVisible(true);
    }
    
}
