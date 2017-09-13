/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleshipOriginal;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javax.swing.JOptionPane;

/**
 *
 * @author Abdul
 */
public class GridPanes extends GridPane {

    private K_Label[][] label_List;

    int totalShipPieces = 0;    //number of ship peices, when zero game will end

    GridPanes() {
        label_List = new K_Label[13][13];
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                K_Label txt = new K_Label();
                label_List[i][j] = txt;
            }
        }
        for (int i = 9; i < 13; i++) {
            for (int j = 9; j < 13; j++) {
                K_Label txt = new K_Label();
                txt.placeShipPiece();
                label_List[i][j] = txt;
            }
        }

        makepane();

    }

    //makes new boards for restart
    public GridPanes makePaneRestart() {

        this.getChildren().clear();
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                K_Label txt = new K_Label();
                label_List[i][j] = txt;
                this.add(label_List[i][j], i, j);
            }
        }

        //Create Labeling Boundary for player
        Label txtA = new Label("A");
        Label txtB = new Label("B");
        Label txtC = new Label("C");
        Label txtD = new Label("D");
        Label txtE = new Label("E");
        Label txtF = new Label("F");
        Label txtG = new Label("G");

        Label txt1 = new Label("1");
        Label txt2 = new Label("2");
        Label txt3 = new Label("3");
        Label txt4 = new Label("4");
        Label txt5 = new Label("5");
        Label txt6 = new Label("6");
        Label txt7 = new Label("7");

        this.add(txtA, 0, 1);
        this.add(txtB, 0, 2);
        this.add(txtC, 0, 3);
        this.add(txtD, 0, 4);
        this.add(txtE, 0, 5);
        this.add(txtF, 0, 6);
        this.add(txtG, 0, 7);

        this.add(txt1, 1, 0);
        this.add(txt2, 2, 0);
        this.add(txt3, 3, 0);
        this.add(txt4, 4, 0);
        this.add(txt5, 5, 0);
        this.add(txt6, 6, 0);
        this.add(txt7, 7, 0);

        return this;
    }

