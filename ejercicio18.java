import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un solo caracter(letra/número): ");
        String original = sc.nextLine();
        char letra = original.charAt(0);
        if (letra >= 'A' && letra <= 'Z') {
            System.out.println("Es una letra mayúscula.");
        } else if (letra >= 'a' && letra <= 'z') {
            System.out.println("Es una letra minúscula.");
        } else if (letra >= '0' && letra <= '9') {
            System.out.println("Es un dígito.");
        } else {
            System.out.println("Es otro tipo de carácter.");
        }
    }
}
