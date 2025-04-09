package arrayList;

import java.util.*;

public class ArrayListClass {
    public static void main(String[] args) {
        //ArrayList. Estructura de datos con tamaño dinámico
        //Permite recibir elementos duplicados
        //Trabaja con tipos de elementos (Class Wrapper)
        ArrayList<String> peliculas = new ArrayList<String>();

        //Agregar elementos a nuestro ArrayList .add();
        peliculas.add("Interstellar");
        peliculas.add("Harry Potter");
        peliculas.add("Espanta tiburones");
        peliculas.add("Orgullo y prejuicio");
        peliculas.add("El planera del tesoro");
        peliculas.add("Barbie. La princesa y la plebeya");
        peliculas.add("Eterno resplandor de una mente sin recuerdos");

        System.out.println(peliculas);

        //Inicializar un ArrayList a partir de su interface (List)
        List<Integer> edades = new ArrayList<>();
        edades.addAll(Arrays.asList(38, 22, 25, 33, 29, 22, 33));
        System.out.println(edades);

        //.size() : conocer el número de elementos
        System.out.println(peliculas.size()); //Output: 7

        //.get(index) : acceder a un elemento
        System.out.println(peliculas.get(5)); //Output: Barbie. La princesa y la plebeya

        //Acceder al último elemento
        String ultimaPelicula = peliculas.get(peliculas.size() - 1); //Output: Eterno resplandor de una mente sin recuerdos
        System.out.println(ultimaPelicula);

        //.remove(index) : eliminar elemento a partir de su index
        peliculas.remove(4);
        System.out.println(peliculas);

        //Ordenar el List con base en la tabla ASCII
        Collections.sort(peliculas);
        System.out.println(peliculas);

        //Invertir el ordenamiento
        Collections.reverse(edades);
        System.out.println(edades);

        //Cambiar el tipo de estructura de datos
        //peliculas -> Class
        //edades -> Interface

        //peliculas = new LinkedList<>(); Error porque no está desde interface
        edades = new LinkedList<>(); //Ambas implementan la interface List
        System.out.println(edades);

        //Tipos de estructuras de datos
        System.out.println(peliculas.getClass().getSimpleName()); //Output: ArrayList
        System.out.println(edades.getClass().getSimpleName()); //Output: LinkedList
    }
}
