/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

import java.time.format.DateTimeFormatter;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
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
    private Button buttonShow, buttonClear;
    private TextField textFieldName, textFieldAddress, textFieldAccountNumber;
    private TextArea textArea;
    private DatePicker DOB;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);        
        textFieldName = new TextField();
        textFieldName.setMinWidth(20);
        textFieldName.setPromptText("Name");
        textFieldAddress = new TextField();
        textFieldAddress.setMinWidth(20);
        textFieldAddress.setPromptText("Address");
        textFieldAccountNumber = new TextField();
        textFieldAccountNumber.setMinWidth(20);
        textFieldAccountNumber.setPromptText("Account Number");
        DOB = new DatePicker();
        DOB.setMinWidth(20);
        DOB.setPromptText("Date of Birth");
        VBox vBox1 = new VBox();
        vBox1.setSpacing(10);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.getChildren().addAll(textFieldName, textFieldAddress, textFieldAccountNumber,DOB);
        
        buttonShow = new Button("View");
        buttonClear = new Button("Clear");
        HBox hBox1 = new HBox();
        hBox1.setSpacing(10);
        hBox1.setAlignment(Pos.CENTER);
        hBox1.getChildren().addAll(buttonShow, buttonClear);
        MyEventHandler myEventHandler = new MyEventHandler();
        buttonShow.setOnAction(myEventHandler);
        buttonClear.setOnAction(myEventHandler);
        textArea = new TextArea();
        textArea.setMaxWidth(300);
        textArea.setMaxHeight(150);

        VBox vBox2 = new VBox();
        vBox2.setSpacing(10);
        vBox2.setAlignment(Pos.CENTER);        
        vBox2.getChildren().addAll(textArea,hBox1);
        
        pane.getChildren().addAll(vBox1,vBox2);        
        Scene scene = new Scene(pane, 550,400);
        //scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("MVC Design Pattern");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        
    }
    private class MyEventHandler implements EventHandler<ActionEvent>{
        
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == buttonShow){
              Customer customer = new Customer(textFieldName.getText(),textFieldAddress.getText(),DOB.getValue().toString(),textFieldAccountNumber.getText());
              /*customer.setName(textFieldName.getText());
              customer.setAddress(textFieldAddress.getText());
              customer.setAccountNumber(textFieldAccountNumber.getText());
              customer.setDOB(DOB.getValue().toString());*/
              CustomerController customerController = new CustomerController(customer,new CustomerView()); 
              
              textArea.setText(customerController.updateView());

            }
            else if(event.getSource() == buttonClear){
               textArea.setText("");
            }
        }        
    }    
}
