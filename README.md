# Actividad 2
**Enunciado**
Asegúrate de contar con acceso a un entorno de desarrollo Java y, después, realiza lo siguiente:

**Parte 1**. Strings y estructuras de selección

Crea un programa Java que solicite al usuario ingresar su nombre.
Utiliza estructuras de selección (if o switch) para verificar si el nombre ingresado coincide con uno específico que definas en tu programa; dependiendo de la coincidencia, muestra un mensaje personalizado.
Aprovecha las operaciones de manejo de cadenas de texto para, así, realizar comparaciones con sensibilidad a mayúsculas o minúsculas y, de esta manera, proporcionar mensajes adecuados.

**Parte 2**. Estructuras de repetición y arreglos

Desarrolla un programa que genere una lista de números enteros pares desde dos hasta 100; para lograrlo, puedes utilizar una estructura de repetición (for o while).
Almacena estos números en un arreglo.
Luego, utiliza una estructura de repetición para recorrer el arreglo y mostrar en pantalla los números almacenados.
---
**Codigo**
```java
import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        String nombre1 = "Erick";
        String nombre2 = "Patricio";
        String nombre3 = "Daisy";

        if (nombre.equalsIgnoreCase(nombre1) || nombre.equalsIgnoreCase(nombre2) || nombre.equalsIgnoreCase(nombre3)){
            System.out.println("Hola, " + nombre + " bienvenido de vuelta");
        } else {
            System.out.println("Hola, " + nombre + " no te reconozco");
        }

        int[] pares = new int[50];
        int indice = 0;
        for (int i = 2; i <= 100; i += 2) {
            pares[indice] = i;
            indice++;
        }
        System.out.println("Números pares del 2 al 100:");
        for (int i = 0; i < pares.length; i++) {
            System.out.println(pares[i]);
        }
    }
}
```
**Salida esperada(ejemplo)**
---

---
# Ejercicios básicos Java: tipos, Scanner, Strings y selección
Cada ejercicio debe resolverse en un programa Java independiente (puedes usar un
solo `main` y modificarlo entre ejercicios). Usa `Scanner` para las entradas por
teclado cuando aplique.
---
## Ejercicio 1: Saludo simple
**Enunciado**
Escribe un programa que guarde tu nombre en una variable `String` y lo muestre en
pantalla con el mensaje: `Hola, <nombre>`.
---
**Codigo**
```java
public class ejercicio1 {
    public static void main(String[] args) {
        String nombre = "Erick";
        System.out.println("Hola, mi nombre es: " + nombre);
    }
}
```
**Salida esperada (ejemplo)**
---
![](img/Ejercicio1.png)
---
## Ejercicio 2: Suma de dos enteros
**Enunciado**
Escribe un programa que pida por teclado dos números enteros y muestre la suma de
ambos.
---
**Codigo**
```java
import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int priNum = sc.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int segNum = sc.nextInt();
        int total = priNum + segNum;
        System.out.println("El suma de ambos números es: " + total);
    }
}
```
**Salida esperada**
---
![](img/Ejercicio2.png)
---
## Ejercicio 3: Conversión de double a int (casting)
**Enunciado**
Escribe un programa que pida un número decimal (double), lo convierta a entero
usando casting y muestre ambos valores.
---
**Codigo**
```java
import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número a convertir en decimal(double): ");
        int numInt = sc.nextInt();
        double numDec = (double) numInt;
        System.out.println("El número en decimal es: " + numDec);
    }
}
```
**Salida esperada**
---
![](img/Ejercicio3.png)
---
## Ejercicio 4: Calculadora básica con operadores
**Enunciado**
Escribe un programa que pida dos enteros e imprima: suma, resta, multiplicación,
división entera y el residuo (módulo) de la división.
---
**Codigo**
```java
import java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el primer número: ");
        int priNum = sc.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int segNum = sc.nextInt();
        int suma = priNum + segNum;
        int resta = priNum - segNum;
        int multi = priNum * segNum;
        int divs = priNum / segNum;
        int modu = priNum % segNum;
        System.out.println("El suma de ambos números es: " + suma);
        System.out.println("La resta de ambos números es: " + resta);
        System.out.println("El multiplicación de ambos números es: " + multi);
        System.out.println("La divicion entre ambos números es: " + divs);
        System.out.println("El residuo de esa division es: " + modu);
    }
}
```
**Salida esperada**
---
![](img/Ejercicio4.png)
---
## Ejercicio 5: Mayor de edad (if-else)
**Enunciado**
Escribe un programa que pida la edad del usuario y muestre si es mayor o menor de
edad usando `if-else`.
---
**Codigo**
```java
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Cual es su edad: ");
        int edad = sc.nextInt();
        if (edad >= 18 ) {
            System.out.println("Hola, " + nombre + " usted es mayor de edad");
        } else {
            System.out.println("Hola, " + nombre + " usted es menor de edad");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio5.png)
---
## Ejercicio 6: Clasificación por rango de edad (if-else if)
**Enunciado**
Escribe un programa que pida la edad y muestre un mensaje según el rango:
- Menor de 13: “Eres un niño.”
- De 13 a 17: “Eres un adolescente.”
- De 18 a 64: “Eres un adulto.”
- 65 o más: “Eres un adulto mayor.”
---
**Codigo**
```java 
import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Cual es su edad: ");
        int edad = sc.nextInt();
        if (edad < 13 ) {
            System.out.println("Hola, " + nombre + " usted es un niño");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Hola, " + nombre + " usted es un adolescente");
        } else if (edad >= 18 && edad <= 64){
            System.out.println("Hola, " + nombre + " usted es un adulto");
        } else if (edad >= 65) {
            System.out.println("Hola, " + nombre + " usted es un adulto mayor");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio6.png)
