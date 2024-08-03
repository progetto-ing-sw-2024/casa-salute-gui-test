package com.example.casasalutegui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;
import java.util.UUID;

public class UsersListController implements Initializable {
    @FXML
    private ListView<Object> userListMenu = new ListView<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        for (int i = 0; i < 30; i++) {
            String label = "mario rossi " + i;
            userListMenu.getItems().add(label);
        }

        userListMenu.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(LocalDateTime.now());
            System.out.println(oldValue);
            System.out.println(newValue);
        });
    }
}
