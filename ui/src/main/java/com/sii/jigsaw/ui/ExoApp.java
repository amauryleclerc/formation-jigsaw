package com.sii.jigsaw.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.InputStream;
import java.util.Properties;

public class ExoApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Properties properties = new Properties();
        InputStream is = getClass().getResourceAsStream("/config/config.properties");
        if(is != null){
            properties.load(is);
        } else{
            System.out.println("Impossible de charger le fichier de config");
        }
        Label label = new Label("Hello "+properties.getProperty("name"));
        Scene scene = new Scene(label);
        stage.setScene(scene);
        stage.show();
        stage.toFront();
    }
}
