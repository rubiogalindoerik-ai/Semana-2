import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Cual es su edad: ");
        int edad = sc.nextInt();
        if (edad < 13 ) {
            System.out.println("Hola, " + nombre + " usted es un niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Hola, " + nombre + " usted es un adolescente");
        } else if (edad >= 18 && edad <= 64){
            System.out.println("Hola, " + nombre + " usted es un adulto");
        } else if (edad >= 65) {
            System.out.println("Hola, " + nombre + " usted es un adulto mayor");
        }
    }
}
