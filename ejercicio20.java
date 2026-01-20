import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuál es su promedio?: ");
        int calif = sc.nextInt();
        System.out.print("¿Cuál es su ingreso familiar mensual?: ");
        int inger = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Tienes materias reprobadas?");
        String op = sc.nextLine();
        boolean opR = op.equalsIgnoreCase("si");

        if (calif >= 85 && inger < 20000 && !opR) {
            System.out.println("Eres elegible para beca.");
        } else {
            System.out.println("No eres elegible para beca.");
        }
    }
}
