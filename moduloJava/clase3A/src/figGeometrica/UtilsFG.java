package figGeometrica;

public class UtilsFG {
    public static double areaPromedio (FiguraGeometrica arr[]) {
        double sum = 0;
        for(FiguraGeometrica fg: arr) {
            sum += fg.area();
        }
        return sum / arr.length;
    }
}
