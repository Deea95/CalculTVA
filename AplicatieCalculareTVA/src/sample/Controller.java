package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    // Declararea variabilelor aplicatiei:

    @FXML
    private TextField txtSumafaraTVA;

    @FXML
    private Label lblTVA;

    @FXML
    private Label lblSumacuTVA;

    @FXML
    private void lblTVA (MouseEvent ev){
        lblTVA.setOnMouseClicked(e->{
            lblTVA.setText("" + Integer.parseInt(txtSumafaraTVA.getText()) *19/100);
        });
    }

    @FXML
    private void lblSumacuTVA (MouseEvent ev){
        lblSumacuTVA.setOnMouseClicked(e->{
            lblSumacuTVA.setText(Integer.parseInt(lblTVA.getText()) + Integer.parseInt(txtSumafaraTVA.getText()) + "");
        });
    } // Aplicatia propriu-zisa:






    @Override
    public void initialize(URL location, ResourceBundle resources) { }
}
