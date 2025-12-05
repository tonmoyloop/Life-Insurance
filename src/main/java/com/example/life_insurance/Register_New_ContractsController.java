package com.example.life_insurance;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class Register_New_ContractsController
{
    @javafx.fxml.FXML
    private TextField txtPartner;
    @javafx.fxml.FXML
    private Label lblMessage;
    @javafx.fxml.FXML
    private TableColumn<RegisterContractsCls,Float> colAmount;
    @javafx.fxml.FXML
    private DatePicker dpStart;
    @javafx.fxml.FXML
    private Button btnSave;
    @javafx.fxml.FXML
    private TableView<RegisterContractsCls> tblContracts;
    @javafx.fxml.FXML
    private TableColumn<RegisterContractsCls, LocalDate> colEnd;
    @javafx.fxml.FXML
    private TextField txtAmount;
    @javafx.fxml.FXML
    private TableColumn<RegisterContractsCls, LocalDate> colStart;
    @javafx.fxml.FXML
    private DatePicker dpEnd;
    @javafx.fxml.FXML
    private TableColumn<RegisterContractsCls, String> colPartner;

    @javafx.fxml.FXML
    public void initialize() {
        colPartner.setCellValueFactory(new PropertyValueFactory<>("companyName"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colStart.setCellValueFactory(new PropertyValueFactory<>("startDate"));
        colEnd.setCellValueFactory(new PropertyValueFactory<>("endDate"));
    }
    ArrayList<RegisterContractsCls>regcontractlist=new ArrayList<>();

    @javafx.fxml.FXML
    public void btnSaveOnAction(ActionEvent actionEvent) {
        if (txtPartner.getText().trim().isEmpty()){
            lblMessage.setText("Please Enter Company");
            return;
        }if (txtAmount.getText().trim().isEmpty()){
            lblMessage.setText("Please Enter Amount");
            return;
        }if (dpStart.getValue()==null){
            lblMessage.setText("Please Select An Option");
            return;
        }if (dpEnd.getValue()==null) {
            lblMessage.setText("Please Select An Option");
            return;

        }
        String companyName = txtPartner.getText();
        Float amount=Float.parseFloat(txtAmount.getText());
        LocalDate startDate=dpStart.getValue();
        LocalDate endDate=dpEnd.getValue();

        RegisterContractsCls rcc = new RegisterContractsCls(companyName,amount,startDate,endDate);
        regcontractlist.add(rcc);
        lblMessage.setText("Request Submitted.");
        tblContracts.getItems().clear();
        tblContracts.getItems().addAll(regcontractlist);

    }
}