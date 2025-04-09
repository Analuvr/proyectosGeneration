public class DatosPrimitivos {
    //Metodo main para visualizar en consola
    public static void main(String[] args) {
        // Datos primitivos (valores min y max)

        //byte
        byte minByte = Byte.MIN_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        System.out.println("El valor mínimo de byte es: " + minByte);
        System.out.println("El valor mínimo de byte es: " + maxByte);

        //short
        short minShort = Short.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        System.out.println("El valor mínimo de short es: " + minShort);
        System.out.println("El valor máximo de short es: " + maxShort);

        //int
        int minInteger = Integer.MIN_VALUE;
        int maxInteger = Integer.MAX_VALUE;
        System.out.println("El valor mínimo de int es: " + minInteger);
        System.out.println("El valor máximo de int es: " + maxInteger);

        //long
        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        System.out.println("El valor mínimo de long es: " + minLong);
        System.out.println("El valor máximo de long es: " + maxLong);

        //float
        float minFloat = Float.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        System.out.println("El valor mínimo de float es: " + minFloat);
        System.out.println("El valor máximo de float es: " + maxFloat);

        //double
        double minDouble = Double.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        System.out.println("El valor mínimo de double es: " + minDouble);
        System.out.println("El valor máximo de double es: " + maxDouble);

        //char
        char minCharacter = Character.MIN_VALUE;
        char maxCharacter = Character.MAX_VALUE;
        System.out.println("El valor mínimo de char es: " + minCharacter);
        System.out.println("El valor máximo de char es: " + maxCharacter);

        //boolean
        boolean trueBoolean = Boolean.TRUE;
        boolean falseBoolean = Boolean.FALSE;
        System.out.println("El valor verdadero de boolean es: " + trueBoolean);
        System.out.println("El valor falso de boolean es: " + falseBoolean);

        //Asignar valores a datos primitivos
        byte datoByte = 38;
        short datoShort = 1250;
        int datoInt = 568220;
        long datoLong = 13250000L;

        float datoFloat = 12533.22f;
        double datoDouble = 18253.01d;

        System.out.println(datoByte);
        System.out.println(datoShort);
        System.out.println(datoInt);
        System.out.println(datoLong);
        System.out.println(datoFloat);
        System.out.println(datoDouble);

        //Al ser estático debemos reasignar al mismo tipo de dato
        boolean datoBoolean = false;
        System.out.println(datoBoolean);
        datoBoolean = true;
        System.out.println(datoBoolean);

        //char
        char datoChar = '♥';
        System.out.println(datoChar);

        //Casteo (conversión de tipos)

        //AUTOMÁTICO
        int myInt = 14651;
        double myDouble = myInt;

        System.out.println(myInt);
        System.out.println(myDouble);

        //MANUAL
        int miInt = 1522;
        short myShort = (short)miInt;
        System.out.println(miInt);
        System.out.println(myShort);

        //Casteo a Int (valores decimales de ASCII)
        char character = 'ª';
        int numCharacter = character;
        System.out.println(numCharacter); //Output: 170

        int characterCopyright = 169;
        char charCopyrigght = (char)characterCopyright;
        System.out.println(charCopyrigght); //Output: ©

    }
}
