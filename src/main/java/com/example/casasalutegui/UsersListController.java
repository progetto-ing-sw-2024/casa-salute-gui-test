package com.example.casasalutegui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class UsersListController implements Initializable {
    @FXML
    private ListView<String> userListMenu = new ListView<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        for (int i = 0; i < 30; i++) {
            String label = "mario rossi " + i;
            userListMenu.getItems().add(label);
        }

        userListMenu.getSelectionModel().selectedItemProperty().addListener(this::selectUser);
    }

    private void selectUser(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        System.out.println(LocalDateTime.now());
        System.out.println("old: " + oldValue);
        System.out.println("new: " + newValue);
        try {
            ViewManager.getInstance().showUserDetail();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
