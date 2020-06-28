package lk.itsei.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.itsei.fx.model.Customer;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class SignUpFormController {
    @FXML
    private AnchorPane rootpane;

    @FXML
    private TextField txtUsername;

    @FXML
    private PasswordField txtPassWord;

    @FXML
    private PasswordField txtConfirmPassWord;

    @FXML
    private Button btnSignUp;

    @FXML
    private Button btnClose;

    public ArrayList<Customer> customerArrayList = new ArrayList<>();


    @FXML
    void CloseButton(ActionEvent event) {

    }


    @FXML
    void SignInAction(ActionEvent event) throws IOException {
//        for (Customer customer :customerArrayList){
//            System.out.println(customer.toString());
//        }
        new LoginFormController(customerArrayList);

        Parent root = FXMLLoader.load(this.getClass().getResource("/lk/itsei/fx/view/LoginForm.fxml"));
        Scene scene = new Scene(root);
        Stage primartyStage = (Stage) txtPassWord.getScene().getWindow();
        primartyStage.setScene(scene);


    }

    @FXML
    void SignUpAction(ActionEvent event) {


        String user_name = txtUsername.getText();
        String pass_word = txtPassWord.getText();
        String confirm_pass = txtConfirmPassWord.getText();

        if (pass_word.equals(confirm_pass)) {
            Customer customer = new Customer(
                    txtUsername.getText(),
                    txtPassWord.getText(),
                    txtConfirmPassWord.getText());

            customerArrayList.add(customer);
            new Alert(Alert.AlertType.CONFIRMATION, "Customer Registration Sucessfully", ButtonType.OK).show();

            txtUsername.setText(user_name);
            txtPassWord.setText(pass_word);
            txtConfirmPassWord.setText(confirm_pass);

            System.out.println(customerArrayList);

        } else {

            System.out.println("Fail To Login");
        }

    }


    public ArrayList<Customer> getArrayList() {

        return customerArrayList;
    }

}





