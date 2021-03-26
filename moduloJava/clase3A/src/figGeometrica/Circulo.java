package figGeometrica;

public class Circulo extends FiguraGeometrica{
    private double radio;
    public Circulo(double r) { this.radio = r; }
    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }
}
