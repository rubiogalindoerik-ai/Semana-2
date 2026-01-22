import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una contraseña fuerte de al menos 8 characteres");
        String contr = sc.nextLine();
        boolean tMayu = contr.chars()
        .anyMatch(Character::isUpperCase);
        boolean tMin = contr.chars()
        .anyMatch(Character::isLowerCase);
        boolean tNum = contr.chars()
        .anyMatch(Character::isDigit);
        if (contr.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 characteres");
        } else if (tMayu == true && tMin == true && tNum == true) {
            System.out.println("Contraseña fuerte (según las reglas simplificadas).");
        } else {
            System.out.println("Contraseña debil");
        }
    }
}
