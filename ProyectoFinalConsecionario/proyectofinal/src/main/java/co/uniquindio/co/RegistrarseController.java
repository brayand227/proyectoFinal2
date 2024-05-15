package co.uniquindio.co;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import co.uniquindio.Logica.Cliente;

import co.uniquindio.Logica.Consecionario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class RegistrarseController {
    private Cliente cliente;
    private Consecionario consecionario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker Calendar;

    @FXML
    private TextField Txapellido;

    @FXML
    private TextField Txcodigo;

    @FXML
    private TextField Txnombre;

    @FXML
    private Button btregresar;

    @FXML
    private Button btsiguiente;

    @FXML
    void Regresar(ActionEvent event) throws IOException {
        App.setRoot("inicio");

    }

    @FXML
    public void Siguiente(ActionEvent event) {
        consecionario = Consecionario.getConsecionario();
        String nombre = Txnombre.getText();
        String apellido = Txapellido.getText();
        LocalDate localDate = Calendar.getValue();

        String id = Txcodigo.getText();
        if (nombre.isEmpty() | apellido.isEmpty() | localDate == null | id.isEmpty()) {
            Imprimir("TEXTOS VACIOS", "LOS ESPACIOS SON OBLIGATORIOS");
        } else {
            consecionario.agregarCliente(nombre, apellido, localDate, id);
            Imprimir("TAMAÑO LISTA", consecionario.getClientes().size() + "");
        }

    }

    public static void Imprimir(String titulo, String mensaje) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

}
