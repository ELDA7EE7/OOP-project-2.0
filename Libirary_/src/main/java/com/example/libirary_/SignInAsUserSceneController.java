package com.example.libirary_;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
public class SignInAsUserSceneController extends RegistrationSystem
{
    @FXML
    private Button loginButton;

@FXML
    private void checkAccount(ActionEvent event) throws IOException {
System.out.println(this.email);
System.out.println(this.username);
String  password = this.username;
String  emailOrUsername = this.email;
        for(User user : User.users)
        {
            System.out.println(user.userInfo.email);

            System.out.println(user.userInfo.userName);

            System.out.println(user.userInfo.password);
            if(( (user.userInfo.email.equals(emailOrUsername))|| (user.userInfo.userName.equals(emailOrUsername)))&& user.userInfo.password.equals(password))
            {
                switchToHomePageScene(loginButton);
                return;
            }
        }
    // Alert
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Data Not found");
            alert.showAndWait();
    enterPasswordField.clear();
    emailTextField.clear();
    }
}