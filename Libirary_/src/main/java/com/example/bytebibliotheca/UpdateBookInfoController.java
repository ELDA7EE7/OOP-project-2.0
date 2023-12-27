package com.example.bytebibliotheca;

import AdminPackage.UpdateBookFunctions;
import InterfacesPackage.CommonFunctions;
import javafx.event.ActionEvent;

import java.io.IOException;

public class UpdateBookInfoController extends UpdateBookFunctions implements CommonFunctions {

    public void Back(ActionEvent event) throws IOException {
        SwitchToNextScene(event,"AdminHomePage.fxml");
    }
}
