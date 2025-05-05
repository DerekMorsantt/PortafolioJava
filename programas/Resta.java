package programas;

import java.util.Scanner;

public class Resta {
    
    public static void restar(){
        Scanner scanNum = new Scanner(System.in);
        System.out.print("Ingresa tu primer numero:");
        int num2 = scanNum.nextInt();
        System.out.print("Ingresa tu segundo numero:");
        int num3 = scanNum.nextInt();

        System.out.println("El resultado de tu resta es: " + (num2 - num3));
        
    }
}
