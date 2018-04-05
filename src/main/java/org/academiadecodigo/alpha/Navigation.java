package org.academiadecodigo.alpha;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.academiadecodigo.alpha.controller.Controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class Navigation {

    public final static int WIDTH = 1024;
    public final static int HEIGHT = 768;

    public final static String VIEW_PATH = "/org/academiadecodigo/alpha/view";
    private static Navigation instance;
    private LinkedList<Scene> scenes;
    private Map<String, Controller> controllers;
    private Stage stage;

    private Navigation() {
        this.scenes = new LinkedList<>();
        this.controllers = new HashMap<>();
    }

    public static Navigation getInstance(){

        if(instance == null){
            instance = new Navigation();
        }

        return instance;
    }

    public void setStage(Stage stage){
        this.stage = stage;
    }

    public  void getController(String view){
        controllers.get(view);
    }

    public void loadScreen(String view) {

        Parent root = loadView(view);

        Scene scene = new Scene(root, WIDTH, HEIGHT);
        scenes.push(scene);

        setScene(scene);


    }

    public Parent loadView(String view){

        Parent root = null;
        try {

            // Instantiate the the controller
            FXMLLoader fxmlLoader;
            fxmlLoader = new FXMLLoader(getClass().getResource(VIEW_PATH + "/" + view + ".fxml"));
            root = fxmlLoader.load();

            // Store the view and the controller
            controllers.put(view, fxmlLoader.<Controller>getController());

        } catch (IOException e) {
            System.out.println("Failure to load view " + view + " : " + e.getMessage());
            e.printStackTrace();
        }

        return root;
    }


    private void setScene(Scene scene) {

        stage.setScene(scene);
        stage.show();
    }

    public void back() {

        if(scenes.isEmpty()){
            return;
        }

        scenes.pop();
        setScene(scenes.peek());

    }


    public void close(){

        stage.close();
    }
}
