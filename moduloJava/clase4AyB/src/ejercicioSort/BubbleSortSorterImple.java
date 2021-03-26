package ejercicioSort;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter<BubbleSortSorterImple> {
    public BubbleSortSorterImple() {
    }

    @Override
    public <T> void sort(T[] arr, Comparator<T> c) {
        Timer.start();

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (c.compare((T)arr[j], (T)arr[j+1]) > 0) {
                    T aux = arr[j];

                    arr[j] = arr[j+1];
                    arr[j+1] = aux;
                }
            }
        }

        Timer.stop();
    }
}
