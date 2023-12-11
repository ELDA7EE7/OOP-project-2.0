package com.example.libirary_;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class MainClass extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainClass.class.getResource("SplashScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Library");
        stage.setScene(scene);
        //stage.setFullScreen(true);
        stage.show();


        // add default user
        User user = new User("mazenalaa","mazen@gmail.com","12345678a");


        stage.setOnCloseRequest(event -> {
            event.consume();
            close(stage);
        });
    }
    public void close(Stage stage){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want to save before exiting?");

        if (alert.showAndWait().get() == ButtonType.OK){
            System.out.println("You successfully logged out");
            stage.close();
        }
    }
    public static void main(String[] args) throws IOException {
        for(int i=0;i<10;i++) {
            Book book = new Book("title" + i, "author" + i, "author", 200, 20, "author", "berserk1.jpg",true,3);
        }
        Book book=new Book("mazen","mazen","In stock",2005,2000.0F,"Action","berserk1.jpg",true,3);
        launch();
    }
}