package co.uniquindio.Logica;

public class VehiculoFactory {

    public Vehiculo creVehiculo(String tipo) {

        switch (tipo.toLowerCase()) {
            case "carro":
                return new Carro();

            case "camioneta":
                return new Camioneta();
        }

        return null;
    }

}
