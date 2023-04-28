/* En este ejercicio practicarás las estructuras de control, para ello deberás crear:

1) Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

2) Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    Incrementar el valor de la variable en uno cada vez que se ejecute.
    Mostrarlo por pantalla cada vez que se ejecute.

3) Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

4) Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

5) Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación. */public class Main {
    public static void main (String[] args) {
        /* Ejercicio if / else */
        int numeroIf = -1;
        if (numeroIf < 0) {
            System.out.println("El numero es negativo\n");
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo\n");
        } else {
            System.out.println("El numero es cero\n");
        }

        /* Ejercicio While */
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        System.out.println("\n");

        /* Ejercicio do while */
        int numeroDoWhile = 0;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        }
        while (numeroDoWhile < 3);

        System.out.println("\n");

        /* Ejercicio for */
        for (int numeroFor = 0;numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("\n");

        /* Ejercicio case */
        var estacion = "calor";
        switch (estacion) {
            case "verano":
                System.out.println("Estamos en Verano");
                break;
            case "invierno":
                System.out.println("Estamos en Invierno");
                break;
            case "otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "primavera":
                System.out.println("Estamos en Primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}