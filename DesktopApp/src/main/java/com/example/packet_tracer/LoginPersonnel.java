package com.example.packet_tracer;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginPersonnel {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Button connecter;

    @FXML
    private Label loginErreur;

    // Method to handle the login button action
    @FXML
    void seconnecter() {
        String usernameText = username.getText();
        String passwordText = password.getText();

        // Call the method to send the login credentials to the API
        boolean loginSuccessful = sendLoginCredentials(usernameText, passwordText);

        if (loginSuccessful) {
            // Navigate to the next screen or perform necessary actions upon successful login
            // For example: navigateToDashboard();
        } else {
            // Display an error message if login fails
            loginErreur.setText("Invalid username or password");
        }
    }

    // Method to send login credentials to the API
    private boolean sendLoginCredentials(String username, String password) {
        // Code to send the username and password to the API and receive the response
        // This can be implemented using HTTP requests or any other suitable method
        // For demonstration purposes, let's assume the login is successful if the username is "admin" and the password is "password"
        return username.equals("admin") && password.equals("password");
    }

    // Additional methods for navigation or other functionalities can be added here
}