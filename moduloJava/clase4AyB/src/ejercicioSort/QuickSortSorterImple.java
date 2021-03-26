package ejercicioSort;

import java.util.Comparator;

public class QuickSortSorterImple implements Sorter<QuickSortSorterImple> {

    @Override
    public <T> void sort(T[] arr, Comparator<T> c) {
        Timer.start();

        quickSort(arr, 0, arr.length - 1, c);

        Timer.stop();
    }

    private <T> void quickSort(T[] arr, int low, int high, Comparator<T> c) {
        if (low < high)
        {
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high, c);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1, c);
            quickSort(arr, pi + 1, high, c);
        }
    }

    private <T> int partition(T[] arr, int low, int high, Comparator<T> c)
    {
        // pivot
        T pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {
            // If current element is smaller
            // than the pivot
            if (c.compare(arr[j], pivot) < 0)
            {
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);

        return (i + 1);
    }

    private <T> void swap(T[] arr, int i, int j)
    {
        T temp = arr[i];

        arr[i] = arr[j];
        arr[j] = temp;
    }
}
