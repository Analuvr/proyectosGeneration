public class OperadoresJava {
    public static void main(String[] args) {
        //Operadores matemáticos (+, -, *, /, %)
        System.out.println(5 + 2); //Output: 7
        System.out.println(3 - 6); //Output: -3
        System.out.println(7 * 9); //Output: 63
        System.out.println(90 / 3); //Output: 30
        System.out.println(20 % 3); //Output: 2

        //Operadores relacionados
        int num1 = 12; //Operador de asignación
        num1 += 10; //Asignación suma
        System.out.println(num1); //Output: 22

        //Operadores incrementales/decrementales (++ y --)
        int incremento = 5;
        System.out.println(++incremento);

        int decremento = 5;
        System.out.println(--decremento);

        //Operador de igualdad y no igualdad (== , !=)
        int comparador01;
        int comparador02;
        comparador01 = 5;
        comparador02 = 3;
        System.out.println(comparador01 == comparador02); //Output: false
        System.out.println(comparador01 != comparador02); //Output: true

        long comparador03 = 25;
        int comparador04 = 25;
        System.out.println(comparador03 == comparador04); //Output: true
        System.out.println(comparador03 != comparador04); //Output: false

        // >, <, >=, <=
        byte num11 = 120;
        char num12 = 'A';
        System.out.println(num11 > num12);

        short num20 = 65;
        char num21 = 'A';
        System.out.println(num20 >= num21); //Output: true, porque el valor decimal del caracter A es 65

        long num22 = 155;
        int num23 = 155;
        System.out.println(num22 <= num23); //Output: true

        //Operadores lógicos
        //AND (&&)
        System.out.println((5 >  2) && (2 < 1)); //Output: false
        System.out.println((12 > 4) && (5 < 19)); //Output: true

        //OR (||)
        System.out.println((5 > 2) || (2 < 1)); //Output: true

        //NOT (!)
        System.out.println(!(5 > 2) || (2 < 1)); //Output: true

    }
}
