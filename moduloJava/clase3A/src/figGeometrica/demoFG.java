package figGeometrica;

public class demoFG {
    public static void main(String[] args) {
        FiguraGeometrica arr[] = new FiguraGeometrica[3];
        arr[0] = new Circulo(3.14);
        arr[1] = new Rectangulo(2,3);
        arr[2] = new Triangulo(5, 4);

        double ap = UtilsFG.areaPromedio(arr);
        System.out.println(ap);
    }
}
