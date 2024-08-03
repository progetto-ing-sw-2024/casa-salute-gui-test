package com.example.casasalutegui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class DoctorsListController implements Initializable {
    @FXML
    private ListView<String> doctorsListMenu = new ListView<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        for (int i = 0; i < 30; i++) {
            String label = "dottore " + i;
            doctorsListMenu.getItems().add(label);
        }

        doctorsListMenu.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            System.out.println(LocalDateTime.now());
            System.out.println("old: " + oldValue);
            System.out.println("new: " + newValue);
        });
    }
}
