import java.util.Scanner;

public class ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el precio base: ");
        double precio = sc.nextDouble();
        sc.nextLine();
        System.out.println("¿Cuentas con membresia?(si/no): ");
        String opMenb = sc.nextLine();
        boolean membresia = opMenb.equalsIgnoreCase("si");
        System.out.println("Ingrese el dia de la semana: ");
        String dia = sc.nextLine();
        boolean diaLu = dia.equalsIgnoreCase("LUNES");
        boolean diaVi = dia.equalsIgnoreCase("VIERNES");
        if (precio >= 1000 && membresia && diaLu || diaVi) {
            double descuento = 0.10 + 0.05 + 0.03;
            double total = precio-(precio*descuento);
            System.out.println("Descuento final: " + descuento);
            System.out.println("Precio final: " + total);
        } else if (precio >= 1000) {
            double descuento = 10.0;
            double total = precio-(precio*descuento);
            System.out.println("Descuento final: " + descuento);
            System.out.println("Precio final: " + total);
        } else if (membresia) {
            double descuento = 5.0;
            double total = precio-(precio*descuento);
            System.out.println("Descuento final: " + descuento);
            System.out.println("Precio final: " + total);
        } else if (diaLu || diaVi) {
            double descuento = 3.0;
            double total = precio-(precio*descuento);
            System.out.println("Descuento final: " + descuento);
            System.out.println("Precio final: " + total);
        }
    }
}
