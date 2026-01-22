import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Es emergencia?(si/no): ");
        String opEmer = sc.nextLine();
        boolean emergencia = opEmer.equalsIgnoreCase("si");
        System.out.println("¿Tiene una enfermedad cronica?(si/no): ");
        String opCron = sc.nextLine();
        boolean cronica = opCron.equalsIgnoreCase("no");
        if (emergencia) {
            System.out.println("Prioridad máxima");
        } else if (edad >= 65 || cronica) {
            System.out.println("Prioridad alta");
        } else {
            System.out.println("Prioridad normal");
        }
        
    }
}