---
## Ejercicio 7: Día de la semana (switch)
**Enunciado**
Escribe un programa que pida un número del 1 al 7 y muestre el día de la semana
correspondiente usando `switch`.
- 1: Lunes
- 2: Martes
- 3: Miércoles
- 4: Jueves
- 5: Viernes
- 6: Sábado
- 7: Domingo
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el número de la semana del 1 al 7");
        int dia = sc.nextInt();
        switch (dia) {
            case 1:
                System.out.println("El día es lunes");
                break;
            case 2:
                System.out.println("El día es martes");
                break;
            case 3:
                System.out.println("El día es miercoles");
                break;
            case 4:
                System.out.println("El día es jueves");
                break;
            case 5:
                System.out.println("El día es viernes");
                break;
            case 6:
                System.out.println("El día es sabado");
                break;
            case 7:
                System.out.println("El día es domingo");
                break;
            default:
                System.out.println("Opcion no disponible");
                break;
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio7.png)
---
## Ejercicio 8: Comparación de nombres con equalsIgnoreCase
**Enunciado**
Escribe un programa que pida al usuario su nombre y lo compare con un nombre
definido en el código (por ejemplo, `"Ricardo"`).
- Si coincide (ignorando mayúsculas/minúsculas) muestra: `Hola <nombre>,
bienvenido.`
- Si no coincide, muestra: `Hola <nombre>, tu nombre no coincide.`
Este ejercicio se parece a la **Parte 1 de la Actividad 2** de tu curso.
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su nombre: ");
        String nombre = sc.nextLine();
        String nomb = "ERICK";
        boolean comp = nombre.equalsIgnoreCase(nomb);
        if (comp == false){
            System.out.println("Hola " + nombre + ", tu nombre no coincide");
        } else if (comp == true){
            System.out.println("Hola " + nombre + ", tu nombre si coincide");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio8.png)
---
## Ejercicio 9: Clasificación de calificación (if-else y operadores lógicos)
**Enunciado**
Escribe un programa que pida una calificación entera de 0 a 100 y muestre:
- 90 a 100: “Excelente”
- 80 a 89: “Muy bien”
- 70 a 79: “Aprobado”
- 0 a 69: “Reprobado”
Si la calificación está fuera de ese rango, muestra: “Calificación inválida”.
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu calificación: ");
        int cal = sc.nextInt();
        if (cal <= 69 ) {
            System.out.println("Reprobado");
        } else if (cal >= 70 && cal <= 79) {
            System.out.println("Aprobado");
        } else if (cal >= 80 && cal <= 89){
            System.out.println("Muy bien");
        } else if (cal >= 90 && cal <= 100) {
            System.out.println("Excelente");
        } else {
            System.out.println("Calificacion inexistente");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio9.png)
