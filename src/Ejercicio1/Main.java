package Ejercicio1;


public class Main {
    public static void main(String[] args) {
        // Usando polimorfismo
        Figura figura1 = new Circulo(5);
        Figura figura2 = new Rectangulo(4, 6);

        figura1.calcularArea();
        figura2.calcularArea();
    }
}
