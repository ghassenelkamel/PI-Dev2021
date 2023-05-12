/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import GUI.Version_3Controller;
import java.io.IOException;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import services.Service_Event;

/**
 *
 * @author kagha
 */
public class MainGUIEventClient2 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException
    {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("../GUIAccueilClientEvent/AccueilClient.fxml"));
        Parent root= loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Ajouter un Event");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
