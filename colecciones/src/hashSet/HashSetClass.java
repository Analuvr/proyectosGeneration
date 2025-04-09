package hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetClass {
    public static void main(String[] args) {
        //HashSet. Estructura de datos respaldada por las tablas Hash, donde los elementos se recuperan optimizando la memoria
        //Los elementos se muestran de forma desordenada y sin duplicados
        Set<String> productos = new HashSet<>();

        //Llenar nuestro elemento HashSet
        productos.add("iphone 16");
        productos.add("laptop toshiba");
        productos.add("iphone 16"); //No permite elementos duplicados, lo ignora en la salida
        productos.add("apple watch");
        productos.add("tableta gráfica");

        System.out.println(productos);

        //Conocer el número de elementos: .size
        System.out.println(productos.size()); //Output: 4

        //Conocer si el Set posee un elemento específico
        System.out.println(productos.contains("iphone 16")); //Output: true
        System.out.println(productos.contains("iphone 15")); //Output: false

        //Limpiar el Set : .clear()
        productos.clear();
        System.out.println(productos);

        //TreeSet. Ordena los elementos (ordenamiento natural) sin permitir duplicados
        productos = new TreeSet<>();
        productos.add("iphone 16");
        productos.add("laptop toshiba");
        productos.add("iphone 16"); //No permite elementos duplicados, lo ignora en la salida
        productos.add("apple watch");
        productos.add("tableta gráfica");

        System.out.println(productos);
        System.out.println(productos.getClass().getSimpleName()); //Output: TreeSet

    }
}
