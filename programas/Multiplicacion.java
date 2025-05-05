package programas;

import java.util.Scanner;

public class Multiplicacion {
    
    public static void multiplicación(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu primer numero:");
                int num4 = scanner.nextInt();
                System.out.print("Ingresa tu segundo numero:");
                int num5 = scanner.nextInt();

                System.out.println("El resultado de tu multiplicación es: " + (num4 * num5));
                
    }
}
