import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu calificación: ");
        int cal = sc.nextInt();
        if (cal <= 69 ) {
            System.out.println("Reprobado");
        } else if (cal >= 70 && cal <= 79) {
            System.out.println("Aprobado");
        } else if (cal >= 80 && cal <= 89){
            System.out.println("Muy bien");
        } else if (cal >= 90 && cal <= 100) {
            System.out.println("Excelente");
        } else {
            System.out.println("Calificacion inexistente");
        }
    }
}
