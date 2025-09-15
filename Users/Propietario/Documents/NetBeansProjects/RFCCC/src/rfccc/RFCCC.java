
package rfccc;

// @author Andrey

import java.util.Scanner;


public class RFCCC {

    public static void main(String[] args) 
    {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos al usuario
        System.out.print("Apellido paterno: ");
        String apellidoPaterno = scanner.nextLine();

        System.out.print("Apellido materno: ");
        String apellidoMaterno = scanner.nextLine();

        System.out.print("Primer nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Año de nacimiento (cuatro numeros): ");
        String anio = scanner.nextLine();

        System.out.print("Mes de nacimiento (uno o dos numeros): ");
        String mes = scanner.nextLine();

        System.out.print("Dia de nacimiento (uno o dos digitos): ");
        String dia = scanner.nextLine();

        // Construccion del RFC
        String rfc = "";

        // Primeras 2 letras del apellido paterno
        if (apellidoPaterno.length() >= 2) {
            rfc += apellidoPaterno.substring(0, 2).toUpperCase();
        } else {
            rfc += apellidoPaterno.toUpperCase(); // por si es corto
        }

        // Primera letra del apellido materno
        if (!apellidoMaterno.isEmpty()) {
            rfc += apellidoMaterno.substring(0, 1).toUpperCase();
        } else {
            rfc += "X"; // si no tiene apellido materno
        }

        // Primera letra del nombre
        rfc += nombre.substring(0, 1).toUpperCase();

        // Año (solo los ultimos dos digitos)
        if (anio.length() == 4) {
            rfc += anio.substring(2);
        }

        // Mes (2 dígitos)
        if (mes.length() == 1) {
            mes = "0" + mes;
        }
        rfc += mes;

        // Día (2 digitos)
        if (dia.length() == 1) {
            dia = "0" + dia;
        }
        rfc += dia;

        // Mostrar RFC!!!
        System.out.println("RFC generado: " + rfc);
        
    }
    
}
