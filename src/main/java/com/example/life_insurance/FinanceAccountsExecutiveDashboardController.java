package com.example.life_insurance;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FinanceAccountsExecutiveDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void payrollManagementOnclick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Finance_&_Accounts_Executive/Monitor_Cash_Flow.fxml"));
            Scene scene  = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Welcome");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void bankReconciliationOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Finance_&_Accounts_Executive/Manage_Investment_Records.fxml"));
            Scene scene  = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Welcome");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void trackClaimsOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Finance_&_Accounts_Executive/Track_Expense_Claims.fxml"));
            Scene scene  = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Welcome");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }

    }

    @javafx.fxml.FXML
    public void expenseClaimsOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Finance_&_Accounts_Executive/Reconcile_Bank_Statements.fxml"));
            Scene scene  = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Welcome");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void financialStatOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Finance_&_Accounts_Executive/Process_Commission_Payments.fxml"));
            Scene scene  = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Welcome");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void transactionEntryOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Finance_&_Accounts_Executive/User_can_Record_Daily_Transactions.fxml"));
            Scene scene  = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Welcome");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void yearEndSumOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Finance_&_Accounts_Executive/Generate_Financial_Summary.fxml"));
            Scene scene  = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Welcome");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }

    @javafx.fxml.FXML
    public void budgetReportsOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Finance_&_Accounts_Executive/Process_Claims_Payments.fxml"));
            Scene scene  = new Scene(fxmlLoader.load());
            Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            nextStage.setTitle("Welcome");
            nextStage.setScene(scene);
            nextStage.show();
        }
        catch (Exception e){
            //
        }
    }
}