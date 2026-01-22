import java.util.Scanner;

public class ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la coordenada x: ");
        double cordx = sc.nextDouble();
        System.out.print("Ingrese la coordenada y: ");
        double cordy = sc.nextDouble();
        if (cordx == 0 && cordy == 0) {
            System.out.println("El cordenadas estan en el origen");
        } else if (cordy == 0 && cordx != 0) {
            System.out.println("Las cordenadas estan sobre el eje de x");
        } else if (cordx == 0 && cordy != 0) {
            System.out.println("Las cordenadas estan sobre el eje de y");
        } else if (cordx > 0 && cordy > 0) {
            System.out.println("Las cordenadas estan en el primer cuadrante");
        } else if (cordx < 0 && cordy > 0) {
            System.out.println("Las cordenadas estan en el segundo cuadrante");
        } else if (cordx < 0 && cordy < 0) {
            System.out.println("Las cordenadas estan en el tercer cuadrante");
        } else if (cordx > 0 && cordy < 0) {
            System.out.println("Las cordenadas estan en el cuarto cuadrante");
        }
    }
}