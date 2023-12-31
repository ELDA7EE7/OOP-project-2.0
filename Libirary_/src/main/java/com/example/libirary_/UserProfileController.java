package com.example.libirary_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import resourcesimports.UserInterfaceIcons;
import userprofile.UpdateUserData;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class UserProfileController extends UpdateUserData implements Initializable {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Button logoutButton;
    public Image shoppingCartIconDefault = UserInterfaceIcons.shoppingCart;
    public Image shoppingCartIconOnHover = UserInterfaceIcons.shoppingCartOnHover;
    public Image shoppingCartIconOnClick = UserInterfaceIcons.shoppingCartOnClick;
    public Image backIconDefault = UserInterfaceIcons.goBack;
    public Image backIconOnHover = UserInterfaceIcons.goBackOnHover;
    public Image backIconOnClick = UserInterfaceIcons.goBackOnClick;
    @FXML
    ImageView shoppingCartIcon;
    @FXML
    ImageView backIcon;
    @FXML
    void switchShoppingCartIconToHover(){
        shoppingCartIcon.setImage(shoppingCartIconOnHover);
    }
    @FXML
    void resetShoppingCartIcon(){
        shoppingCartIcon.setImage(shoppingCartIconDefault);
    }
    @FXML
    void switchBackIconToHover(){
        backIcon.setImage(backIconOnHover);
    }
    @FXML
    void resetBackIcon(){
        backIcon.setImage(backIconDefault);
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1){
        super.fillListviewWithUserOrders();
        super.fillListviewWithUserTransaction();
        super.fillEmailLabel();
        super.fillIdLabel();
        super.fillNameLabel();
        super.fillPasswordLabel();
    }
    @FXML
    public void goBackToHomePage(MouseEvent event) throws IOException {
        backIcon.setImage(backIconOnClick);
        root = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.getScene().setRoot(root);
        /*scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setFullScreen(true);*/
    }
    @FXML
    void switchToShoppingCart(MouseEvent e) throws IOException{
        shoppingCartIcon.setImage(shoppingCartIconOnClick);
        root= FXMLLoader.load(getClass().getResource("ShoppingCart.fxml"));
        stage=(Stage) ((Node) e.getSource()).getScene().getWindow();
        stage.getScene().setRoot(root);
        /*scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setFullScreen(true);*/
    }
    private void switchToLoginScene(ActionEvent event)throws IOException{
        root = FXMLLoader.load(getClass().getResource("LogInAsUserScene.fxml"));
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        stage.getScene().setRoot(root);
        /*scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
        stage.setFullScreen(true);*/
    }
    @FXML
    public void pressLogoutButton(ActionEvent event) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Log out");
        alert.setHeaderText("You're about to log out!");
        alert.setContentText("Press OK to log out");

        if (alert.showAndWait().get() == ButtonType.OK){
            System.out.println("You successfully logged out");
            switchToLoginScene(event);
        }
    }
}
