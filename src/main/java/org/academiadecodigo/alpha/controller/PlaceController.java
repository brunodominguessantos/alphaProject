package org.academiadecodigo.alpha.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
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
    private ImageView googleMaps;

    @FXML
    private Label ratingLabel;

    @FXML
    private ImageView imagemLike;

    @FXML
    private ImageView imagemZe;

    @FXML
    private TextField usercomment;

    @FXML
    private Label descricao;

    @FXML
    private Label userName1;

    @FXML
    private Label userName2;

    @FXML
    private Label userName3;

    @FXML
    private Label userName4;

    @FXML
    private Label comment1;

    @FXML
    private Label comment2;

    @FXML
    private Label comment3;

    @FXML
    private Label comment4;

    @FXML
    void likeAction(MouseEvent event) {

        System.out.println("WAS CLIKCED");
        AudioClip clip = new AudioClip(getClass().getResource("/1982_Doce.mp3").toExternalForm());
        clip.play();




    }


    public void initialize(){
        placeService = (PlaceService) ServiceRegistry.getServiceRegistry().getService(PlaceService.class.getSimpleName());
        System.out.println(placeService);
        imagemLike.setImage(new Image("bem_bom.png"));
        imagemZe.setImage(new Image("1Ze.jpg"));
        googleMaps.setImage(new Image("googleMaps.png"));

        ratingLabel.setText("75");
        descricao.setText("O melhor after de Portugal e quiçá no fundão. Neste emblemático café, localizado no Central Business Center do Fundão, reunem-se diariamente personalidades marcantes da vida social fundanense. A não perder!\n");
        userName1.setText("Hácaro");
        userName2.setText("Gervásio");
        userName3.setText("Gustavo");
        comment1.setText("One of the best clubs to go out in Fundão! Nice environment, many interesting people (compering to other clubs), good music ( not much of commercial Music) and it haves 3 floors.\n");
        comment2.setText("Melhor disco da cidade, adoro o espaço e a proximidade da serra. Música à medida e estacionamento à porta. O meu sítio de eleição para ouvir boa música e sacudir o corpo :)\n");

        comment3.setText("O meu espaço de eleição para sair à noite! Mantém os valores de há muitos anos, tem pistas com estilos diferentes para abranger mais gostos musicais ou para se ir variando, o espaço é cuidado é muito bonito. \n");

        address.setText("Praça do Município 27/8, 6230-338 Fundão");
        placeName.setText("O Senhor Zé");
        //googleMaps.setText(google);

    }

    public static String getNAME() {
        return NAME;
    }


}
