import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        double num = sc.nextDouble();
        if (num >= 10.0 && num <= 20.0 || num > 30.0 && num < 40.0) {
            System.out.println("El número está en uno de los intervalos válidos");
        } else {
            System.out.println("El número esta fuera de los intervalos");
        }
    }
}
