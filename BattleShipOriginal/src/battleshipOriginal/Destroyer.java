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
public class Destroyer {

    K_Label sub1, sub2, sub3;
    int counter = 3;

    Destroyer() {
        sub1 = new K_Label();
        sub2 = new K_Label();
        sub3 = new K_Label();
        sub1.setStyle("-fx-background-color: Purple");
        sub2.setStyle("-fx-background-color: Purple");
        sub3.setStyle("-fx-background-color: Purple");

    }

    public int getCounter() {
        return counter;
    }
    public K_Label getLabel(){
    return sub1;
    }
     public String getStyle(){
    return "-fx-background-color: Purple";
    }

}
