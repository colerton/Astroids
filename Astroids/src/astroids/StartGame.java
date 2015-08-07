/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astroids;
import astroids.OpenWindow;
import astroids.SpaceShip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList; 
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author Taylor
 */
public class StartGame {
    private static String mapName = "";
    public static void begin(String m){
        mapName=m;
        OpenWindow.open(); //Calls OpenWindow to pop up Jframe
        SpaceShip playerOne = new SpaceShip("Endeavor"); //Creates a ship
        
        
    }
    public String getCurrentMap(){
        return mapName;
    }
    
}
