package co.uniquindio.Logica;

public abstract class VentaVehiculo implements Venta {
    @Override
    public double venta(Vehiculo vehiculo) {
        double venta = CalcularPrecio(vehiculo);
        return venta;

    }

    abstract double CalcularPrecio(Vehiculo vehiculo);

}
