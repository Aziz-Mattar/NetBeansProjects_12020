/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import javafx.application.Application;
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
public class MainApp extends Application{
    private Button buttonShow, buttonClear;
    private TextField textField1, textField2;
    private TextArea textArea;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);        
        textField1 = new TextField();
        textField1.setMinWidth(20);
        textField1.setPromptText("Input 1");
        textField2 = new TextField();
        textField2.setMinWidth(20);
        textField2.setPromptText("Input 2");
        VBox vBox1 = new VBox();
        vBox1.setSpacing(10);
        vBox1.setAlignment(Pos.CENTER);
        vBox1.getChildren().addAll(textField1, textField2);
        
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
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Facade Design Pattern");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        
    }
    private class MyEventHandler implements EventHandler<ActionEvent>{
        
        @Override
        public void handle(ActionEvent event) {
            if(event.getSource() == buttonShow){
                StudentMaker studentMaker = StudentMaker.getStudentMaker();
                if(textField1.getText().equalsIgnoreCase("it"))
                     textArea.appendText("\n"+ studentMaker.showItStudent() );
                else if (textField1.getText().equalsIgnoreCase("eng"))
                        textArea.appendText("\n"+ studentMaker.showEngStudent());
                else if(textField1.getText().equalsIgnoreCase("art"))
                    textArea.appendText("\n"+ studentMaker.showArStudent());
                   
            }
            else if(event.getSource() == buttonClear){
                textArea.setText("");
            }
        }        
    }    
}
