package alquilervehiculos;

import java.util.ArrayList;
import java.util.List;

public class AlquilerVehiculos {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Auto("Auto1", "Modelo1", 50));
        vehiculos.add(new Moto("Moto1", "Modelo1", 30));

        for (Vehiculo v : vehiculos) {
            double costo = v.calcularCostoAlquiler(5);
            System.out.println(v.getMarca() + " " + v.getModelo() + " - Costo 5 dias: " + costo);
        }
    }
}
