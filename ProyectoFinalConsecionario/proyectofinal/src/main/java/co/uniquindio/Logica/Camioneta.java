package co.uniquindio.Logica;

public class Camioneta implements Vehiculo {

    private String tipo;
    private double valor;
    private String Placa;

    public Camioneta() {

        this.tipo = "CAMIONETA";

    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public void setValor(double n) {
        valor = n;

    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void start() {

        System.out.println("Camioneta Encendida");

    }

    @Override
    public void stop() {
        System.out.println("Camioneta Apagada");

    }

}
