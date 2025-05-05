package programas;

import java.util.Scanner;

public class Modulo {
    public static void modulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
                int num8 = scanner.nextInt();
                System.out.print("Ingresa el segundo número: ");
                int num9 = scanner.nextInt();

                if (num9 == 0) {
                System.out.println("No se puede calcular el módulo con 0");
                } else {
               System.out.println("El residuo de la división es: " + (num8 % num9));
                }
    }
}
