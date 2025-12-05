package com.example.life_insurance;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class User_can_Record_Daily_TransactionsController
{
    @javafx.fxml.FXML
    private TableColumn<RecordDailyTransactionsCls,Float> colAmount;
    @javafx.fxml.FXML
    private TableColumn<RecordDailyTransactionsCls,String> colName;
    @javafx.fxml.FXML
    private DatePicker paymentDP;
    @javafx.fxml.FXML
    private Button recordButton;
    @javafx.fxml.FXML
    private TextField amountInput;
    @javafx.fxml.FXML
    private TableColumn<RecordDailyTransactionsCls, LocalDate> colDate;
    @javafx.fxml.FXML
    private TableView<RecordDailyTransactionsCls> transTable;
    @javafx.fxml.FXML
    private TextField nameInput;
    @javafx.fxml.FXML
    private TableColumn<RecordDailyTransactionsCls,String> colStatus;
    @javafx.fxml.FXML
    private Label OutputLabel;
    @javafx.fxml.FXML
    private RadioButton yesRB;
    @javafx.fxml.FXML
    private RadioButton NoRB;
    @javafx.fxml.FXML
    private ToggleGroup TransactionRB;

    @javafx.fxml.FXML
    public void initialize() throws IOException {
        colName.setCellValueFactory(new PropertyValueFactory<>("policyholdername"));
        colAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
        colDate.setCellValueFactory(new PropertyValueFactory<>("paymentdate"));
        colStatus.setCellValueFactory(new PropertyValueFactory<>("status"));

        File file=new File("recordtransactions.bin");

        if (!file.exists()){
            return;
        }
        FileInputStream fis= new FileInputStream(file);
        ObjectInputStream ois= new ObjectInputStream(fis);

        try {
            while (true){
                RecordDailyTransactionsCls recordtransactions=(RecordDailyTransactionsCls) ois.readObject();
                transactionlist.add(recordtransactions);
            }
        }catch (EOFException eof){
            System.out.println("End of file reached");
        }catch (ClassNotFoundException cnf){
            System.out.println("Class not found");
        }
        transTable.getItems().addAll(transactionlist);

    }

    ArrayList<RecordDailyTransactionsCls>transactionlist=new ArrayList<>();
    @javafx.fxml.FXML
    public void recordButton(ActionEvent actionEvent) throws IOException{
        if (nameInput.getText().trim().isEmpty()){
            OutputLabel.setText("Please Enter Name");
            return;
        }if (amountInput.getText().trim().isEmpty()){
            OutputLabel.setText("Please Enter Amount");
            return;
        }if (paymentDP.getValue()==null){
            OutputLabel.setText("Please Select An Option");
            return;
        }
        String policyholdername=nameInput.getText();
        Float amount=Float.parseFloat(amountInput.getText());
        LocalDate paymentdate=paymentDP.getValue();

        String status;
        if (yesRB.isSelected()){
            status="Yes";
        }else if (NoRB.isSelected()){
            status="No";
        }else {
            OutputLabel.setText("Please Select An Option");
            return;
        }
        RecordDailyTransactionsCls rdt=new RecordDailyTransactionsCls(policyholdername,amount,paymentdate,status);
        File file = new File("recordtransactions.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        if (file.exists()){
            fos = new FileOutputStream(file, true);
            oos = new AppendableObjectOutputStream(fos);
        }else {
            fos = new FileOutputStream(file, true);
            oos = new ObjectOutputStream(fos);
        }

        oos.writeObject(rdt);
        oos.close();
        transactionlist.add(rdt);
        OutputLabel.setText("Transactions Record");
        transTable.getItems().clear();
        transTable.getItems().addAll(transactionlist);
    }

}