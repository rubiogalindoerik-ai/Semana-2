import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu usuario: ");
        String user = sc.nextLine();
        System.out.println("Ingresa la contraseña: ");
        int conts = sc.nextInt();
        String cUser = "admin";
        int cConts = 1234;
        if (user.equals(cUser) && conts == cConts){
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
