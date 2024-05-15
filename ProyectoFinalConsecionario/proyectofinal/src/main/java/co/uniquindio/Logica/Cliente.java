package co.uniquindio.Logica;

import java.time.LocalDate;

public class Cliente extends Persona {

    private String id;

    public Cliente(String nombre, String apellido, LocalDate date, String id) {
        super(nombre, apellido, date);

        this.id = id;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static ClienteBuilder builder() {
        return new ClienteBuilder();
    }

    @Override
    public String toString() {
        return super.toString() + "Cliente [cargo=" + "ID=" + id + "]";
    }

}
