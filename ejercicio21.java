import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Ingrese el tercero número: ");
        int num3 = sc.nextInt();
        if (num > num2 && num > num3){
            System.out.println("El número mayor es: " + num);
            if(num2 > num3) {
                System.out.println("El número medio es: " + num2);
                System.out.println("El número menor es: " + num3);
            } else {
                System.out.println("El número medio es: " + num3);
                System.out.println("El número menor es: " + num2);
            }
        } else if (num2 > num && num2 > num3) {
            System.out.println("El número mayor es: " + num2);
            if(num > num3) {
                System.out.println("El número medio es: " + num);
                System.out.println("El número menor es: " + num3);
            } else {
                System.out.println("El número medio es: " + num3);
                System.out.println("El número menor es: " + num);
            }
        } else if (num3 > num && num3 > num2) {
            System.out.println("El número mayor es: " + num3);
            if(num > num2) {
                System.out.println("El número medio es: " + num);
                System.out.println("El número menor es: " + num2);
            } else {
                System.out.println("El número medio es: " + num2);
                System.out.println("El número menor es: " + num);
            }
        }
    }
}