//Basic GridPane For start
    public GridPane makepane() {

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                K_Label txt = new K_Label();
                label_List[i][j] = txt;
                this.add(label_List[i][j], i, j);
            }
        }

        //Create Labeling Boundary for player
        Label txtA = new Label("A");
        Label txtB = new Label("B");
        Label txtC = new Label("C");
        Label txtD = new Label("D");
        Label txtE = new Label("E");
        Label txtF = new Label("F");
        Label txtG = new Label("G");

        Label txt1 = new Label("1");
        Label txt2 = new Label("2");
        Label txt3 = new Label("3");
        Label txt4 = new Label("4");
        Label txt5 = new Label("5");
        Label txt6 = new Label("6");
        Label txt7 = new Label("7");

        this.add(txtA, 0, 1);
        this.add(txtB, 0, 2);
        this.add(txtC, 0, 3);
        this.add(txtD, 0, 4);
        this.add(txtE, 0, 5);
        this.add(txtF, 0, 6);
        this.add(txtG, 0, 7);

        this.add(txt1, 1, 0);
        this.add(txt2, 2, 0);
        this.add(txt3, 3, 0);
        this.add(txt4, 4, 0);
        this.add(txt5, 5, 0);
        this.add(txt6, 6, 0);
        this.add(txt7, 7, 0);

        return this;
    }

    //makes first template of Enemy Pane
    public GridPane makeEnemyPane_1() {
        totalShipPieces = 14;
        int width, height;
        //place Aircraft Carrier pieces
        AircraftCarrier Air1 = new AircraftCarrier();
        width = 2;
        height = 7;
        label_List[height][width] = Air1.getLabel();
        label_List[height][width].placeShipPiece();
        AircraftCarrier Air2 = new AircraftCarrier();
        width = 2;
        height = 6;
        label_List[height][width] = Air2.getLabel();
        label_List[height][width].placeShipPiece();
        AircraftCarrier Air3 = new AircraftCarrier();
        width = 2;
        height = 5;
        label_List[height][width] = Air3.getLabel();
        label_List[height][width].placeShipPiece();
        AircraftCarrier Air4 = new AircraftCarrier();
        width = 2;
        height = 4;
        label_List[height][width] = Air4.getLabel();
        label_List[height][width].placeShipPiece();
        AircraftCarrier Air5 = new AircraftCarrier();
        width = 2;
        height = 3;
        label_List[height][width] = Air5.getLabel();
        label_List[height][width].placeShipPiece();
        AircraftCarrier Air6 = new AircraftCarrier();
        width = 2;
        height = 2;
        label_List[height][width] = Air6.getLabel();
        label_List[height][width].placeShipPiece();

        //place Battle ship points
        BattleShip btt1 = new BattleShip();
        width = 5;
        height = 2;
        label_List[height][width] = btt1.getLabel();
        label_List[height][width].placeShipPiece();
        BattleShip btt2 = new BattleShip();
        width = 5;
        height = 3;
        label_List[height][width] = btt2.getLabel();
        label_List[height][width].placeShipPiece();
        BattleShip btt3 = new BattleShip();
        width = 5;
        height = 4;
        label_List[height][width] = btt3.getLabel();
        label_List[height][width].placeShipPiece();
        BattleShip btt4 = new BattleShip();
        width = 5;
        height = 5;
        label_List[height][width] = btt4.getLabel();
        label_List[height][width].placeShipPiece();
        BattleShip btt5 = new BattleShip();
        width = 5;
        height = 6;
        label_List[height][width] = btt5.getLabel();
        label_List[height][width].placeShipPiece();

        // place Destroyer peices
        Destroyer dtr1 = new Destroyer();
        width = 7;
        height = 7;
        label_List[height][width] = dtr1.getLabel();
        label_List[height][width].placeShipPiece();
        Destroyer dtr2 = new Destroyer();
        width = 6;
        height = 7;
        label_List[height][width] = dtr2.getLabel();
        label_List[height][width].placeShipPiece();
        Destroyer dtr3 = new Destroyer();
        width = 5;
        height = 7;
        label_List[height][width] = dtr3.getLabel();
        label_List[height][width].placeShipPiece();

//hides ships
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                label_List[i][j].setStyle("-fx-background-color: Blue");

            }
        }

        createBoundary();
        refreshBoard();
        return this;
    }

    //makes second template of Enemy Pane
    public GridPane makeEnemyPane_2() {
        int width, height;
        totalShipPieces = 14;

        //place submarine 1
        submarines k = new submarines(); //has no real purpose
        width = 1;
        height = 3;
        label_List[height][width] = new submarines().getLabel();
        label_List[height][width].placeShipPiece();
        width = 1;
        height = 4;
        label_List[height][width] = new submarines().getLabel();
        label_List[height][width].placeShipPiece();

        //place submarine 2
        submarines L = new submarines(); //has no real purpose
        width = 6;
        height = 2;
        label_List[height][width] = new submarines().getLabel();
        label_List[height][width].placeShipPiece();
        width = 7;
        height = 2;
        label_List[height][width] = new submarines().getLabel();
        label_List[height][width].placeShipPiece();

        //place Destroyer 1
        Destroyer p = new Destroyer(); //has no real purpose
        width = 3;
        height = 7;
        label_List[height][width] = new Destroyer().getLabel();
        label_List[height][width].placeShipPiece();
        width = 4;
        height = 7;
        label_List[height][width] = new Destroyer().getLabel();
        label_List[height][width].placeShipPiece();
        width = 5;
        height = 7;
        label_List[height][width] = new Destroyer().getLabel();
        label_List[height][width].placeShipPiece();

        //place Destroyer 2
        Destroyer m = new Destroyer(); //has no real purpose
        width = 5;
        height = 5;
        label_List[height][width] = new Destroyer().getLabel();
        label_List[height][width].placeShipPiece();
        width = 6;
        height = 5;
        label_List[height][width] = new Destroyer().getLabel();
        label_List[height][width].placeShipPiece();
        width = 7;
        height = 5;
        label_List[height][width] = new Destroyer().getLabel();
        label_List[height][width].placeShipPiece();

        //place Cruiser
        Cruiser y = new Cruiser(); // no real purpose
        width = 4;
        height = 1;
        label_List[height][width] = new Cruiser().getLabel();
        label_List[height][width].placeShipPiece();
        width = 4;
        height = 2;
        label_List[height][width] = new Cruiser().getLabel();
        label_List[height][width].placeShipPiece();
        width = 4;
        height = 3;
        label_List[height][width] = new Cruiser().getLabel();
        label_List[height][width].placeShipPiece();
        width = 4;
        height = 4;
        label_List[height][width] = new Cruiser().getLabel();
        label_List[height][width].placeShipPiece();

//hides enemy ships
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                label_List[i][j].setStyle("-fx-background-color: Blue");

            }
        }

