package lk.itsei.fx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import lk.itsei.fx.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRegistrationFormController {

    @FXML
    private Button btnSave;

    @FXML
    private TextField txtCustomerID;

    @FXML
    private TextField txtCustomerName;

    @FXML
    private TextField textCustomerAddress;

    @FXML
    private TextField txtCustomerID_1;

    @FXML
    private Button btnSearch;

    @FXML
    private TextField txtCustomerName_1;

    @FXML
    private TextField txtCustomerAddress_1;

    @FXML
    private Label lblLable;


    List<Customer> customerList = new ArrayList<Customer>();



    @FXML
    void saveClick_OnAction(ActionEvent event) {
        if (customerList.size() < 3) {
            if (customerList.size()!=0) {
                for (Customer c : customerList) {
                    if (c.getName().equals(txtCustomerID.getText())){
                        System.out.println("This Customer Use");
                        return;
                    }
                }
                customerList.add(
                        new Customer(
                                txtCustomerID.getText(),
                                txtCustomerName.getText(),
                                textCustomerAddress.getText()
                        )
                );
                System.out.println("Add Customer");
                return;
            }
            customerList.add(
                    new Customer(
                            txtCustomerID.getText(),
                            txtCustomerName.getText(),
                            textCustomerAddress.getText()
                    )
            );
            System.out.println("Add Customer Empty List");
        } else {
            System.out.println("Not Working..");
        }

    }

    @FXML
    void searchClick_OnAction(ActionEvent event) {

        for (int i =0; i < customerList.size(); i++) {

            txtCustomerID_1.setText(customerList.get(i).getCustomerId());
            txtCustomerName_1.setText(customerList.get(i).getName());
            txtCustomerAddress_1.setText(customerList.get(i).getAddress());
        }
    }

}