---
## Ejercicio 10: Números pares en un rango (for + arreglo pequeño)
**Enunciado**
Escribe un programa que:
1. Pida un número entero **positivo** `n` (por ejemplo, máximo 10 para que sea
sencillo).
2. Genere los primeros `n` números pares empezando desde 2.
3. Guarde esos números en un arreglo.
4. Recorra el arreglo y muestre los números en una sola línea separados por
espacio.
Este ejercicio es una versión pequeña de la **Parte 2 de la Actividad 2** (pares y
arreglos).
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número positivo del 1 al 10: ");
        int n = sc.nextInt();
        int[] pares = new int[n];
        for (int i = 0; i < n; i++) {
            pares[i] = 2 * (i + 1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(pares[i] + " ");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio10.png)
---
# Ejercicios Java: comparación y operadores lógicos
Todos los ejercicios deben resolverse usando **estructuras de selección** (`if`,
`if-else`, `if-else if`, `switch`) y **operadores lógicos** (`&&`, `||`, `!`,
relacionales). No uses estructuras repetitivas todavía.
---
## Ejercicio 11: Número positivo o negativo
**Enunciado**
Escribe un programa que pida un número entero y muestre si es positivo, negativo o
cero usando `if-else if-else`.
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número: ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println("Su número es 0");
        } else if (num > 0) {
            System.out.println("Su número es positivo");
        } else if (num < 0) {
            System.out.println("Su número es negativo");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio11.png)
---
## Ejercicio 12: Par y dentro de rango
**Enunciado**
Escribe un programa que pida un número entero y verifique **dos condiciones**:
- Que sea par.
- Que esté entre 1 y 100 (inclusive).
Si se cumplen ambas, muestra: `El número es par y está entre 1 y 100.`
En otro caso, muestra: `El número NO cumple las condiciones.`
Usa operadores lógicos (`&&`).
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número: ");
        int num = sc.nextInt();
        if (num%2 == 0 && num>0 && num<=100){
            System.err.println("El número es par y esta entre 1 y el 100");
        } else {
            System.out.println("El número NO cumple con las condiones");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio12.png)
---
## Ejercicio 13: Edad válida y mayor de edad
**Enunciado**
Escribe un programa que pida una edad entera y verifique:
1. Que la edad esté en el rango 0 a 120.
2. Que sea mayor o igual a 18.
Si la edad es inválida (fuera de 0 a 120) muestra: `Edad inválida.`
Si es válida y mayor o igual a 18, muestra: `Edad válida y eres mayor de edad.`
Si es válida y menor a 18, muestra: `Edad válida y eres menor de edad.`
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Inserta tu edad: ");
        int edad = sc.nextInt();
        if (edad > 0 && edad <120){
            if (edad >= 18){
                System.out.println("Tu edad es valida y eres mayor de edad");
            } else if (edad < 18){
                System.out.println("Tu edad es valida y eres menor de edad");
            }
        } else {
            System.err.println("Edad invalida");
        }
    }
}

