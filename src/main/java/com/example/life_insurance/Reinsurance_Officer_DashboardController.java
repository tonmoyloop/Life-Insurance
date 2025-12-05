package com.example.life_insurance;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Reinsurance_Officer_DashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void registerOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(" Reinsurance Officer/Analyze_Loss_Ratios.fxml"));
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
    public void treatyCompilanceOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(" Reinsurance Officer/Update_Treaty_Terms.fxml"));
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
    public void reportsOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(" Reinsurance Officer/Update_Claim_Settlement_Records.fxml"));
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
    public void newContractOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(" Reinsurance Officer/Register_New_Contracts.fxml"));
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
    public void renewalOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(" Reinsurance Officer/Monitor_Risk_Exposure.fxml"));
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
    public void recoverablesOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(" Reinsurance Officer/Manage_Renewal_Notifications.fxml"));
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
    public void settelmentOnClicl(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(" Reinsurance Officer/Review_Partner_Commission.fxml"));
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
    public void contractPerformanceOnClick(ActionEvent actionEvent) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(" Reinsurance Officer/Track_Contract_Performance.fxml"));
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