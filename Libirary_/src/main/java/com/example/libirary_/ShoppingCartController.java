package com.example.libirary_;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import resourcesimports.UserInterfaceIcons;
import java.io.IOException;

public class ShoppingCartController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    ImageView backIcon;
    @FXML
    ImageView profileIcon;
    Image backIconOnHover = UserInterfaceIcons.goBackOnHover;
    Image backIconOnClick = UserInterfaceIcons.goBackOnClick;
    Image profileIconOnHover = UserInterfaceIcons.profileOnHover;
    Image profileIconOnClick = UserInterfaceIcons.profileOnClick;
    @FXML
    public void switchBackIconOnHover (){
        backIcon.setImage(backIconOnHover);
    }
    public void switchProfileIconOnHover (){
        backIcon.setImage(profileIconOnHover);
    }
    @FXML
    void backToHomePage(MouseEvent event) throws IOException {
        backIcon.setImage(backIconOnClick);
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }
    @FXML
    void goToProfilePage(MouseEvent event) throws IOException {
        profileIcon.setImage(profileIconOnClick);
        root = FXMLLoader.load(getClass().getResource("UserProfileScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }
}