//       
        createBoundary();
        refreshBoard();
        return this;
    }

    //makes third template of Enemy Pane
    public GridPane makeEnemyPane_3() {
        totalShipPieces = 14;
        int width, height;

        //place Aircraft Carriers
        AircraftCarrier Air1 = new AircraftCarrier();
        width = 1;
        height = 4;
        label_List[height][width] = new AircraftCarrier().getLabel();
        label_List[height][width].placeShipPiece();
        width = 2;
        height = 4;
        label_List[height][width] = new AircraftCarrier().getLabel();
        label_List[height][width].placeShipPiece();
        width = 3;
        height = 4;
        label_List[height][width] = new AircraftCarrier().getLabel();
        label_List[height][width].placeShipPiece();
        width = 4;
        height = 4;
        label_List[height][width] = new AircraftCarrier().getLabel();
        label_List[height][width].placeShipPiece();
        width = 5;
        height = 4;
        label_List[height][width] = new AircraftCarrier().getLabel();
        label_List[height][width].placeShipPiece();

        //place Cruiser
        Cruiser y = new Cruiser(); // no real purpose
        width = 4;
        height = 1;
        label_List[height][width] = new Cruiser().getLabel();
        label_List[height][width].placeShipPiece();
        width = 5;
        height = 1;
        label_List[height][width] = new Cruiser().getLabel();
        label_List[height][width].placeShipPiece();
        width = 6;
        height = 1;
        label_List[height][width] = new Cruiser().getLabel();
        label_List[height][width].placeShipPiece();
        width = 7;
        height = 1;
        label_List[height][width] = new Cruiser().getLabel();
        label_List[height][width].placeShipPiece();

        //place submarine 
        submarines k = new submarines(); //has no real purpose
        width = 3;
        height = 6;
        label_List[height][width] = new submarines().getLabel();
        label_List[height][width].placeShipPiece();
        width = 3;
        height = 7;
        label_List[height][width] = new submarines().getLabel();
        label_List[height][width].placeShipPiece();

        //place Destroyer 
        Destroyer p = new Destroyer(); //has no real purpose
        width = 6;
        height = 5;
        label_List[height][width] = new Destroyer().getLabel();
        label_List[height][width].placeShipPiece();
        width = 6;
        height = 6;
        label_List[height][width] = new Destroyer().getLabel();
        label_List[height][width].placeShipPiece();
        width = 6;
        height = 7;
        label_List[height][width] = new Destroyer().getLabel();
        label_List[height][width].placeShipPiece();

//hides pieces
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {
                label_List[i][j].setStyle("-fx-background-color: Blue");

            }
        }

        createBoundary();
        refreshBoard();
        return this;
    }
