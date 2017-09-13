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
public class submarines {
  
    K_Label sub1, sub2;
    int counter=2 , hit = 1;

    submarines() {
        sub1 = new K_Label();
        sub2 = new K_Label();
        sub1.setStyle("-fx-background-color: Orange");
        sub2.setStyle("-fx-background-color: Orange");

    }
    public int getCounter(){
    return counter;
    }
    public K_Label getLabel(){

    return sub1;
    }
    
    public String getStyle(){
    return "-fx-background-color: Orange";
    }
    public void setHit(){
    hit = 0;
    }
    public int getHit(){
    return hit;
    }

}
