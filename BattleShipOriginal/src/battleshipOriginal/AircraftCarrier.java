/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipOriginal;

import javafx.scene.control.Label;

/**
 *
 * @author Abdul
 */
public class AircraftCarrier {

    K_Label sub1, sub2, sub3, sub4, sub5, sub6;
    int counter = 6, hit = 0;

    AircraftCarrier() {
        sub1 = new K_Label();
        sub2 = new K_Label();
        sub3 = new K_Label();
        sub4 = new K_Label();
        sub5 = new K_Label();
        sub6 = new K_Label();
        sub1.setStyle("-fx-background-color: Yellow");
        sub2.setStyle("-fx-background-color: Yellow");
        sub3.setStyle("-fx-background-color: Yellow");
        sub4.setStyle("-fx-background-color: Yellow");
        sub5.setStyle("-fx-background-color: Yellow");
        sub6.setStyle("-fx-background-color: Yellow");
        
    }

    public int getCounter() {
        return counter;
    }
    public K_Label getLabel(){
      
    return sub1;
    }
    public String getStylek(){
    return "-fx-background-color: Yellow";
    }
     public void setHit(){
    hit = 0;
    }
    public int getHit(){
    return hit;
    }
}
