/**
 * Sample Skeleton for 'principal.fxml' Controller Class
 */

package co.uniquindio.co;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class PrincipalController implements Initializable {

    @FXML // fx:id="btsiguiente"
    private Button btsiguiente; // Value injected by FXMLLoader

    @FXML // fx:id="cxOpciones"
    private ComboBox<String> cxOpciones; // Value injected by FXMLLoader

    @FXML
    void Siguiente(ActionEvent event) throws IOException {
        String n = cxOpciones.getValue();
        if (n.equals("Cliente")) {
            App.setRoot("inicio");

        } else if (n.equals("Administrador")) {
            App.setRoot("menu");

        } else {
            RegistrarseController.Imprimir("VENTANA EN ESPERA", "VENTANA EN CREACION");

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Agregar las opciones al ComboBox
        cxOpciones.getItems().addAll("Cliente", "Empleado", "Administrador");
    }

}
