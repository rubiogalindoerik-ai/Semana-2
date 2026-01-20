import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número: ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Su número es 0");
        } else if (num > 0) {
            System.out.println("Su número es positivo");
        } else if (num < 0) {
            System.out.println("Su número es negativo");
        }
    }
}
