import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int num = scanner.nextInt();

        int cont = 0;
        for(int i=1; cont<num; i++){
            if(esPar(i)){
                System.out.println(i);
                cont++;
            }
        }
        scanner.close();
    }

    public static boolean esPar(int i){
        return i%2 == 0;
    }
}
