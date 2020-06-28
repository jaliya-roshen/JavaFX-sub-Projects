package lk.itsei.fx.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lk.itsei.fx.model.Customer;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class LoginFormController implements Initializable {

    @FXML
    private TextField txtUserName;

    @FXML
    private PasswordField txtPassWord;

    @FXML
    private Button btnLogIn;


    public static ArrayList<Customer> list;

    public LoginFormController() {
    }

    public LoginFormController(ArrayList<Customer> con_array_customer) {
        list = con_array_customer;

    }

    @FXML
    void LoginAction(ActionEvent event) throws IOException {

        String user = txtUserName.getText();
        String passWord = txtPassWord.getText();

        for (Customer c : list) {

            if (user.equals(c.getName()) && passWord.equals(c.getPassword())) {

                new Alert(Alert.AlertType.CONFIRMATION, "Sucessfully Login", ButtonType.OK).show();

                FXMLLoader loader = new FXMLLoader(getClass().getResource("/lk/itsei/fx/view/DashBoardForm.fxml"));
                Parent root = loader.load();
                DashBoardFormController dashboard = loader.getController();
                dashboard.setText(txtUserName.getText());
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.show();


            } else {

                new Alert(Alert.AlertType.ERROR, "Fail to Login", ButtonType.OK).show();

            }
        }
    }

    @FXML
    void btnSingUp(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/lk/itsei/fx/view/SignUpForm.fxml"));
        Scene scene = new Scene(root);
        Stage primartyStage = (Stage) txtPassWord.getScene().getWindow();
        primartyStage.setScene(scene);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }


}
