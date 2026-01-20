import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Inserta tu edad: ");
        int edad = sc.nextInt();
        if (edad > 0 && edad <120){
            if (edad >= 18){
                System.out.println("Tu edad es valida y eres mayor de edad");
            } else if (edad < 18){
                System.out.println("Tu edad es valida y eres menor de edad");
            }
        } else {
            System.err.println("Edad invalida");
        }
    }
}
