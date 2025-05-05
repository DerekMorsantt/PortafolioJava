package programas;

import java.util.Scanner;

public class Conversion2 {
    public static void conversion2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa los kilogramos: ");
                double num20 = scanner.nextDouble();
                double num21 = num20 * 1000;
                System.out.println("Tu conversion de kilogramos a gramos es: " + num21);
                
    }
}
