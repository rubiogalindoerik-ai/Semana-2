import java.util.Scanner;

public class ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu consumo de kWh: ");
        int kwh = sc.nextInt();
        double kwhd = (double) kwh;
        if (kwh < 100) {
            double baja = kwhd * 2.0;
            System.out.println("Tarifa baja aplicada, costo: "+ baja);
        } else if (kwh>100 && kwh<300){
            double media = kwhd * 2.5;
            System.out.println("Tarifa media aplicada, costo: "+ media);
        } else if (kwh>299 && kwh<500){
            double alta = kwhd * 3.0;
            System.out.println("Tarifa alta aplicada, costo: "+ alta);
        } else if (kwh>500){
            double muy_alta = kwhd * 3.5;
            System.out.println("Tarifa muy alta aplicada, costo: "+ muy_alta);
        }
    }
}
