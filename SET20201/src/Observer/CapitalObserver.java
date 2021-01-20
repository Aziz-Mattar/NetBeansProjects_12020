/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author aashgar
 */
public class CapitalObserver extends VBox implements Observer{
    private TextField textField;
    private Button button;
    private Subject subject;

    public CapitalObserver(Subject subject) {
        textField = new TextField();
        textField.setPromptText("Small Observer");
        button = new Button("Update");
        setAlignment(Pos.CENTER);
        setSpacing(10);
        button.setOnAction(e->{
            this.subject.setData(textField.getText());
        });
        getChildren().addAll(textField, button);
        this.subject = subject;
        this.subject.attach(this);
    }
    
    @Override
    public void update() {
        textField.setText(this.subject.getData().toUpperCase());
    }
    
}

