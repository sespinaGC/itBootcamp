package demo;

import java.util.LinkedList;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese numero ");
        int n = scanner.nextInt();

        System.out.println("ingrese numero ");
        int m = scanner.nextInt();

        System.out.println("ingrese numero ");
        int d = scanner.nextInt();

        int cont = 0;
        LinkedList<Integer> stack = new LinkedList<Integer>();
        for(int i = idxStart(m, d); cont < n; i++) {
            int idx = i;
            int aux = 0;
            while (idx > 0) {
                stack.push( idx % 10 );
                idx = idx / 10;
            }
            while (!stack.isEmpty()) {
                if((stack.pop()) == d) {
                    aux++;
                }
            }
            if(aux >= m){
                System.out.println(i);
                cont++;
            }
        }

        scanner.close();
    }

    public static int idxStart (int m, int d) {
        String str = String.valueOf(d);
        for(int i =1; i < m; i++) {
            str += String.valueOf(d);
        }

        return Integer.parseInt(str);
    }
}
