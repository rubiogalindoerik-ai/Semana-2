import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu calificación de 0 a 100: ");
        int calf = sc.nextInt();
        if (calf > 100 || calf < 0) {
            System.out.println("Calificación invalida");
        } else if (calf >= 90 && calf <= 100) {
            System.out.println("Calificación: A");
        } else if (calf >= 80 && calf <= 89) {
            System.out.println("Calificación: B");
        } else if (calf >= 70 && calf <= 79) {
            System.out.println("Calificación: C");
        } else if (calf >= 60 && calf <= 69) {
            System.out.println("Calificación: D. Tienes derecho a extraordinario");
        } else if (calf >= 0 && calf <= 59) {
            System.out.println("Calificación: F");
        }
    }
}
