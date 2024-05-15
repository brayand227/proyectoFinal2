package co.uniquindio.Logica;

public interface Vehiculo {

    void start();

    void stop();

    String getTipo();

    double getValor();

    public void setPlaca(String id);

    void setValor(double precio);

}
