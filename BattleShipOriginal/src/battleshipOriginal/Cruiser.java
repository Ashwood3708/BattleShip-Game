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
public class Cruiser {

    K_Label sub1, sub2, sub3, sub4;
    int counter = 4;
    int hit = 1;

    Cruiser() {
        sub1 = new K_Label();
        sub2 = new K_Label();
        sub3 = new K_Label();
        sub4 = new K_Label();
        sub1.setStyle("-fx-background-color: Pink");
        sub2.setStyle("-fx-background-color: Pink");
        sub3.setStyle("-fx-background-color: Pink");
        sub4.setStyle("-fx-background-color: Pink");
    }

     public int getCounter() {
        return counter;
    }
    public K_Label getLabel(){
      
    return sub1;
    }
   
     public void setHit(){
    hit = 0;
    }
    public int getHit(){
    return hit;
    }
     public String getStyle(){
    return "-fx-background-color: Pink";
    }
}
