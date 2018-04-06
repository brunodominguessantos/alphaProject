package org.academiadecodigo.alpha.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
import java.awt.event.MouseEvent;
import java.io.File;

public class PlaceController {


    private static final String NAME = "PlaceView";
    private String google = "Google it on google maps";

    @FXML
    private Label placeName;

    @FXML
    private Label address;

    @FXML
    private Label googleMaps;

    @FXML
    private Label ratingLabel;

    @FXML
    private ImageView voteButton;

    @FXML
    private Button bemBombutton;

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

    @FXML
    void bemBombuttonAcoustic(MouseEvent event){

        Media sound = new Media("1982_Doce.mp3");
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

    }


    @FXML
    public void initialize() {
        googleMaps.setText(google);
    }

    public static String getNAME() {
        return NAME;
    }
}
