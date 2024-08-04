package com.example.casasalutegui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

import java.io.IOException;
import java.net.URL;

public class ViewManager {
    private static final ViewManager instance = new ViewManager();
    private static BorderPane rootPane;
    private static HBox rootBox;

    private ViewManager() { };

    public static ViewManager getInstance() {
        return instance;
    }

    public static void setRootPane(BorderPane rootPane) {
        ViewManager.rootPane = rootPane;
    }

    public static void setRootPane(HBox rootPane) {
        ViewManager.rootBox = rootPane;
    }

    public void showNavigationMenu2() throws IOException {
        Node navigationMenu = getNode("secretary-menu.fxml");
        rootBox.getChildren().add(navigationMenu);
    }

    public void showUsersList() throws IOException {
        Node usersList = getNode("users-list.fxml");
        setFirstColumn(usersList);
    }

    public void showDoctorsList() throws IOException {
        Node doctorsList = getNode("doctors-list-view.fxml");
        setFirstColumn(doctorsList);
    }

    public void showNursesList() {
        System.out.println("showNursesList");
    }

    public void showPatientsList() {
        System.out.println("showPatientsList");
    }

    public void showAppointmentsList() {
        System.out.println("showAppointmentsList");
    }

    private Node getNode(String resourceName) throws IOException {
        URL resource = getClass().getResource(resourceName);
        FXMLLoader loader = new FXMLLoader(resource);
        Node node = loader.load();
        return node;
    }

    private void setFirstColumn(Node node) {
        if (rootBox.getChildren().size() >= 2) {
            rootBox.getChildren().remove(1);
        }
        rootBox.getChildren().add(node);
    }

    private void setSecondColumn(Node node) {
        if (rootBox.getChildren().size() >= 3) {
            rootBox.getChildren().remove(2);
        }
        rootBox.getChildren().add(node);
    }
}
