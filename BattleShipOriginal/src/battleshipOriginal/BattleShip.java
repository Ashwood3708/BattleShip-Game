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
public class BattleShip {

    K_Label sub1, sub2, sub3, sub4, sub5;
    int counter = 5;

    BattleShip() {
        sub1 = new K_Label();
        sub2 = new K_Label();
        sub3 = new K_Label();
        sub4 = new K_Label();
        sub5 = new K_Label();
        sub1.setStyle("-fx-background-color: Black");
        sub2.setStyle("-fx-background-color: Black");
        sub3.setStyle("-fx-background-color: Black");
        sub4.setStyle("-fx-background-color: Black");
        sub5.setStyle("-fx-background-color: Black");
    }
    public int getCounter() {
        return counter;
    }
    public K_Label getLabel(){
    return sub1;
    }
     public String getStyle(){
    return "-fx-background-color: Black";
    }

}
