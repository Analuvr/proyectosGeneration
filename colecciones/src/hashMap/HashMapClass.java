package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {
        //HashMap. Almcena datos en pares clave-valor (key-value)
        //No es ordenado de manera secuencial (prioriza la memoria)
        //No permite duplicados de la clave (key)

        Map<Integer, String> estudiantes = new HashMap<>();
        System.out.println(estudiantes);

        //Agregar elementos
        estudiantes.put(2025031301, "Erika Cruz");
        estudiantes.put(2025031302, "Ximena Garcia");
        estudiantes.put(2025031303, "Montse Pineda");
        estudiantes.put(2025031304, "Estefania León");
        estudiantes.put(2025031304, "Andrea Escalante");
        estudiantes.put(2025031305, "Daniela Contreras");
        estudiantes.put(2025031306, "Diana Alvarez");
        System.out.println(estudiantes);

        System.out.println("\nPares en forma de lista");
        //Recorrer un Map (ciclo forEach)
        for (Map.Entry<Integer, String> estudiante : estudiantes.entrySet()) {
            System.out.println("Matrícula: " + estudiante.getKey() + " - Estudiante: " + estudiante.getValue());
        }

    }
}
