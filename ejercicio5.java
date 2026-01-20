import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Cual es su edad: ");
        int edad = sc.nextInt();
        if (edad >= 18 ) {
            System.out.println("Hola, " + nombre + " usted es mayor de edad");
        } else {
            System.out.println("Hola, " + nombre + " usted es menor de edad");
        }
    }
}
