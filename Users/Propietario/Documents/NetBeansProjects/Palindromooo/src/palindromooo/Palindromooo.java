
package palindromooo;

// @author Andrey

import java.util.Scanner;


public class Palindromooo {

    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        
        // Solicita al usuario ingresar el texto
        System.out.println("Ingresa el texto: ");
        String texto = scanner.nextLine();

        if (esPalindromo(texto))
        {
            System.out.println("SI es un palindromo!");
        } else {
            System.out.println("NO es un palindromo!");
        }
        
    }

    public static boolean esPalindromo(String texto)
    {
        
        // Convierte todo a minusculas y elimina espacios
        String limpio = texto.toLowerCase().replaceAll("\\s+", "");

        // Invierte el texto
        String invertido = new StringBuilder(limpio).reverse().toString();

        // Compara amos textos
        return limpio.equals(invertido);
        
    }
    
}
