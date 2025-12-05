package com.example.life_insurance;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Process_Commission_PaymentsController
{
    @javafx.fxml.FXML
    private TextField agentInput;
    @javafx.fxml.FXML
    private RadioButton rejRB;
    @javafx.fxml.FXML
    private RadioButton appRB;
    @javafx.fxml.FXML
    private ToggleGroup statusRB;
    @javafx.fxml.FXML
    private TextField salesDataTF;
    @javafx.fxml.FXML
    private Button saveButton;
    @javafx.fxml.FXML
    private TextField commissionAmountTF;
    @javafx.fxml.FXML
    private TextArea dataTextarea;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void saveButtonOnAction(ActionEvent actionEvent) {
        if (agentInput.getText().trim().isEmpty()){
            dataTextarea.setText("Please enter agent name");
            return;
        }
        if (salesDataTF.getText().trim().isEmpty()){
            dataTextarea.setText("Please enter sales data");
            return;
        }
        if (commissionAmountTF.getText().trim().isEmpty()){
            dataTextarea.setText("Please enter amount");
            return;
        }

        String status;
        if (appRB.isSelected()){
            status="Approved";
        }else if (rejRB.isSelected()){
            status="Rejected";
        }else {
            dataTextarea.setText("Please Select An Option");
            return;
        }
        Float salesData =Float.parseFloat(salesDataTF.getText());
        Float commissionAmount =Float.parseFloat(commissionAmountTF.getText());
        String agentName =agentInput.getText();

        processCommissionPayCls pCP = new processCommissionPayCls(salesData,agentName,commissionAmount,status);
        dataTextarea.setText(pCP.toString());

    }
}