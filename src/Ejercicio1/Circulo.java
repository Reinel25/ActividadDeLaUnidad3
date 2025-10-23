package Ejercicio1;


public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * radio * radio;
        super.calcularArea();
        System.out.println("El área del círculo es: " + area);
        System.out.println();
    }
}
