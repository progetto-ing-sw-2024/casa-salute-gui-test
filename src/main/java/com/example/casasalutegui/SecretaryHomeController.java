package com.example.casasalutegui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SecretaryHomeController implements Initializable {
    @FXML
    private HBox secretaryHomeHBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ViewManager.setRootPane(secretaryHomeHBox);


        try {
            ViewManager.getInstance().showNavigationMenu();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
