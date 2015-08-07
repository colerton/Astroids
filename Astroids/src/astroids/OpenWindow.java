/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astroids;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.WindowConstants;
/**
 *
 * @author Taylor
 */
public class OpenWindow {
    public static void open() {
        JFrame gameScreen = new JFrame("TestFrame");
        
        final JPanel gamePanel = new JPanel(){
            @Override
            public void paintComponent(Graphics g){
                //draw shit
                super.paintComponent(g);
                
        }    
        };
       gamePanel.setSize(800,600);
       gameScreen.add(gamePanel);
       gameScreen.pack();
       gameScreen.setLocationRelativeTo(null);
       gameScreen.setVisible(true);
       new Timer(16, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent event) {
               gamePanel.repaint();
           }
       }).start();
    }
}