```
**Salida esperada**
---
![](img/Ejercicio13.png)
---
## Ejercicio 14: Acceso a sala por edad y credencial
**Enunciado**
Una sala de cine solo permite acceso si:
- La edad es mayor o igual a 15 **y**
- La persona tiene credencial de estudiante (`true` / `false`).
Pide la edad y luego pide si tiene credencial (puedes leer `"si"` o `"no"` y
convertir a un `boolean`).
Usa `&&` para decidir si puede pasar.
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTRADAS AL CINE");
        System.out.println("----------------");
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Tienes credencial (si/no): ");
        String op = sc.nextLine();
        if (op.equalsIgnoreCase("si") || op.equalsIgnoreCase("no")) {
            if (edad >= 15 && op.equalsIgnoreCase("si")) {
                System.out.println("Acceso permitido");
            } else {
                System.out.println("Acceso denegado");
            }
        } else {
            System.out.println("Opción no válida");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio14.png)
---
## Ejercicio 15: Usuario y contraseña correctos
**Enunciado**
En el código define dos `String` con usuario y contraseña correctos, por ejemplo:
- Usuario correcto: `"admin"`
- Contraseña correcta: `"1234"`
Pide al usuario que ingrese usuario y contraseña.
Usa operadores lógicos y comparación de cadenas (`equals`) para mostrar:
- `Acceso concedido.` si **ambos** coinciden.
- `Acceso denegado.` en cualquier otro caso.
---
**Codigo**
```java
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
```
**Salida esperada**
---
![](img/Ejercicio15.png)
---
## Ejercicio 16: Múltiplo de 3 o de 5
**Enunciado**
Escribe un programa que pida un número entero y determine:
- Si es múltiplo de 3 **o** de 5.
Si se cumple alguna de las dos condiciones, muestra: `Es múltiplo de 3 o de 5.`
En caso contrario, muestra: `No es múltiplo de 3 ni de 5.`
Usa el operador `||`.
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int num = sc.nextInt();
        if (num%3 == 0 || num%5 == 0) {
            System.out.println("Es multiplo de 3 o 5");
        } else {
            System.out.println("No es multiplo de 3 o 5");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio16.png)
---
## Ejercicio 17: Dentro de intervalo cerrado o abierto
**Enunciado**
Escribe un programa que pida un número decimal y determine si:
- Está en el intervalo **cerrado** [10, 20] (incluye 10 y 20).
- O está en el intervalo **abierto** (30, 40) (no incluye 30 ni 40).
Si está en alguno de los dos intervalos, muestra:
`El número está en uno de los intervalos válidos.`
Si no, muestra:
`El número está fuera de los intervalos.`
Usa operadores relacionales y `||`.
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        double num = sc.nextDouble();
        if (num >= 10.0 && num <= 20.0 || num > 30.0 && num < 40.0) {
            System.out.println("El número está en uno de los intervalos válidos");
        } else {
            System.out.println("El número esta fuera de los intervalos");
        }
    }
```
**Salida esperada**
---
![](img/Ejercicio17.png)
---
## Ejercicio 18: Clasificación de carácter
**Enunciado**
Escribe un programa que pida un solo carácter (puedes leer un `String` y tomar
`charAt(0)`) y determine si es:
- Una letra mayúscula (`'A'` a `'Z'`)
- Una letra minúscula (`'a'` a `'z'`)
- Un dígito (`'0'` a `'9'`)
- Otro símbolo cualquiera
Usa comparaciones de rangos con operadores lógicos (`&&`, `||`) y muestra solo uno
de los siguientes mensajes:
- `Es una letra mayúscula.`
- `Es una letra minúscula.`
- `Es un dígito.`
- `Es otro tipo de carácter.`
---
**Codigo**
```java
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
```
**Salida esperada**
---
![](img/Ejercicio18.png)
---
## Ejercicio 19: Aprobado, extraordinario o reprobado
**Enunciado**
Escribe un programa que pida una calificación entera de 0 a 100 y muestre:
- Si es menor a 0 o mayor a 100: `Calificación inválida.`
- Si está entre 70 y 100 (inclusive): `Aprobado.`
- Si está entre 60 y 69 (inclusive): `Extraordinario.`
- Si está entre 0 y 59 (inclusive): `Reprobado.`
Usa `if`, `else if` y operadores lógicos para los rangos.
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu calificación: ");
        int calf = sc.nextInt();
        if (calf == 0 || calf > 100) {
            System.out.println("Calificación invalida");
        } else if (calf >= 70 && calf <= 100) {
            System.out.println("Aprobado");
        } else if (calf >= 60 && calf <= 69) {
            System.out.println("Extraordinario");
        } else if (calf <= 59) {
            System.out.println("Reprobado");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio19.png)
