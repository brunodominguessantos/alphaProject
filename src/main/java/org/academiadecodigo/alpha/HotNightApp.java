package org.academiadecodigo.alpha;

import com.aquafx_project.AquaFx;
import com.guigarage.flatterfx.FlatterFX;
import javafx.application.Application;
import javafx.stage.Stage;
import org.academiadecodigo.alpha.controller.ListController;

public class HotNightApp extends Application{


    public static void main(String[] args) {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) {

        Bootstrap bootstrap = new Bootstrap();
        bootstrap.testUserDao();
        bootstrap.testPlaceDao();

        Navigation navigation = Navigation.getInstance();
        navigation.setStage(primaryStage);

        String controllerName = ListController.getNAME();
        System.out.println(controllerName);
        navigation.loadScreen(ListController.getNAME());

        primaryStage.setTitle("Quality Time");
        FlatterFX.style();
        primaryStage.show();

    }
}