//check for space to place ships downward

    public String lookDown(int h, int w, int counter) {
        int temph = 0, tempw = 0;
        temph = h;
        tempw = w;

        while (temph == 0 || tempw == 0) {

            JOptionPane.showMessageDialog(null, "h = " + temph + " w = " + tempw);
            String loc = JOptionPane.showInputDialog("Input a Valid Location, ex: \"A1\"");
            temph = lettersToNumbers(loc.charAt(0));
            tempw = widthToNumbers(loc.charAt(1));

            h = temph;
            w = tempw;
            //JOptionPane.showMessageDialog(null, "h = " + h + " w = " + w);

        }

        for (int i = 0; i < counter; i++) {

            if (label_List[h + i][w].getShip() == true) {

                String loc = JOptionPane.showInputDialog("cannot place ship here, choose another starting location (" + counter + ") empty spots required");
                int p1 = lettersToNumbers(loc.charAt(0));
                int p2 = widthToNumbers(loc.charAt(1));
                h = p1;
                w = p2;
                lookDown(p1, p2, counter);
            }

        }
        return h + "" + w + "";

    }
//check for space to place ships to the Right

    public String lookRight(int h, int w, int counter) {
        int temph = 0, tempw = 0;
        temph = h;
        tempw = w;

        while (temph == 0 || tempw == 0) {

            //JOptionPane.showMessageDialog(null, "h = " + temph + " w = " + tempw);
            String loc = JOptionPane.showInputDialog("Input a Valid Location, ex: \"A1\"");
            temph = lettersToNumbers(loc.charAt(0));
            tempw = widthToNumbers(loc.charAt(1));

            h = temph;
            w = tempw;
            //JOptionPane.showMessageDialog(null, "h = " + h + " w = " + w);

        }

        for (int i = 0; i < counter; i++) {

            if (label_List[h][w + i].getShip() == true) {

                String loc = JOptionPane.showInputDialog("cannot place ship here, choose another starting location (" + counter + ") empty spots required");
                int p1 = lettersToNumbers(loc.charAt(0));
                int p2 = widthToNumbers(loc.charAt(1));
                h = p1;
                w = p2;
                lookRight(p1, p2, counter);

            }

        }
        return h + "" + w + "";
    }

    //individual placement of ships for player
    public void placeSubmarine() {
        totalShipPieces += 2;
        int width = 0, height = 0, h = 0, p1, p2;
        int count = 1;
        submarines ship1 = new submarines();

        h = ship1.getCounter();

        String loc = JOptionPane.showInputDialog("Choose starting position for submarine");
        String direction = JOptionPane.showInputDialog("Choose direction for submarine: down or right. (" + h + ") empty spots required");
        p1 = lettersToNumbers(loc.charAt(0));
        p2 = widthToNumbers(loc.charAt(1));

        if (direction.equalsIgnoreCase("down") || direction.equalsIgnoreCase("d")  ) {
            String get = lookDown(p1, p2, h);
            p1 = java.lang.Character.getNumericValue(get.charAt(0));
            p2 = java.lang.Character.getNumericValue(get.charAt(1));

            for (int i = 0; i < h; i++) {
                height = p1 + i;
                width = p2;
                label_List[height][width] = new submarines().getLabel();
                label_List[height][width].placeShipPiece();
            }

        } else if (direction.equalsIgnoreCase("right")  || direction.equalsIgnoreCase("r")){
            String get = lookRight(p1, p2, h);
            p1 = java.lang.Character.getNumericValue(get.charAt(0));
            p2 = java.lang.Character.getNumericValue(get.charAt(1));

            for (int i = 0; i < h; i++) {
                height = p1;
                width = p2 + i;
                label_List[height][width] = new submarines().getLabel();
                label_List[height][width].placeShipPiece();
            }
        }

        refreshBoard();
    }

    public void placeDestroyer() {

        int p1 = 0, p2 = 0, h = 0, height, width;
        int count = 1;

        Destroyer ship3 = new Destroyer();
        h = ship3.getCounter();
        totalShipPieces += h;
        String loc = JOptionPane.showInputDialog("Choose starting position for Destroyer");
        String direction = JOptionPane.showInputDialog("Choose direction for submarine: down or right. (" + h + ") empty spots required");
        p1 = lettersToNumbers(loc.charAt(0));
        p2 = widthToNumbers(loc.charAt(1));

        if (direction.equalsIgnoreCase("down") || direction.equalsIgnoreCase("d")  ) {
            String get = lookDown(p1, p2, h);
            p1 = java.lang.Character.getNumericValue(get.charAt(0));
            p2 = java.lang.Character.getNumericValue(get.charAt(1));

            for (int i = 0; i < h; i++) {
                height = p1 + i;
                width = p2;
                label_List[height][width] = new Destroyer().getLabel();
                label_List[height][width].placeShipPiece();
            }

        } else if (direction.equalsIgnoreCase("right")  || direction.equalsIgnoreCase("r")){
            String get = lookRight(p1, p2, h);
            p1 = java.lang.Character.getNumericValue(get.charAt(0));
            p2 = java.lang.Character.getNumericValue(get.charAt(1));

            for (int i = 0; i < h; i++) {
                height = p1;
                width = p2 + i;
                label_List[height][width] = new Destroyer().getLabel();
                label_List[height][width].placeShipPiece();
            }
        }

        refreshBoard();

    }

    public void placeCruiser() {
        int p1 = 0, p2 = 0, h = 0, height, width;
        int count = 1;
        Cruiser ship4 = new Cruiser();
        h = ship4.getCounter();
        totalShipPieces += h;
        String loc = JOptionPane.showInputDialog("Choose starting position for Cruiser");
        String direction = JOptionPane.showInputDialog("Choose direction for submarine: down or right. (" + h + ") empty spots required");
        p1 = lettersToNumbers(loc.charAt(0));
        p2 = widthToNumbers(loc.charAt(1));

        if (direction.equalsIgnoreCase("down") || direction.equalsIgnoreCase("d")  ) {
            String get = lookDown(p1, p2, h);
            p1 = java.lang.Character.getNumericValue(get.charAt(0));
            p2 = java.lang.Character.getNumericValue(get.charAt(1));

            for (int i = 0; i < h; i++) {
                height = p1 + i;
                width = p2;
                label_List[height][width] = new Cruiser().getLabel();
                label_List[height][width].placeShipPiece();
            }

        } else if (direction.equalsIgnoreCase("right")  || direction.equalsIgnoreCase("r")){
            String get = lookRight(p1, p2, h);
            p1 = java.lang.Character.getNumericValue(get.charAt(0));
            p2 = java.lang.Character.getNumericValue(get.charAt(1));

            for (int i = 0; i < h; i++) {
                height = p1;
                width = p2 + i;
                label_List[height][width] = new Cruiser().getLabel();
                label_List[height][width].placeShipPiece();
            }
        }

        refreshBoard();
    }

    public void placeBattleship() {
        int p1 = 0, p2 = 0, h = 0, height, width;
        int count = 1;
        BattleShip ship5 = new BattleShip();
        h = ship5.getCounter();
        totalShipPieces += h;
        String loc = JOptionPane.showInputDialog("Choose starting position for Battle Ship");
        String direction = JOptionPane.showInputDialog("Choose direction for submarine: down or right. (" + h + ") empty spots required");
        p1 = lettersToNumbers(loc.charAt(0));
        p2 = widthToNumbers(loc.charAt(1));

        if (direction.equalsIgnoreCase("down") || direction.equalsIgnoreCase("d")  ) {
            String get = lookDown(p1, p2, h);
            p1 = java.lang.Character.getNumericValue(get.charAt(0));
            p2 = java.lang.Character.getNumericValue(get.charAt(1));

            for (int i = 0; i < h; i++) {
                height = p1 + i;
                width = p2;
                label_List[height][width] = new BattleShip().getLabel();
                label_List[height][width].placeShipPiece();
            }

        } else if (direction.equalsIgnoreCase("right")  || direction.equalsIgnoreCase("r")){
            String get = lookRight(p1, p2, h);
            p1 = java.lang.Character.getNumericValue(get.charAt(0));
            p2 = java.lang.Character.getNumericValue(get.charAt(1));

            for (int i = 0; i < h; i++) {
                height = p1;
                width = p2 + i;
                label_List[height][width] = new BattleShip().getLabel();
                label_List[height][width].placeShipPiece();
            }
        }

        refreshBoard();
    }

    public void placeAircraftCarrier() {
        int p1 = 0, p2 = 0, h = 0, height, width;
        int count = 1;
        AircraftCarrier ship6 = new AircraftCarrier();
        h = ship6.getCounter();
        totalShipPieces += h;
        String loc = JOptionPane.showInputDialog("Choose starting position for Aircraft Carrier");
        String direction = JOptionPane.showInputDialog("Choose direction for submarine: down or right. (" + h + ") empty spots required");
        p1 = lettersToNumbers(loc.charAt(0));
        p2 = widthToNumbers(loc.charAt(1));

        if (direction.equalsIgnoreCase("down") || direction.equalsIgnoreCase("d")  ) {
            String get = lookDown(p1, p2, h);
            p1 = java.lang.Character.getNumericValue(get.charAt(0));
            p2 = java.lang.Character.getNumericValue(get.charAt(1));

            for (int i = 0; i < h; i++) {
                height = p1 + i;
                width = p2;
                label_List[height][width] = new AircraftCarrier().getLabel();
                label_List[height][width].placeShipPiece();
            }

        } else if (direction.equalsIgnoreCase("right")  || direction.equalsIgnoreCase("r")){
            String get = lookRight(p1, p2, h);
            p1 = java.lang.Character.getNumericValue(get.charAt(0));
            p2 = java.lang.Character.getNumericValue(get.charAt(1));

            for (int i = 0; i < h; i++) {
                height = p1;
                width = p2 + i;
                label_List[height][width] = new AircraftCarrier().getLabel();
                label_List[height][width].placeShipPiece();
            }
        }

        refreshBoard();
    }

    //targets a location
    public void location(String loc) {
        int k, l, width, height;
        do {

            height = lettersToNumbers(loc.charAt(0));
            width = widthToNumbers(loc.charAt(1));
            k = height;
            l = width;

            if (k == 0 || l == 0) {
                JOptionPane.showMessageDialog(null, "k = " + k + " l = " + l);
                loc = JOptionPane.showInputDialog("Input a Valid Location, ex: \"A1\"");
                height = lettersToNumbers(loc.charAt(0));
                width = java.lang.Character.getNumericValue(loc.charAt(1));
            }
            k = height;
            l = width;
        } while (k == 0 || l == 0);

        if (label_List[height][width].getShip() == true) {
            totalShipPieces--;
            label_List[height][width].setText("X");
            label_List[height][width].setHit();
            label_List[height][width].setStyle("-fx-background-color: Red");
            JOptionPane.showMessageDialog(null, "A ship got hit!!!");
            isGameOver();

        } else {
            label_List[height][width].setText("O");
            label_List[height][width].setHit();
            label_List[height][width].setStyle("-fx-background-color: Grey");
            JOptionPane.showMessageDialog(null, "miss, straight water");
        }
        refreshBoard();

    }

    //translate letters to numbers
    public int lettersToNumbers(char letter) {
        int p1 = 0;
        //JOptionPane.showMessageDialog(null, letter);
        if (letter == 'A' || letter == 'a') {
            p1 = 1;
        } else if (letter == 'B' || letter == 'b') {
            p1 = 2;
        } else if (letter == 'C' || letter == 'c') {
            p1 = 3;
        } else if (letter == 'D' || letter == 'd') {
            p1 = 4;
        } else if (letter == 'E' || letter == 'e') {
            p1 = 5;
        } else if (letter == 'F' || letter == 'f') {
            p1 = 6;
        } else if (letter == 'G' || letter == 'g') {
            p1 = 7;
        } else {
            p1 = 0;
        }

        return p1;
    }

    //make sure that the width is number
    public int widthToNumbers(char number) {
        int p2 = java.lang.Character.getNumericValue(number);
       // JOptionPane.showMessageDialog(null, p2);
        if (p2 == 1) {
            p2 = 1;
        } else if (p2 == 2) {
            p2 = 2;
        } else if (p2 == 3) {
            p2 = 3;
        } else if (p2 == 4) {
            p2 = 4;
        } else if (p2 == 5) {
            p2 = 5;
        } else if (p2 == 6) {
            p2 = 6;
        } else if (p2 == 7) {
            p2 = 7;
        } else {
            p2 = 0;
        }

        return p2;
    }
