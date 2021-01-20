/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class mainApp extends Application{
    private Button buttonAdd, buttonShow, buttonClear;
    private TextField textFieldCustomer, textFieldAccount;
    private TextArea textArea;
    private accountsDecorator customer=null, account=null;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);        
        textFieldCustomer = new TextField();
        textFieldCustomer.setMinWidth(20);
        textFieldCustomer.setPromptText("Customer");
        textFieldAccount = new TextField();
        textFieldAccount.setMinWidth(20);
        textFieldAccount.setPromptText("Account");       
        VBox vBox1 = new VBox();
        vBox1.setSpacing(10);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.getChildren().addAll(textFieldCustomer, textFieldAccount);
        
        buttonAdd = new Button("Add");
        buttonShow = new Button("Show");
        buttonClear = new Button("Clear");
        HBox hBox1 = new HBox();
        hBox1.setSpacing(10);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().addAll(buttonAdd,buttonShow, buttonClear);
        MyEventHandler myEventHandler = new MyEventHandler();
        buttonAdd.setOnAction(myEventHandler);
        buttonShow.setOnAction(myEventHandler);
        buttonClear.setOnAction(myEventHandler);
        textArea = new TextArea();
        textArea.setMaxWidth(300);
        VBox vBox2 = new VBox();
        vBox2.setSpacing(10);
        vBox2.setAlignment(Pos.CENTER);        
        vBox2.getChildren().addAll(textArea,hBox1);
        
        pane.getChildren().addAll(vBox1,vBox2);        
        Scene scene = new Scene(pane, 550,300);
        //scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Decorator Design Pattern");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        
    }
    private class MyEventHandler implements EventHandler<ActionEvent>{
        
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == buttonAdd){
               if(customer == null)
                   customer = new customer(textFieldCustomer.getText());
               if(account == null){
                   account = new Checking();
                   account.addAccounts(customer);
               }
               else if(textFieldAccount.getText().equalsIgnoreCase("s")){
                   accountsDecorator newAccount = new Saving();
                   newAccount.addAccounts(account);
                   account = newAccount;
               }
               else if(textFieldAccount.getText().equalsIgnoreCase("c")){
                   accountsDecorator newAccount = new Checking();
                   newAccount.addAccounts(account);
                   account = newAccount;
               }
               else if(textFieldAccount.getText().equalsIgnoreCase("m")){
                   accountsDecorator newAccount = new Merchant();
                   newAccount.addAccounts(account);
                   account = newAccount;
               }
               textFieldAccount.setText("");
            }
            else if(event.getSource() == buttonShow){
                if(account != null)
                    textArea.setText(account.getBalance());
            }
            else if(event.getSource() == buttonClear){
                textArea.setText("");
            }
        }        
    }    
}
