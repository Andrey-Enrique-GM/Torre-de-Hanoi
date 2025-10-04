
package golshi;

import java.util.*;

// @author Andrey

public class Golshi {

    public static void main(String[] args) 
    {

        // Lista de caballos
        String[] caballos = {
            "El Condor Pasa", "Special Week", "Silence Suzuka", "Tokai Teio",
            "Grass Wonder", "Mejiro McQueen", "Biwa Hayahide", "Taiki Shuttle",
            "Gold Ship", "Vodka", "Oguri Cap", "Narita Brian",
            "Kitasan Black", "Haru Urara", "Daiwa Scarlet", "Black Heart"
        };

        // Crear mapa para guardar tiempos de cada caballo
        Map<String, Double> tiempos = new HashMap<>();
        Random rand = new Random();

        // Generar tiempos aleatorios entre 3.0 y 5.0 segundos
        for (String caballo : caballos) {
            double tiempo = 3.0 + (2.0 * rand.nextDouble());
            tiempos.put(caballo, Math.round(tiempo * 100.0) / 100.0); // 2 decimales
        }

        // Ordenar caballos por tiempo ascendente
        List<Map.Entry<String, Double>> lista = new ArrayList<>(tiempos.entrySet());
        lista.sort(Map.Entry.comparingByValue());

        // Mostrar resultados con pausas
        System.out.println("=== RESULTADOS DE LA CARRERA ===\n");
        for (int i = 0; i < lista.size(); i++) {
            Map.Entry<String, Double> entry = lista.get(i);
            System.out.println((i+1) + ".- " + entry.getKey() + " - " + entry.getValue() + " seg");

            // Pausa aleatoria hasta 1 segundo
            try {
                Thread.sleep(rand.nextInt(1000)); // 0 a 999 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
    
}
