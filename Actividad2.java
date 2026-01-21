import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        String nombre1 = "Erick";
        String nombre2 = "Patricio";
        String nombre3 = "Daisy";

        if (nombre.equalsIgnoreCase(nombre1) || nombre.equalsIgnoreCase(nombre2) || nombre.equalsIgnoreCase(nombre3)){
            System.out.println("Hola, " + nombre + " bienvenido de vuelta");
        } else {
            System.out.println("Hola, " + nombre + " no te reconozco");
        }

        int[] pares = new int[50];
        int indice = 0;
        for (int i = 2; i <= 100; i += 2) {
            pares[indice] = i;
            indice++;
        }
        System.out.println("Números pares del 2 al 100:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
    }
}
