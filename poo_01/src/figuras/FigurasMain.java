package figuras;

public class FigurasMain {
    public static void main(String[] args) {
        Figuras rectanguloAzul = new Figuras(20d, 50d);
        Figuras circuloBlanco = new Figuras(10);
        Figuras trianguloMorado = new Figuras(50, 12);

        System.out.println(rectanguloAzul);
        System.out.println(circuloBlanco);

        System.out.println(trianguloMorado.areaTriangulo()); //Output: 300
        System.out.println(rectanguloAzul.areaRectangulo()); //Output: 1000
        System.out.println(circuloBlanco.areaCircunferencia()); //Output: 314.159
    }
}
