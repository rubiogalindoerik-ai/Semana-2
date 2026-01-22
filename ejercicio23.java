import java.util.Scanner;

public class ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();
        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();
        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();
        if (dia > 31 || mes > 12 || dia < 1 || mes < 1) {
            System.out.println("Fecha invalida");
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia > 30) {
                System.out.println("Fecha invalida");
            } else if (mes == 2 && dia > 28) {
                System.out.println("Fecha invalida");
            } else {
                System.out.println("Fecha valida");
            }
        }
    }
}
