import java.util.ArrayList;

public class StringUtils {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static void main(String[] args) {
        int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
        ArrayList<String> result = new ArrayList<String>();
        result = toStringArray(arr);
        lNormalize(result, '0');
        System.out.println(result);

    }
    public static String replicate(char c, int n)
    {
        String str = String.valueOf(c);
        int i = 1;
        while(i < n) {
            str += String.valueOf(c);
            i++;
        }
        return str;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        if(n - s.length() > 0) {
            s = replicate(c, n - s.length()) + s;
        }
        return s;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static ArrayList<String> toStringArray(int[] arr)
    {
        ArrayList<String> strArr = new ArrayList<String>();
        for(int i = 0; i < arr.length; i++) {
            strArr.add(String.valueOf(arr[i]));
        }
        return strArr;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static ArrayList<Integer> toIntArray(String[] arr)
    {
        ArrayList<Integer> intArr = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) {
            intArr.add(Integer.parseInt(arr[i]));
        }
        return intArr;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(ArrayList<String> arr)
    {
        int max = arr.get(0).length();
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).length() > max) {
                max = arr.get(i).length();
            }
        }
        return max;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(ArrayList<String> arr, char c)
    {
        int maxLength = maxLength(arr);
        for(int i = 0; i < arr.size(); i++) {
            if(arr.get(i).length() < maxLength) {
                arr.set(i, lpad(arr.get(i), maxLength, c));
            }
        }
    }
}
