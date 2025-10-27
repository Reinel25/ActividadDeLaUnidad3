package Ejercicio3;


public class Perro extends Animal {
    public void correr() {
        System.out.println("El perro está corriendo.");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}