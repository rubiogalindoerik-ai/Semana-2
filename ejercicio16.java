import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();
        if (num%3 == 0 || num%5 == 0) {
            System.out.println("Es multiplo de 3 o 5");
        } else {
            System.out.println("No es multiplo de 3 o 5");
        }
    }
}
