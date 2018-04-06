package org.academiadecodigo.alpha.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import org.academiadecodigo.alpha.Navigation;

import java.time.LocalDateTime;

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
    private ImageView imagemAlaude;

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
    private ImageView like1;

    @FXML
    private ImageView like2;

    @FXML
    private ImageView like3;

    @FXML
    private ImageView like4;

    @FXML
    private ImageView like;

    @FXML
    private Label rating5;

    @FXML
    private Label rating6;

    @FXML
    private Label rating7;

    @FXML
    private ImageView imagemZe;

    @FXML
    private ImageView imagemPacha;

    @FXML
    private ImageView imagemLux;

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

        Navigation.getInstance().loadScreen(PlaceController.getNAME());

        //AudioClip clip = new AudioClip(getClass().getResource("/1982_Doce.mp3").toExternalForm());
        //clip.play();

    }


    @FXML
    void placeViewSeven(MouseEvent event) {

        Navigation.getInstance().loadScreen(PlaceController.getNAME());
    }

    @FXML
    void placeViewSix(MouseEvent event) {

        Navigation.getInstance().loadScreen(PlaceController.getNAME());
    }

    @FXML
    void placeViewThree(MouseEvent event) {

        Navigation.getInstance().loadScreen((PlaceController.getNAME()));

    }

    @FXML
    void placeViewTwo(MouseEvent event) {

        Navigation.getInstance().loadScreen((PlaceController.getNAME()));

    }

    @FXML
    void placeViewZe(MouseEvent event) {
        Navigation.getInstance().loadScreen((PlaceController.getNAME()));
    }


    private String home = "Refresh";
    private String food = "Get Food";
    private String transport = "Get Ride";
    private String lucky = "Get Lucky";
    // to improve
    private Integer nowTime = LocalDateTime.now().getHour();




    public void initialize() {

        //Image image = new Image("logo.png");
        //appTitle.setImage(image);
        homeButton.setText(home);
        foodButton.setText(food);
        transportButton.setText(transport);
        luckyButton.setText(lucky);
        displayedTime.setText(nowTime.toString() + ":00    heyyyyy!!");
        imagemZe.setImage(new Image("1Ze.jpg"));
        imagemPacha.setImage(new Image("2Pacha.jpg"));
        imagemLux.setImage(new Image("3Lux.jpg"));
        imagemAlaude.setImage(new Image("4Alaude.jpg"));
        like1.setImage(new Image("bem_bom.png"));
        like2.setImage(new Image("bem_bom.png"));
        like3.setImage(new Image("bem_bom.png"));
        like4.setImage(new Image("bem_bom.png"));
        appTitle.setImage(new Image("logoQT.png"));
        label1.setText("O Senhor Zé");
        label2.setText("PACHA Fundão");
        label3.setText("LUX Fundão");
        label4.setText("Alaúde");
    }

    public static String getNAME() {
        return NAME;
    }
}
