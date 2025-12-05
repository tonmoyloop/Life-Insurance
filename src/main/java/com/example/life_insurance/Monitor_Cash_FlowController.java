package com.example.life_insurance;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Monitor_Cash_FlowController
{
    @javafx.fxml.FXML
    private TextArea detailsBox;
    @javafx.fxml.FXML
    private Button calcButton;
    @javafx.fxml.FXML
    private ComboBox<String> dateRangeCBox;
    @javafx.fxml.FXML
    private ComboBox<String> typeCBox;
    @javafx.fxml.FXML
    private TextField amountTf;

    @javafx.fxml.FXML
    public void initialize() {
        dateRangeCBox.getItems().addAll("Daily", "Weekly", "Monthly");
        typeCBox.getItems().addAll("Inflow","Outflow");
    }


    @javafx.fxml.FXML
    public void submitButtonOnAction(ActionEvent actionEvent) {
        if (dateRangeCBox.getValue() == null) {
            detailsBox.setText("Please select an Option.");
            return;
        }
        if (typeCBox.getValue() == null) {
            detailsBox.setText("Please select an Option.");
            return;
        }
        if (amountTf.getText().trim().isEmpty()){
            detailsBox.setText("Please enter amount");
            return;
        }

        Float amount =Float.parseFloat(amountTf.getText());
        String dateRange =dateRangeCBox.getValue();
        String paymentType =typeCBox.getValue();

        MonitorCashFlowCls mcf = new MonitorCashFlowCls(dateRange,paymentType,amount);
        detailsBox.setText(mcf.toString());
    }
}