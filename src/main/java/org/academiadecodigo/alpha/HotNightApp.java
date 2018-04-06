package org.academiadecodigo.alpha;

import javafx.application.Application;
import javafx.stage.Stage;
import org.academiadecodigo.alpha.controller.ListController;
import org.academiadecodigo.alpha.services.RatingService;
import org.academiadecodigo.alpha.services.Service;
import org.academiadecodigo.alpha.services.ServiceRegistry;

import java.util.Map;

public class HotNightApp extends Application{


    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) {

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.testUserDao();
        bootstrap.testPlaceDao();

        bootstrap.wireDependencies();

        Navigation navigation = Navigation.getInstance();
        navigation.setStage(primaryStage);

        String controllerName = ListController.getNAME();
        System.out.println(controllerName);
        navigation.loadScreen(ListController.getNAME());

        primaryStage.setTitle("Quality Time");
        primaryStage.show();
    }
}
