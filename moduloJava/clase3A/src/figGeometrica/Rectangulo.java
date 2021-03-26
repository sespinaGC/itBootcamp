package figGeometrica;

public class Rectangulo extends FiguraGeometrica{
    private double base, altura;

    public Rectangulo(double b, double a) {
        this.base = b;
        this.altura = a;
    }

    @Override
    public double area() {
        return base * altura;
    }
}
