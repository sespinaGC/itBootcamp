package ejercicio1;

public class SortUtil {
    public static <T> void ordenar (Precedable<T>[] arr) {
        int i, j;
        T aux;
        for(i = 0; i < arr.length -1; i++) {
            for(j = 0; j < arr.length - i - 1; j++) {
                if(arr[j + 1].precedeA((T) arr[j]) <= 0) {
                    aux = (T) arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = (Precedable<T>) aux;
                }
            }
        }
    }
}
