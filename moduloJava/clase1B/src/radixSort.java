import java.util.ArrayList;

public class radixSort {
    public static void radixSort(int[] array)
    {
        // PROGRAMAR AQUI
        String[] result = new String[array.length];
        //result = StringUtils.toStringArray(array).toArray(new String[0]);
        //StringUtils.lNormalize(result, '0');
        System.out.println(StringUtils.toStringArray((array)));
    }

    public static void main(String[] args)
    {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        radixSort(arr);

        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+(i<arr.length-1?",":""));
        }
    }
}
