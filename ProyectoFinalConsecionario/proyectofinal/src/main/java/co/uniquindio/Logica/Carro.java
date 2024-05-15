package co.uniquindio.Logica;

public class Carro implements Vehiculo {
    private String tipo;
    private double valor;
    private String placa;

    public Carro() {
        tipo = "CARRO";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public void start() {
        System.out.println("INICIANDO MOTOR DE CARRO");
    }

    @Override
    public void stop() {
        System.out.println("APAGANDO MOTOR DE CARRO");
    }

    @Override
    public void setValor(double precio) {
        valor = precio;
    }

}
