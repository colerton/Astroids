/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astroids;

/**
 *
 * @author Taylor
 */
public class SpaceShip {
    private int xPos;
    private int yPos;
    private String name;
    public SpaceShip(String n){
       name = n;
       xPos = 0;
       yPos = 0;
        
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
