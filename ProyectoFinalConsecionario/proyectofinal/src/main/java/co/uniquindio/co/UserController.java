package co.uniquindio.co;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UserController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField Password;

    @FXML
    private Button btSesion;

    @FXML
    private Button btVolver;

    @FXML
    private TextField txUser;

    @FXML
    void Iniciar(ActionEvent event) {

    }

    @FXML
    void Volver(ActionEvent event) throws IOException {
        App.setRoot("registrarUsuario");

    }

    @FXML
    void initialize() {
    }

}
