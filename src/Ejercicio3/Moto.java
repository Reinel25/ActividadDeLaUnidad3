package Ejercicio3;

public class Moto extends Vehiculo {
    @Override
    public void mover() {
        // ❌ Esto es innecesario si no cambia el comportamiento
        super.mover();
    }
}
