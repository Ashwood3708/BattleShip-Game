/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipOriginal;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdul
 */
public class BattleShipGame extends Application implements EventHandler {

    GridPanes playerPane;
    GridPanes EnemyPane;
    Button btnStart, btnPlace, btnRefresh, btnAttack;
    int minPlaces = 0;

    @Override
    public void start(Stage primaryStage) {

        playerPane = new GridPanes();   // creating grid panes for player  
        playerPane.setAlignment(Pos.CENTER);
        Insets inset = new Insets(10, 10, 10, 10);
        playerPane.setPadding(inset);

        //create gid pane for cpu
        EnemyPane = new GridPanes();
        EnemyPane.setAlignment(Pos.CENTER);
        EnemyPane.setPadding(inset);

        Label N = new Label("Player Board___________ Enemy Board");
        HBox hbox = new HBox(N);
        btnStart = new Button(" Start ");

        btnPlace = new Button(" Place Ships ");
        btnAttack = new Button(" Next Target ");
        btnRefresh = new Button(" Refresh ");
        //btnRefresh.setDisable(true);
        btnAttack.setDisable(true);
        btnPlace.setOnAction(this);
        btnStart.setOnAction(this);
        btnRefresh.setOnAction(this);
        btnAttack.setOnAction(this);
        HBox hbbox = new HBox(btnStart, btnAttack, btnRefresh);

        BorderPane border = new BorderPane();
        border.setTop(hbox);
        border.setLeft(playerPane);
        border.setRight(EnemyPane);
        border.setBottom(hbbox);
        Scene scene = new Scene(border, 200, 200);

        primaryStage.setTitle("Battle Ship");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void handle(Event e) {
        Button b = (Button) e.getSource();

        if (b.getText().equals(" Place Ships ")) {

           //button not in use used for maintance
        } else if (b.getText().equals(" Next Target ")) {
            easyMode();

        } else if (b.getText().equals(" Start ")) {
            playerPlaceShips();
            JOptionPane.showMessageDialog(null, " The game will now Commence!!! ");
            GameStartUp();
            btnStart.setDisable(true);
            btnAttack.setDisable(false);

        } else if (b.getText().equals(" Refresh ")) {
            //clearing boards for when restart game
            EnemyPane.makePaneRestart();

            playerPane.makePaneRestart();
            btnStart.setDisable(false);

        }
    }

    //places ships for game
    public void GameStartUp() {
        int end = 0; // just meant to keep loop going

        generateEnemyPane();

        //player will continue to attack until either the player or Enemy win
        modeSelect();

    }

    public void generateEnemyPane() {
        int random = (int) (Math.random() * 3 + 1);
        if (random == 1) {
            EnemyPane.makeEnemyPane_1();
        } else if (random == 2) {
            EnemyPane.makeEnemyPane_2();
        } else if (random == 3) {
            EnemyPane.makeEnemyPane_3();
        }
        EnemyPane.refreshBoard();
    }

    //player places ships, must have a min of 14 spots in use. forcefully ends if 20 or more
    public void playerPlaceShips() {
        JOptionPane.showMessageDialog(null, "Choose what ships you want to use and place them ");
        int places = 0, minPlaces = 0, counter = 1;

        while (places == 0) {
            if (minPlaces < 20) {
                if (minPlaces <= 13) {
                    places = Integer.parseInt(JOptionPane.showInputDialog("place ship number " + counter + "\n" + " 2 = submarine,  3 = Destroyer,  4 = Crusier,  5 = BattleShip,  6 = Aircraft Carrier"));
                    while (places == 0) {
                        places = Integer.parseInt(JOptionPane.showInputDialog(" not valid " + "\n" + " 2 = submarine,  3 = Destroyer,  4 = Crusier,  5 = BattleShip,  6 = Aircraft Carrier"));
                    }
                    if (places == 2) {
                        playerPane.placeSubmarine();
                        minPlaces += places;
                        places = 0;
                        counter++;
                    } else if (places == 3) {
                        playerPane.placeDestroyer();
                        minPlaces += places;
                        places = 0;
                        counter++;
                    } else if (places == 4) {
                        playerPane.placeCruiser();
                        minPlaces += places;
                        places = 0;
                        counter++;
                    } else if (places == 5) {
                        playerPane.placeBattleship();
                        minPlaces += places;
                        places = 0;
                        counter++;
                    } else if (places == 6) {
                        playerPane.placeAircraftCarrier();
                        minPlaces += places;
                        places = 0;
                        counter++;
                    }
                } else if (minPlaces > 13) {
                    JOptionPane.showMessageDialog(null, " Notice : " + "\n" + " You may choose to stop here or continue placing ships. 0 = done");
                    places = Integer.parseInt(JOptionPane.showInputDialog("place ship number " + counter + "\n" + "0 = done, 2 = submarine,  3 = Destroyer,  4 = Crusier,  5 = BattleShip,  6 = Aircraft Carrier"));
                    if (places == 2) {
                        playerPane.placeSubmarine();
                        minPlaces += places;
                        places = 0;
                        counter++;
                    } else if (places == 3) {
                        playerPane.placeDestroyer();
                        minPlaces += places;
                        places = 0;
                        counter++;
                    } else if (places == 4) {
                        playerPane.placeCruiser();
                        minPlaces += places;
                        places = 0;
                        counter++;
                    } else if (places == 5) {
                        playerPane.placeBattleship();
                        minPlaces += places;
                        places = 0;
                        counter++;
                    } else if (places == 6) {
                        playerPane.placeAircraftCarrier();
                        minPlaces += places;
                        places = 0;
                        counter++;
                    } else {
                        places = 1;
                    }

                }
            } else {
                JOptionPane.showMessageDialog(null, " Notice : " + "\n" + " You have enough ships, just play the game!");
                places = 1;
            }

        }

    }

    //player chooses easy mode
    public void easyMode() {
        int end = 0;
        while (end == 0) {
            EnemyPane.location(JOptionPane.showInputDialog("enter attack Location for enemy"));

            if (EnemyPane.isGameOver() == true) {

                JOptionPane.showMessageDialog(null, "You Won, the Enemy Is no more!!!");
                EnemyPane.showAll();
                playerPane.showAll();
                break;
            }

            playerPane.cpuAttack();
            if (playerPane.isGameOver() == true) {
                JOptionPane.showMessageDialog(null, "You Lose, The enemy has won. ");
                EnemyPane.showAll();
                playerPane.showAll();
                break;
            }
            end = 1;

        }
    }
//player chooses medium mode
    public void mediumMode() {
        int end = 0;
        while (end == 0) {
            EnemyPane.location(JOptionPane.showInputDialog("enter attack Location for enemy"));

            if (EnemyPane.isGameOver() == true) {

                JOptionPane.showMessageDialog(null, "You Won, the Enemy Is no more!!!");
                EnemyPane.showAll();
                playerPane.showAll();
                break;
            }

            playerPane.cpuAttack();
            if (playerPane.isGameOver() == true) {
                JOptionPane.showMessageDialog(null, "You Lose, The enemy has won. ");
                EnemyPane.showAll();
                playerPane.showAll();
                break;
            }

        }
    }
//player slects easy or medium mode
    public void modeSelect() {
        JOptionPane.showMessageDialog(null, "Very Important!!!" + "\n" + " There are two modes to this game:  easy and medium "
                + "\n" + "Easy mode will allow the player to see the board change as each turn ends,"
                + " but you will need to push the continue button after each turn." + "\n"
                + "Medium mode will allow the player to enter locations until a winner is decided, the board will not update until the game is over.");
        String k = JOptionPane.showInputDialog("Now Choose a mode. E for easy and M for Medium");

        int end = 0;
        if (k.equals("e") || k.equals("E")) {
            //player will continue to attack until either the player or Enemy win
            easyMode();
        } else if (k.equals("M") || k.equals("m")) {
            //player will continue to attack until either the player or Enemy win
            mediumMode();
        }

    }
}