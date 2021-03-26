package ejercicio1;

import java.util.ArrayList;

public class demo {
    public static void main(String[] args) {
        Precedable<Persona> arr[] = new Precedable[3];
        Persona a = new Persona("santi", 123);
        Persona b = new Persona("lucas", 111);
        Persona c = new Persona("diego", 101);
        Celular d = new Celular(123, "santi");
        Celular e = new Celular(111, "diego");
        Celular f = new Celular(101, "lucas");
        arr[0] = d;
        arr[1] = e;
        arr[2] = f;

        SortUtil.ordenar(arr);
        System.out.println(arr);
    }
}
