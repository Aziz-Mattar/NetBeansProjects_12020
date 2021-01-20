
package Observer;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class JD_Observer extends VBox implements Observer{
    private TextField textField;
    private Button button;
    private Subject subject;

    public JD_Observer(Subject subject) {
        textField = new TextField();
        textField.setPromptText("JD Observer");
        button = new Button("Update");
        setAlignment(Pos.CENTER);
        setSpacing(10);
        button.setOnAction(e->{
            this.subject.setBalance(Double.parseDouble(textField.getText()));
        });
        getChildren().addAll(textField, button);
        this.subject = subject;
        this.subject.attach(this);
    }
    
    public void show() {
            textField.setText(String.valueOf(subject.getBalance()*0.25));
	}
    
}