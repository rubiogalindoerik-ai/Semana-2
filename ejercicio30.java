import java.util.Scanner;

public class ejercicio30 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Ingresa tu edad: ");
       int edad = sc.nextInt();
       sc.nextLine();
       System.out.print("¿Cuál es tu ingreso mensual?: ");
       double ingr = sc.nextDouble();
       sc.nextLine();
       System.out.println("¿Tiene un historial crediticio bueno?: ");
       String opHC = sc.nextLine();
       boolean hcr = opHC.equalsIgnoreCase("si");
       System.out.println("¿Tiene otras deudas grandes?: ");
       String opDe = sc.nextLine();
       boolean deu = opDe.equalsIgnoreCase("si");
       if (edad >= 18 && edad <= 65 && ingr >= 15000 && hcr && deu == false) {
            System.out.println("Aplicas para un credito");
       } else if (ingr >= 12000 && ingr <= 14999) {
            if (edad >= 18 && edad <= 65 && hcr && deu == false) {
                System.out.println("Puedes aplicar a una revisión manual");
            }
       } else {
        System.out.println("Credito rechazado");
       }
    }
}
