package com.example.bytebibliotheca;

import AdminPackage.RemoveBookFunctions;
import InterfacesPackage.CommonFunctions;
import javafx.event.ActionEvent;

import java.io.IOException;

public class RemoveBookController extends RemoveBookFunctions implements CommonFunctions {




    public void BackToAdmin(ActionEvent event) throws IOException {
        SwitchToNextScene(event,"AdminHomePage.fxml");//return to AdminHomePage
    }
}
