import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu calificación: ");
        int calf = sc.nextInt();
        if (calf == 0 || calf > 100) {
            System.out.println("Calificación invalida");
        } else if (calf >= 70 && calf <= 100) {
            System.out.println("Aprobado");
        } else if (calf >= 60 && calf <= 69) {
            System.out.println("Extraordinario");
        } else if (calf <= 59) {
            System.out.println("Reprobado");
        }
    }
}
