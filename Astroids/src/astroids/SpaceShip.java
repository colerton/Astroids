/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astroids;

import java.awt.Graphics;

/**
 *
 * @author Taylor
 */
public class SpaceShip {
    private int xPos;
    private int yPos;
    private int width = 5;
    private int height = 10;
    private String name;
    public SpaceShip(String n){
       name = n;
       xPos = 0;
       yPos = 0;
        
    }
    public void draw(Graphics g){
        g.drawRect(xPos, yPos, width, height);
    }
    
    public int getXPos(){
        return xPos;
    }
    public int getYPos(){
        return yPos;
    }
    public String getName(){
        return name;
    }
}
