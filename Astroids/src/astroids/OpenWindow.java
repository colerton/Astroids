/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astroids;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/**
 *
 * @author Taylor
 */
public class OpenWindow {
    public static void open() {
        JFrame gameScreen = new JFrame("TestFrame");
        gameScreen.setSize(400,300);
        gameScreen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameScreen.setVisible(true);
    }
    
    
}
