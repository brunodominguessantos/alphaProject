package org.academiadecodigo.alpha.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;
import org.academiadecodigo.alpha.services.PlaceService;
import org.academiadecodigo.alpha.services.ServiceRegistry;
import javafx.scene.input.MouseEvent;

public class PlaceController {

    private PlaceService placeService;

    private static final String NAME = "PlaceView2Pacha";
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

    public void bemBombuttonAcoustic(MouseEvent mouseEvent) {
        System.out.println("WAS CLIKCED");
        AudioClip clip = new AudioClip(getClass().getResource("/1982_Doce.mp3").toExternalForm());
        clip.play();
    }

    public void initialize(){
        placeService = (PlaceService) ServiceRegistry.getServiceRegistry().getService(PlaceService.class.getSimpleName());
        System.out.println(placeService);
        //googleMaps.setText(google);

    }



    public static String getNAME() {
        return NAME;
    }


}
