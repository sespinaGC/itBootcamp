package demo;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int n = scanner.nextInt();
        int cont = 0;
        for(int i =1 ; cont < n; i++){
            if(esPrimo(i)) {
                System.out.println(i);
                cont++;
            }
        }
    }

    public static boolean esPrimo(int numero) {

        for(int i=2 ; i<numero; i++){
            if(numero%i==0) return false;
        }
        return true;
    }
}
