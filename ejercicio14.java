import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTRADAS AL CINE");
        System.out.println("----------------");
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Tienes credencial (si/no): ");
        String op = sc.nextLine();
        if (op.equalsIgnoreCase("si") || op.equalsIgnoreCase("no")) {
            if (edad >= 15 && op.equalsIgnoreCase("si")) {
                System.out.println("Acceso permitido");
            } else {
                System.out.println("Acceso denegado");
            }
        } else {
            System.out.println("Opción no válida");
        }
    }
}