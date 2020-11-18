package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private Label label1;
    @FXML
    private Label label2;
    @FXML
    private Button button;
    @FXML
    private TextField text1;
    @FXML
    private TextField text2;

    @FXML
    public void doConvertion (MouseEvent event){
        double yen = 0;
        CurrencyConverter conv = new CurrencyConverter();

        yen = conv.euroToYen(Double.parseDouble(text1.getText()));

        text2.setText(String.valueOf(yen));
    }
}
