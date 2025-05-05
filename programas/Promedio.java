package programas;

import java.util.Scanner;

public class Promedio {
    public static void promedio(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num10 = scanner.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num11 = scanner.nextInt();
        System.out.print("Ingresa el tercer número: ");
        int num12 = scanner.nextInt();

        System.out.println("El promedio de tus tres numeros es: " + ((num10 + num11 + num12 ) / 3));
       
    }
}
