package programas;

import java.util.Scanner;

public class sumar {
    
    public static void suma(){

        Scanner scanNum = new Scanner(System.in);

        System.out.print("Ingresa tu primer numero:");
        int num = scanNum.nextInt();

        System.out.print("Ingresa tu segundo numero:");
        int num1 = scanNum.nextInt();

        System.out.println("El resultado de tu suma es: " + (num + num1));
              
        
    }
}
