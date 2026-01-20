import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número: ");
        int num = sc.nextInt();
        if (num%2 == 0 && num>0 && num<=100){
            System.err.println("El número es par y esta entre 1 y el 100");
        } else {
            System.out.println("El número NO cumple con las condiones");
        }
    }
}
