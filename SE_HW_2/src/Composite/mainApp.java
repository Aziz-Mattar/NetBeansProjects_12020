/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
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
    private Label label;
    private TextArea textArea;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);        
        label = new Label("Composite DP  ");
        VBox vBox1 = new VBox();
        vBox1.setSpacing(10);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.getChildren().addAll(label);
        
        buttonShow = new Button("Show");
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
        VBox vBox2 = new VBox();
        vBox2.setSpacing(10);
        vBox2.setAlignment(Pos.CENTER);        
        vBox2.getChildren().addAll(textArea,hBox1);
        
        pane.getChildren().addAll(vBox1,vBox2);        
        Scene scene = new Scene(pane, 550,300);
        //scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Composite Design Pattern");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        
    }
    private class MyEventHandler implements EventHandler<ActionEvent>{
        
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == buttonShow){
                
                account a1 = new account(1, "AAA");
                account a2 = new account(2, "BBB");
                account a3 = new account(3, "CCC");
                account a4 = new account(4, "DDD");
                account a5 = new account(5, "EEE");
                account a6 = new account(6, "FFF");
                account a7 = new account(7, "GGG");
                                                
                a2.add(a4);
                a2.add(a5);
                a1.add(a2);
                a3.add(a6);
                a3.add(a7);
                a1.add(a3);

               
               textArea.appendText(a1.toString() +"\n");
               a1.getAccount()
                       .stream()
                       .forEach(abc -> { 
                           textArea.appendText(abc+"\n");
                           abc.getAccount()
                                   .stream()
                                   .forEach(def->
                                           textArea.appendText(def.toString()+"\n"));
                       });
               
            }
            else if(event.getSource() == buttonClear){
                textArea.setText("");
            }
        }        
    }    
}
