package lk.itsei.fx.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import lk.itsei.fx.model.LoginForm;

import java.net.URL;
import java.util.ResourceBundle;

public class DashBoardFormController implements Initializable {

    @FXML
    private Label lblUserName;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void setText(String text){
        lblUserName.setText(text);
    }
}
