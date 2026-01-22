import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la medida del lado 1 del triangulo: ");
        double ld1 = sc.nextDouble();
        System.out.print("Ingrese la medida del lado 2 del triangulo: ");
        double ld2 = sc.nextDouble();
        System.out.print("Ingrese la medida del lado 3 del triangulo: ");
        double ld3 = sc.nextDouble();
        if (ld1+ld2>ld3 && ld1+ld3>ld2 && ld2+ld3>ld1) {
            if (ld1==ld2 && ld2==ld3) {
                System.out.println("Triagulo válido: equilátero");
            } else if (ld1==ld2 || ld1==ld3 || ld2==ld3) {
                System.out.println("Triangulo válido: isósceles");
            } else if (ld1!=ld2 && ld1!=ld3 && ld2!=ld3){
                 System.out.println("Triangulo válido: escaleno");
            }
        } else {
            System.out.println("Triangulo invalido");
        }
    }
}
