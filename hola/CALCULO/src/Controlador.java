import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controlador {

    @FXML
    private Button Calculo;

    @FXML
    private TextField primerValor;

    @FXML
    private TextField resultado;

    @FXML
    private Button salir;

    @FXML
    private TextField segundoValor;

    @FXML
    void Calculo(ActionEvent event) {
        float pv= Float.parseFloat(primerValor.getText().toString());
        float sv= Float.parseFloat(segundoValor.getText().toString());
        float suma =pv+ sv;
       resultado.setText(""+suma);


    }

    @FXML
    void salir(ActionEvent event) {
        System.exit(0);
    }

}
