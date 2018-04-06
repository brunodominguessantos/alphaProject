package org.academiadecodigo.alpha.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

public class ListController implements Controller{


    private static final String NAME = "ListView";
    @FXML
    private ImageView appTitle;

    @FXML
    private Label displayedTime;

    @FXML
    private HBox buttonsContainer;

    @FXML
    private GridPane buttonsGridContainer;

    @FXML
    private Label city;

    @FXML
    private Button homeButton;

    @FXML
    private Button foodButton;

    @FXML
    private Button transportButton;

    @FXML
    private Button luckyButton;

    @FXML
    private ImageView placeImage7;

    @FXML
    private ImageView placeImage6;

    @FXML
    private ImageView placeImage5;

    @FXML
    private ImageView placeImage4;

    @FXML
    private ImageView placeImage3;

    @FXML
    private ImageView placeImage2;

    @FXML
    private ImageView placeImage1;

    @FXML
    private ImageView GoodBtn1;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label label4;

    @FXML
    private Label label5;

    @FXML
    private Label label6;

    @FXML
    private Label label7;

    @FXML
    private Label rating1;

    @FXML
    private Label rating2;

    @FXML
    private Label rating3;

    @FXML
    private Label rating4;

    @FXML
    private Label rating5;

    @FXML
    private Label rating6;

    @FXML
    private Label rating7;

    @FXML
    void homeAction(MouseEvent event) {

    }

    @FXML
    void increasePoints(MouseEvent event) {

    }

    @FXML
    void placeViewFive(MouseEvent event) {

    }

    @FXML
    void placeViewFour(MouseEvent event) {

    }

    @FXML
    void placeViewOne(MouseEvent event) {

    }

    @FXML
    void placeViewSeven(MouseEvent event) {

    }

    @FXML
    void placeViewSix(MouseEvent event) {

    }

    @FXML
    void placeViewThree(MouseEvent event) {

    }

    @FXML
    void placeViewTwo(MouseEvent event) {

    }


    public static String getNAME() {
        return NAME;
    }
}
