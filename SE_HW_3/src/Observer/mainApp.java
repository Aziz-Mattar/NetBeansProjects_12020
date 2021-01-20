/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author aashgar
 */
public class mainApp extends Application{  
    private Subject subject = new Subject();
    private JD_Observer jD_Observer;
    private Euro_Observer euro_Observer;
    private USD_Observer uSD_Observer;
    @Override
    public void start(Stage primaryStage) throws Exception {
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(10);         
       
        HBox hBox = new HBox();
        hBox.setSpacing(20);
        hBox.setAlignment(Pos.CENTER);
        
        jD_Observer = new JD_Observer(subject);
        euro_Observer = new Euro_Observer(subject);
        uSD_Observer = new USD_Observer(subject);
        hBox.getChildren().addAll(jD_Observer, uSD_Observer,euro_Observer);
        
        pane.getChildren().addAll(hBox);        
        Scene scene = new Scene(pane, 550,300);
        //scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("Obsever Design Pattern");
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
        
    }
  
}
