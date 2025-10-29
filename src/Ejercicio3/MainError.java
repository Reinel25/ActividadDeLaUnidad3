package Ejercicio3;

public class MainError {
    public static void main(String[] args) {
        Animal miAnimal = new Perro();
        miAnimal.hacerSonido();


        //miAnimal.correr();

        // Intento malo, no compila porque el la clase base no tienen el metodo correr
    }
}