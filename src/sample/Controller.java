package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


import java.awt.*;
import java.awt.event.ActionListener;

public class Controller
{
    @FXML
    private TextField textField;
    @FXML
    private TextArea textArea;



    @FXML
    public <keyPress> void sendMessage(ActionEvent actionEvent)
    {
    textArea.appendText(textField.getText() + "\n");
    textField.setText("");
    textField.requestFocus();
    }
}
