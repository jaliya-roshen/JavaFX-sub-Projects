package lk.itsei.fx.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

public class MainFormsController {

    @FXML
    private JFXTextField txtinput;

    @FXML
    private JFXButton btnClickMe;

    @FXML
    private ColorPicker clrpicker;

    @FXML
    private Label lblOutput;

    @FXML
    void btnClickMe(ActionEvent event) {
        String text = txtinput.getText();
        lblOutput.setText(text);
    }

    @FXML
    void clrPickerClick(ActionEvent event) {

        Color color = clrpicker.getValue();
        lblOutput.setTextFill(color);

    }


    @FXML
    void txtInput_KeyRelease(KeyEvent event) {
        lblOutput.setText(txtinput.getText());
    }


}

