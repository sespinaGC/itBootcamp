import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingresar numero: ");
        int n = scanner.nextInt();
        if(esPrimo(n)){
            System.out.println(n+" es primo");
        }
        else {
            System.out.println(n+" no es primo");
        }
    }

    public static boolean esPrimo (int n){
        for(int i=2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
