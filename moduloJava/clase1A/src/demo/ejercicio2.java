package demo;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese numero 1: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese numero 2: ");
        int numero2 = scanner.nextInt();

        for(int i=1; i<=numero1; i++){
            System.out.println(numero2*i);
        }
        scanner.close();
    }
}
