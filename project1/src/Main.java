/*
Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.
*/

public class Main {
    public static void main(String[] args) {
        var valor = suma(10,10,20);

        System.out.println(valor);

        Coche miCoche = new Coche();
        miCoche.sumarPuerta();
        miCoche.sumarPuerta();
        miCoche.sumarPuerta();
        miCoche.sumarPuerta();
        System.out.println("Mi coche tiene: " + miCoche.puertas + " puertas");
    }
    public static int suma (int a, int b, int c) {
        return a + b + c;
    }
}
class Coche {
    public int puertas = 0;

    public void sumarPuerta () {
        this.puertas ++;
    }
}