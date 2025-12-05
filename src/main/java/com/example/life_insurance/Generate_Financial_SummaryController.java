package com.example.life_insurance;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class Generate_Financial_SummaryController
{
    @javafx.fxml.FXML
    private Button generateButton;
    @javafx.fxml.FXML
    private TableView<GenerateSummaryCls> summaryTable;
    @javafx.fxml.FXML
    private TableColumn<GenerateSummaryCls,Float> colExp;
    @javafx.fxml.FXML
    private TableColumn<GenerateSummaryCls,Float> colNet;
    @javafx.fxml.FXML
    private TableColumn<GenerateSummaryCls,String> colCat;
    @javafx.fxml.FXML
    private TableColumn<GenerateSummaryCls,Float> colRev;
    @javafx.fxml.FXML
    private TextArea detailsArea;
    @javafx.fxml.FXML
    private ComboBox<String> ReportinfPComboBox;
    @javafx.fxml.FXML
    private TextField RevenueTf;
    @javafx.fxml.FXML
    private TextField NetTf;
    @javafx.fxml.FXML
    private TextField ExpenseTf;

    @javafx.fxml.FXML
    public void initialize() {
        ReportinfPComboBox.getItems().addAll("Month","Quarter","Year");
        colCat.setCellValueFactory(new PropertyValueFactory<>("reportingperiod"));
        colExp.setCellValueFactory(new PropertyValueFactory<>("expense"));
        colNet.setCellValueFactory(new PropertyValueFactory<>("net"));
        colRev.setCellValueFactory(new PropertyValueFactory<>("revenue"));
    }
ArrayList<GenerateSummaryCls>generateSumlist=new ArrayList<>();
    @javafx.fxml.FXML
    public void generateButtonOnAction(ActionEvent actionEvent) {
        if (RevenueTf.getText().trim().isEmpty()){
            detailsArea.setText("Please Enter Revenue");
        }if (ExpenseTf.getText().trim().isEmpty()){
            detailsArea.setText("Please Enter Expense");
        }if (NetTf.getText().trim().isEmpty()){
            detailsArea.setText("Please Enter Net");
            return;
        }if (ReportinfPComboBox.getValue()==null){
            detailsArea.setText("Please select an Option");
            return;
        }
        String reportingperiod=ReportinfPComboBox.getValue();
        Float revenue=Float.parseFloat(RevenueTf.getText());
        Float expense=Float.parseFloat(ExpenseTf.getText());
        Float net=Float.parseFloat(NetTf.getText());

        GenerateSummaryCls gsc=new GenerateSummaryCls(reportingperiod,revenue,expense,net);
        generateSumlist.add(gsc);
        detailsArea.setText("Submitted");
        summaryTable.getItems().clear();
        summaryTable.getItems().addAll(generateSumlist);
    }
}