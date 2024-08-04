package com.example.casasalutegui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SecretaryMenuController implements Initializable {
    public Button usersButton;
    public Button doctorsButton;
    public Button nursesButton;
    public Button patientsButton;
    public Button appointmentsButton;
    public Button logoutButton;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void navigationButtonClicked(MouseEvent actionEvent) throws IOException {
        Button x = (Button) actionEvent.getSource();

        if (x == usersButton) {
            ViewManager.getInstance().showUsersList();
        }
        else if (x == doctorsButton) {
            ViewManager.getInstance().showDoctorsList();
        }
        else if (x == nursesButton) {
            ViewManager.getInstance().showNursesList();
        }
        else if (x == patientsButton) {
            ViewManager.getInstance().showPatientsList();
        }
        else if (x == appointmentsButton) {
            ViewManager.getInstance().showAppointmentsList();
        }
        else if (x == logoutButton) {

        }
    }
}
