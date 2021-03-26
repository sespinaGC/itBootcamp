package ejercicioSort;

public class Timer {
    private static long startTime;
    private static long endTime;

    public static void start() {
        startTime = System.currentTimeMillis();
    }

    public static void stop() {
        endTime = System.currentTimeMillis();
    }

    public static long elapsedTime() {
        return endTime - startTime;
    }
}
