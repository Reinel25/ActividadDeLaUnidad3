package Ejercicio4;


public class Main {
    public static void main(String[] args) {
        Vehiculo miVehiculo;

        miVehiculo = new Carro();
        miVehiculo.mover();

        miVehiculo = new Bicicleta();
        miVehiculo.mover();
    }
}
