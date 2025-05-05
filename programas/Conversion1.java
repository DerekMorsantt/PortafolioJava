package programas;

import java.util.Scanner;

public class Conversion1 {
   public static void conversion1(){
     Scanner scanner = new Scanner(System.in);
     System.out.print("Ingresa los metros: ");
     double num18 = scanner.nextDouble();
     double num19 = num18 * 100;
     System.out.println("Tu conversion de metros a centimetros es: " + num19);
   } 
}
