package figuras;

//Objeto base para diferentes figuras y el cálculo de propiedades geométricas (área)
public class Figuras {
    //1. Atributos (variables de instancia)
    double base;
    double altura;
    double radio;

    //2. Constructores
    //Overloading. Sobrecarga de métodos, permite que existan dos o más métodos con el mismo nombre y diferente firma (parámetros)
    public Figuras(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Figuras(double radio) {
        this.radio = radio;
    }

    //3. Getter y setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //4. Métodos específicos de figuras

    //Calcular área de rectángulo
    public double areaRectangulo() {
        return base * altura;
    }

    //Calcular área de triángulo
    public double areaTriangulo() {

        return (base * altura) / 2;

    }

    //Calcular área de circunferencia
    public double areaCircunferencia() {
        return Math.round(Math.PI * Math.pow(radio,2) * 1000) / 1000.0;
    }

    //5. Sobreescribir toString()
    @Override
    public String toString() {
        if (radio != 0) {
            return "Radio: " + radio;
        } else {
            return "Base: " + base + ", Altura: " + altura;
        }
    }

}//class
