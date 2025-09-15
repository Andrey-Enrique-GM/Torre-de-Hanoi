
package azarrr;

// @author Andrey

import java.util.Random;

 
public class Azarrr {

    public static void main(String[] args)
    {
        
        int[] numeros = new int[10];
        Random random = new Random();

        // Genera 10 numeros aleatorios entre 1 y 100
        for (int i = 0; i < numeros.length; i++) 
        {
            numeros[ i ] = random.nextInt(100) + 1;
        }

        // Muestra la lista de numeros generados
        System.out.print("Números generados: ");
        for (int n : numeros) 
        {
            System.out.print(n + " ");
        }
        System.out.println();

        // Variables para los calculos
        int suma = 0;
        int cantidadPrimos = 0;
        int cantidadPares = 0;
        int mayor = numeros[0];
        int menor = numeros[0];

        for (int n : numeros) 
        {
            suma += n;

            // Contar los pares
            if (n % 2 == 0) 
            {
                cantidadPares++;
            }

            // Contar los primos
            if (esPrimo(n))
            {
                cantidadPrimos++;
            }

            // Mayor y menor
            if (n > mayor) mayor = n;
            if (n < menor) menor = n;
        }

        double promedio = (double) suma / numeros.length;

        // Mostrar los resultados
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de numeros primos: " + cantidadPrimos);
        System.out.println("Cantidad de numeros pares: " + cantidadPares);
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
    }

    // Metodo para verificar si un numero es primo o no
    public static boolean esPrimo(int num) 
        {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) 
                {
                    if (num % i == 0) return false;
                 }
            return true;
        }
    
}