---
## Ejercicio 20: Elegible para beca
**Enunciado**
Una universidad otorga beca si se cumplen las siguientes condiciones:
- Promedio mayor o igual a 85.
- Ingreso familiar mensual menor a 20,000.
- Y **no** tiene materias reprobadas (`true` / `false`).
Escribe un programa que pida promedio (double), ingreso (double) y si tiene
materias reprobadas (puedes leer `"si"`/`"no"` y convertirlo a `boolean`).
Usa operadores lógicos `&&` y `!` para mostrar:
- `Eres elegible para beca.` si se cumplen todas las condiciones.
- `No eres elegible para beca.` en caso contrario.
---
**Codigo**
```java
import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuál es su promedio?: ");
        int calif = sc.nextInt();
        System.out.print("¿Cuál es su ingreso familiar mensual?: ");
        int inger = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Tienes materias reprobadas?");
        String op = sc.nextLine();
        boolean opR = op.equalsIgnoreCase("si");

        if (calif >= 85 && inger < 20000 && !opR) {
            System.out.println("Eres elegible para beca.");
        } else {
            System.out.println("No eres elegible para beca.");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio20.png)
---
# Ejercicios Java difíciles: lógica sin ciclos
Usa todo lo visto: tipos de datos, casting, operadores aritméticos, relacionales y
lógicos, `String`, `if / if-else / if-else if` y `switch`. No uses estructuras
repetitivas.[page:1]
---
## Ejercicio 21: Ordenar tres números (solo condiciones)
**Enunciado**
Escribe un programa que pida tres números enteros distintos y muestre el mayor, el
del medio y el menor, usando solo `if-else if-else` y operadores lógicos. No puedes
usar ciclos ni arreglos.
**Codigo**
```java
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
```
**Salida esperada**
---
![](img/Ejercicio21.png)
---
## Ejercicio 22: Tipo de triángulo
**Enunciado**
Escribe un programa que pida tres lados de un triángulo (double) y determine si:
- Forman un triángulo válido (cada lado menor que la suma de los otros dos)
- Y, si es válido, si es: equilátero, isósceles o escaleno.
Usa combinaciones de `&&` y `||` para las comparaciones.
**Codigo**
```java
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
```
**Salida esperada**
---
![](img/Ejercicio22.png)
---
## Ejercicio 23: Validador de fecha simple
**Enunciado**
Escribe un programa que pida día, mes y año (enteros) y determine si la fecha es
válida considerando:
- Mes entre 1 y 12.
- Día entre 1 y 31.
- Para meses 4, 6, 9 y 11 el día máximo es 30.
- Para febrero (2) el día máximo es 28 (ignora años bisiestos para simplificar).
Usa `if-else if` y operadores lógicos anidados.
**Codigo**
```java
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
```
**Salida esperada**
---
![](img/Ejercicio23.png)
---
## Ejercicio 24: Calculadora de tarifa de luz
**Enunciado**
Una compañía de luz cobra según el consumo en kWh con las siguientes reglas:
- Menos de 100 kWh: tarifa baja.
- De 100 a 299 kWh: tarifa media.
- De 300 a 499 kWh: tarifa alta.
- 500 kWh o más: tarifa muy alta.
Pide el consumo (entero) y muestra el tipo de tarifa. Luego, según la tarifa,
calcula el monto aproximado usando estos costos:
- Baja: 2.0 por kWh
- Media: 2.5 por kWh
- Alta: 3.0 por kWh
- Muy alta: 3.5 por kWh
Usa `if-else if` y operadores lógicos, más operadores aritméticos.
**Codigo**
```java
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
```
**Salida esperada (ejemplo)**
---
![](img/Ejercicio24.png)
---
## Ejercicio 25: Clasificación de punto en el plano
**Enunciado**
Escribe un programa que pida las coordenadas `x` y `y` (double) de un punto y
determine:
- Si está en el origen (0,0).
- Si está sobre el eje X (y = 0, pero x != 0).
- Si está sobre el eje Y (x = 0, pero y != 0).
- Si está en el primer, segundo, tercer o cuarto cuadrante.
Usa operadores relacionales y lógicos para todas las condiciones.
**Codigo**
```java
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
```
**Salida esperada**
---
![](img/Ejercicio25.png)
---
## Ejercicio 26: Conversor de calificación numérica a letra con validación compleja
**Enunciado**
Convierte una calificación numérica (0 a 100) a calificación en letra con la
siguiente tabla:
- 90–100: A
- 80–89: B
- 70–79: C
- 60–69: D
- 0–59: F
Además:
- Si la calificación está fuera de 0 a 100, muestra: `Calificación inválida.`
- Si es menor de 70 pero mayor o igual a 60, agrega un mensaje extra: `Tienes
derecho a extraordinario.`
Usa `if-else if`, operadores lógicos y concatenación de `String`.
**Codigo**
```java
import java.util.Scanner;

