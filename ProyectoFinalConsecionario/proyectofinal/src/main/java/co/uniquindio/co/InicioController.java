/**
 * Sample Skeleton for 'inicio.fxml' Controller Class
 */

package co.uniquindio.co;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

public class InicioController {

    @FXML // fx:id="btregistrado"
    private Button btregistrado; // Value injected by FXMLLoader

    @FXML // fx:id="btregistrarse"
    private Button btregistrarse; // Value injected by FXMLLoader
    @FXML
    private Button btRegresar;

    @FXML
    void Regresar(ActionEvent event) throws IOException {

        App.setRoot("principal");

    }

    @FXML
    void Registrado(ActionEvent event) throws IOException {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("VENTANA DE EMPLEADO");
        alert.setHeaderText(null);
        alert.setContentText("VENTANA EN ESPERA  ");
        alert.showAndWait();

    }

    @FXML
    void Registrar(ActionEvent event) throws IOException {
        App.setRoot("registrarse");

    }

}
