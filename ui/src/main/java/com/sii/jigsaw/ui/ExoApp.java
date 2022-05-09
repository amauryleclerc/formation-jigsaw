package com.sii.jigsaw.ui;

import com.jigsaw.config.Test;
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
//        Enumeration<URL> url = ClassLoader.getSystemResources("formation.jigsaw.config/config.properties");
//        if(url.hasMoreElements()){
//            properties.load(url.nextElement().openStream());
//        } else{
//            System.out.println("Impossible de charger le fichier de config");
//        }

        InputStream is = Test.class.getResourceAsStream("/config/config.properties");
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
