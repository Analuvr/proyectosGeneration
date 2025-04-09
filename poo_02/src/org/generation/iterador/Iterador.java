package org.generation.iterador;

import java.util.*;

public class Iterador {
    public static void main(String[] args) {
        Set<Long> codigos = new HashSet<>();

        codigos.addAll(Arrays.asList(123456789L, 123456788L, 123456786L, 123456785L, 123456784L));
        System.out.println(codigos);

        //Iterar utilizando un forEach
        for(Long code : codigos) {
            System.out.println(code);
        }

        //Interface `Iterator`
        Iterator<Long> iterando = codigos.iterator();
        System.out.println(iterando); //Representación hexadecimal del código hash

        //Implementando un loop While, agregamos métodos para iteración (.hasNext(); .Next(); )
        while(iterando.hasNext()){
            System.out.println(iterando.next());
        }

        //HashMap que recibe nombre de empleados y salario
        Map<String, Double> salarioEmpleado = new HashMap<>();

        salarioEmpleado.put("Ana", 47000.00d);
        salarioEmpleado.put("Dany", 25000.88d);
        salarioEmpleado.put("Mariana", 127500.50d);
        salarioEmpleado.put("Luciana", 19000.02d);

        //Iterar sobre clave (key)
        Iterator<String> iterarClave = salarioEmpleado.keySet().iterator(); //Recibe el tipo sobre el cuál va a iterar

        while (iterarClave.hasNext()) {
            System.out.println(iterarClave.next());
        }

        //Iterar sobre valor (value)
        Iterator<Double> iterarValor = salarioEmpleado.values().iterator();

        while (iterarValor.hasNext()) {
            System.out.println(iterarValor.next());
        }

        //Iterar K-V del HashMap
        Iterator<Map.Entry<String, Double>> iterarHashMap = salarioEmpleado.entrySet().iterator();

        while(iterarHashMap.hasNext()) {
            Map.Entry<String, Double> pares = iterarHashMap.next();
            System.out.println("Empleado: " + pares.getKey() + ", Salario: $" + pares.getValue());
            //System.out.println(iterarHashMap.next());
        }
    }

}
