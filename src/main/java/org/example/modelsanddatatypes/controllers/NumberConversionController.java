package org.example.modelsanddatatypes.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;
import org.example.modelsanddatatypes.models.NumberConversionModel;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class NumberConversionController implements Initializable {
    private final NumberConversionModel model = new NumberConversionModel();

    @FXML
    private Label lblWelcomeText;
    @FXML
    private TextField txtKmInput;
    @FXML
    private Label lblKmToMilesResult;
    @FXML
    private TextField txtMilesInput;
    @FXML
    private Label lblMilesToKmResult;

    @FXML
    private void kmToMilesOnClick(ActionEvent event)
    {
        String input = txtKmInput.getText().replace(",", ".");
        float txtFieldValue = Float.parseFloat(input);
        float result = model.getMilesFromKilometers(txtFieldValue);
        String formattedResult = String.format("%.2f", result);
        lblKmToMilesResult.setText(formattedResult + " miles");
    }

    @FXML
    private void milesToKmOnClick(ActionEvent event)
    {
        String input = txtMilesInput.getText().replace(",", ".");
        float txtFieldValue = Float.parseFloat(input);
        float result = model.getKilometersFromMiles(txtFieldValue);
        String formattedResult = String.format("%.2f", result);
        lblMilesToKmResult.setText(formattedResult + " km");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        TextInputDialog dialog = new TextInputDialog("");

        dialog.setTitle("Name Input");
        dialog.setHeaderText("Welcome to the Number Conversion App");
        dialog.setContentText("Please enter your name:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()){
            String message = model.getGreetingsMessage(result.get());
            lblWelcomeText.setText(message);
        }
    }
}
