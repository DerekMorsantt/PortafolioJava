package programas;

import java.util.Scanner;

public class DIvision {
    
    public static void division(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingresa tu primer numero:");
                int num6 = scanner.nextInt();
                System.out.print("Ingresa tu segundo numero:");
                int num7 = scanner.nextInt();
               
                if (num7 == 0) {
                    System.out.println("No se puede dividir entre 0");
                } else {
                    System.out.println("El resultado de tu división es: " + (num6 / num7));
                }
    }
}