//refresh the board
    public GridPane refreshBoard() {
        this.getChildren().clear();
        //Create Labeling Boundary for player
        Label txtA = new Label("A");
        Label txtB = new Label("B");
        Label txtC = new Label("C");
        Label txtD = new Label("D");
        Label txtE = new Label("E");
        Label txtF = new Label("F");
        Label txtG = new Label("G");

        Label txt1 = new Label("1");
        Label txt2 = new Label("2");
        Label txt3 = new Label("3");
        Label txt4 = new Label("4");
        Label txt5 = new Label("5");
        Label txt6 = new Label("6");
        Label txt7 = new Label("7");

        this.add(txtA, 0, 1);
        this.add(txtB, 0, 2);
        this.add(txtC, 0, 3);
        this.add(txtD, 0, 4);
        this.add(txtE, 0, 5);
        this.add(txtF, 0, 6);
        this.add(txtG, 0, 7);

        this.add(txt1, 1, 0);
        this.add(txt2, 2, 0);
        this.add(txt3, 3, 0);
        this.add(txt4, 4, 0);
        this.add(txt5, 5, 0);
        this.add(txt6, 6, 0);
        this.add(txt7, 7, 0);

        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {

                this.add(label_List[i][j], j, i);
            }
        }
        return this;
    }

    //checks if all ships have been shot
    public Boolean isGameOver() {
        Boolean end = false;
        if (totalShipPieces == 0) {
            end = true;

        }
        return end;
    }

    //to display board when game is done
    public void showAll() {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 8; j++) {

                if (label_List[i][j].getHit() == 0) { // 0 means it was targeted

                } else if (label_List[i][j].getHit() == 1 && label_List[i][j].getShip() == true) { // 1 means it did not get hit
                    label_List[i][j].setStyle(label_List[i][j].getStylek());
                }

            }
        }
        refreshBoard();
    }

    //cpu random targeting
    public void cpuAttack() {
        int width, height;
        width = (int) (Math.random() * 7 + 1);
        height = (int) (Math.random() * 7 + 1);

        if (label_List[height][width].getShip() == true) {
            totalShipPieces--;
            label_List[height][width].setText("X");
            label_List[height][width].setHit();
            label_List[height][width].setStyle("-fx-background-color: Red");
            JOptionPane.showMessageDialog(null, "They hit your ship!!!");
            isGameOver();

        } else {
            label_List[height][width].setText("O");
            label_List[height][width].setHit();
            label_List[height][width].setStyle("-fx-background-color: Grey");
            JOptionPane.showMessageDialog(null, "They missed!!!");
        }
        refreshBoard();

    }

    // create boundary
    public void createBoundary() {
        //Create Labeling Boundary for player

        Label txtA = new Label("A");
        Label txtB = new Label("B");
        Label txtC = new Label("C");
        Label txtD = new Label("D");
        Label txtE = new Label("E");
        Label txtF = new Label("F");
        Label txtG = new Label("G");

        Label txt1 = new Label("1");
        Label txt2 = new Label("2");
        Label txt3 = new Label("3");
        Label txt4 = new Label("4");
        Label txt5 = new Label("5");
        Label txt6 = new Label("6");
        Label txt7 = new Label("7");

        this.add(txtA, 0, 1);
        this.add(txtB, 0, 2);
        this.add(txtC, 0, 3);
        this.add(txtD, 0, 4);
        this.add(txtE, 0, 5);
        this.add(txtF, 0, 6);
        this.add(txtG, 0, 7);

        this.add(txt1, 1, 0);
        this.add(txt2, 2, 0);
        this.add(txt3, 3, 0);
        this.add(txt4, 4, 0);
        this.add(txt5, 5, 0);
        this.add(txt6, 6, 0);
        this.add(txt7, 7, 0);
    }

}
