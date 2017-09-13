/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipOriginal;

import javafx.scene.control.Label;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdul
 */
public class K_Label extends Label {

    String face;
    int hit;
    String miss;
    Boolean ship;

    K_Label(){
        face = "~";
        hit = 1;
        miss = "miss";
        ship = false;
        this.setText(face);
        this.setStyle("-fx-background-color: Blue");
         
        
    }
   

    public void ChangeFace() {
        
       
        if (ship == true) {
            this.setText("X");
            this.setStyle("-fx-background-color: Red");
            JOptionPane.showMessageDialog(null, "A ship got hit!!!");

        } else {
            this.setText("O");
            this.setStyle("-fx-background-color: Grey");
            JOptionPane.showMessageDialog(null, "miss, straight water");
        }
    }
    
    public void placeShipPiece(){
    ship = true;
   
   
    }
    public Boolean getShip(){
    return ship;
    }
     public void setHit(){
      
    hit = 0;
      
    }
    public int getHit(){
    return hit;
    }
   public String getStylek(){
    return "-fx-background-color: Yellow";
    }
     

}

