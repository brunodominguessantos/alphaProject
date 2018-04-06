package org.academiadecodigo.alpha.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class PlaceController {

    private static final String NAME = "PlaceView";

    public static String getName(){
        return NAME;
    }

    @FXML
    private Label placeName;

    @FXML
    private Label Address;

    @FXML
    private Label GoogleMaps;

    @FXML
    private Label ratingLabel;

    @FXML
    private ImageView picture;

    @FXML
    private TextField usercomment;

    @FXML
    private Label userName1;

    @FXML
    private Label userName2;

    @FXML
    private Label userName3;

    @FXML
    private Label userName4;

    @FXML
    private Label userName5;

    @FXML
    private Label comment1;

    @FXML
    private Label comment2;

    @FXML
    private Label comment3;

    @FXML
    private Label comment4;

    @FXML
    private Label comment5;



}