public class ejercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu calificación de 0 a 100: ");
        int calf = sc.nextInt();
        if (calf > 100 || calf < 0) {
            System.out.println("Calificación invalida");
        } else if (calf >= 90 && calf <= 100) {
            System.out.println("Calificación: A");
        } else if (calf >= 80 && calf <= 89) {
            System.out.println("Calificación: B");
        } else if (calf >= 70 && calf <= 79) {
            System.out.println("Calificación: C");
        } else if (calf >= 60 && calf <= 69) {
            System.out.println("Calificación: D. Tienes derecho a extraordinario");
        } else if (calf >= 0 && calf <= 59) {
            System.out.println("Calificación: F");
        }
    }
}
```
**Salida esperada**
---
![](img/Ejercicio26.png)
---
## Ejercicio 27: Validador de contraseña fuerte
**Enunciado**
Pide una contraseña (`String`) y evalúa si es “fuerte” con reglas simplificadas:
- Longitud mínima: 8 caracteres.
- Debe contener al menos una letra mayúscula.
- Debe contener al menos una letra minúscula.
- Debe contener al menos un dígito.
No puedes usar ciclos, así que asume que el usuario solo usará contraseñas de
máximo 4 caracteres distintos repetidos varias veces y haz comprobaciones manuales
sobre los primeros caracteres con `charAt` y operadores lógicos (la idea es
forzarte a pensar la lógica sin for).
Si cumple las reglas (según tu lógica limitada), muestra: `Contraseña fuerte (según
las reglas simplificadas).`
Si no, muestra: `Contraseña débil.`
**Codigo**
```java
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
```
**Salida esperada (con tu lógica simplificada)**
---
![](img/Ejercicio27.png)
---
## Ejercicio 28: Simulador de atención médica
**Enunciado**
En una clínica se decide la prioridad de atención de un paciente según estos datos:
- Edad (entero).
- ¿Es emergencia? (`true` o `false`, puedes leer `"si"`/`"no"`).
- ¿Tiene enfermedad crónica? (`true` o `false`).
Reglas:
- Si es emergencia, siempre es “Prioridad máxima”.
- Si no es emergencia pero la edad es mayor o igual a 65 **o** tiene enfermedad
crónica, es “Prioridad alta”.
- En otro caso, “Prioridad normal”.
Usa `if-else` y operadores lógicos `||` y `&&`.
**Codigo**
```java
import java.util.Scanner;

public class ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("¿Es emergencia?(si/no): ");
        String opEmer = sc.nextLine();
        boolean emergencia = opEmer.equalsIgnoreCase("si");
        System.out.println("¿Tiene una enfermedad cronica?(si/no): ");
        String opCron = sc.nextLine();
        boolean cronica = opCron.equalsIgnoreCase("no");
        if (emergencia) {
            System.out.println("Prioridad máxima");
        } else if (edad >= 65 || cronica) {
            System.out.println("Prioridad alta");
        } else {
            System.out.println("Prioridad normal");
        }
        
    }
}
```
**Salida esperada**
---
![](img/Ejercicio28.png)
---
## Ejercicio 29: Cálculo de pago con múltiples descuentos
**Enunciado**
Una tienda ofrece los siguientes descuentos en la compra de un producto:
- Si el precio base es mayor o igual a 1000, aplica 10% de descuento.
- Si el cliente tiene membresía (`true`/`false`), aplica 5% adicional.
- Si es día especial (por ejemplo `"LUNES"` o `"VIERNES"`), aplica 3% adicional.
Las condiciones se pueden combinar (el descuento total es la suma de los
porcentajes).
Pide: precio base (double), si tiene membresía (`"si"`/`"no"`), y el día de la
semana (`String` en mayúsculas).
Calcula y muestra el **porcentaje total de descuento** y el **precio final a
pagar**.
**Codigo**
```java
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
```
**Salida esperada**
---
![](img/Ejercicio29.png)
---
## Ejercicio 30: Elegible para crédito bancario
**Enunciado**
Un banco decide si una persona es elegible para un crédito según estas reglas
complejas:
Pide:
- Edad (entero)
- Ingreso mensual (double)
- Historial crediticio bueno (`true`/`false`)
- ¿Tiene otras deudas grandes? (`true`/`false`)
Es elegible si:
1. La edad está entre 18 y 65 inclusive.
2. El ingreso mensual es mayor o igual a 15,000.
3. Tiene historial crediticio bueno.
4. Y **no** tiene otras deudas grandes.
Extra: si no cumple pero se queda **cerca** (por ejemplo ingreso entre 12,000 y
14,999 y sin deudas grandes, con historial bueno y edad válida), muestra: `Puedes
aplicar a revisión manual.`
En cualquier otro caso, muestra: `Crédito rechazado.`
Usa combinaciones de `&&`, `||` y `!` en una o varias estructuras `if-else`.
**Codigo**
```java
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

```
**Salida esperada**
---
![](img/Ejercicio30.png)

